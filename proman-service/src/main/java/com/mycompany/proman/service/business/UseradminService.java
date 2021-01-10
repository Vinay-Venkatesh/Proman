package com.mycompany.proman.service.business;

import com.mycompany.proman.service.dao.UserDao;
import com.mycompany.proman.service.entity.RoleEntity;
import com.mycompany.proman.service.entity.UserAuthTokenEntity;
import com.mycompany.proman.service.entity.UserEntity;
import com.mycompany.proman.service.exception.ResourceNotFoundException;
import com.mycompany.proman.service.exception.UnauthorizedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UseradminService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private PasswordCryptographyProvider cryptographyProvider;

    public UserEntity getUser(final String userUuid,final String userAuthToken) throws ResourceNotFoundException, UnauthorizedException {
        UserAuthTokenEntity userToken = userDao.getUserAuthTokenEntity(userAuthToken);
        RoleEntity role = userToken.getUser().getRole();
        // Only Admin users are allowed to fetch user details - 101 is the uid for admin users in database..
        if(role != null || role.getUuid() == 101){
            UserEntity userEntity = userDao.getUser(userUuid);
            if(userEntity == null){
                throw new ResourceNotFoundException("USR-001","User not found!!");
            }
            return userEntity;
        }
        throw new UnauthorizedException("ATH-002", "you are not authorized to fetch user details");
    }

    /* Signup service and admin user uses this method to create a new user */
    @Transactional(propagation = Propagation.REQUIRED)
    public UserEntity createUser(final UserEntity userEntity){
        String password = userEntity.getPassword();
        if(password == null){
            userEntity.setPassword("proman@123"); // default Password for new user
        }
        String[] encryptedText = cryptographyProvider.encrypt(userEntity.getPassword());
        userEntity.setSalt(encryptedText[0]);
        userEntity.setPassword(encryptedText[1]);
        return userDao.createUser(userEntity);
    }
}
