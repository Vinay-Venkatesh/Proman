package com.mycompany.proman.service.business;

import com.mycompany.proman.service.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SignupService {

    @Autowired
    private UseradminService useradminService;

    /*
       database call - @Transactional
       to ensure that the service invokes transaction for db operations & is completed successfully if not rollback the transaction
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public UserEntity signup(UserEntity userEntity){
        return useradminService.createUser(userEntity);
    }
}
