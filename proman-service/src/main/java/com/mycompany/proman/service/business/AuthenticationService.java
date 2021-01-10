package com.mycompany.proman.service.business;

import com.mycompany.proman.service.dao.UserDao;
import com.mycompany.proman.service.entity.UserAuthTokenEntity;
import com.mycompany.proman.service.entity.UserEntity;
import com.mycompany.proman.service.exception.AuthenticationFailedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.ZonedDateTime;

@Service
public class AuthenticationService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private PasswordCryptographyProvider cryptographyProvider;

    @Transactional(propagation = Propagation.REQUIRED)
    public UserAuthTokenEntity authenticate(final String username, final String password) throws AuthenticationFailedException {
        UserEntity userEntity = userDao.getUserByEmail(username);
        if(userEntity == null){
            throw new AuthenticationFailedException("AUTH-001","user with email-id "+username+" not found");
        }
        /*
            using encrypt method that gives encrypted password for comparision against the actual one.
         */
        String encryptedPassword = cryptographyProvider.encrypt(password,userEntity.getSalt());
        if(encryptedPassword.equalsIgnoreCase(userEntity.getPassword())){
            // creating a JWT Token for the password.
            JwtTokenProvider jwtTokenProvider = new JwtTokenProvider(encryptedPassword);
            UserAuthTokenEntity userAuthToken = new UserAuthTokenEntity(); // Entity class
            userAuthToken.setUser(userEntity);
            // token expiration time.
            final ZonedDateTime now = ZonedDateTime.now();
            final ZonedDateTime expiresAt = now.plusHours(8);
            userAuthToken.setAccessToken(jwtTokenProvider.generateToken(userEntity.getUuid(), now, expiresAt));

            userAuthToken.setLoginAt(now);
            userAuthToken.setExpiresAt(expiresAt);
            userAuthToken.setCreatedBy("api-backend");
            userAuthToken.setCreatedAt(now);
            userEntity.setLastLoginAt(now);

            userDao.createAuthToken(userAuthToken);
            userDao.updateUser(userEntity);

            return userAuthToken;
        }else{
            throw new AuthenticationFailedException("AUTH-002","username or password is invalid");
        }
    }
}
