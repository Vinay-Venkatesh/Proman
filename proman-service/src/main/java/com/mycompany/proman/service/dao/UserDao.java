package com.mycompany.proman.service.dao;

import com.mycompany.proman.service.entity.UserAuthTokenEntity;
import com.mycompany.proman.service.entity.UserEntity;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

@Repository
public class UserDao {
    @PersistenceContext // container managed
    EntityManager entityManager; // provided by dependency spring-boot-starter-data-jpa
    public UserEntity createUser(UserEntity entity){
        entityManager.persist(entity);
        return entity;
    }

    public UserEntity getUser(final String userUuid){
        try{
            return entityManager
                    .createNamedQuery("userByUuid",UserEntity.class) // userByUuid - In UserEntity.Java
                    .setParameter("uuid",userUuid) // uuid - In UserEntity.Java - where .... :uuid(dynamic param)
                    // userUuid - Incoming parameter..
                    .getSingleResult();
        }catch (NoResultException nre){
            return null;
        }
    }

    public UserEntity getUserByEmail(final String email){
        try{
            return entityManager
                    .createNamedQuery("userByEmail",UserEntity.class) // userByEmail - In UserEntity.Java
                    .setParameter("email",email) // uuid - In UserEntity.Java - where .... :email(dynamic param)
                    // email - Incoming parameter..
                    .getSingleResult();
        }catch (NoResultException nre){
            return null;
        }
    }

    public UserAuthTokenEntity createAuthToken(final UserAuthTokenEntity userAuthTokenEntity){
        entityManager.persist(userAuthTokenEntity);
        return userAuthTokenEntity;
    }

    public void updateUser(final UserEntity updatedUserEntity){
        entityManager.merge(updatedUserEntity);
    }

    public UserAuthTokenEntity getUserAuthTokenEntity(final String userAuthToken){
        try {
            return entityManager.createNamedQuery("userAuthTokenByAccessToken", UserAuthTokenEntity.class)
                    .setParameter("accessToken", userAuthToken)
                    .getSingleResult();
        }catch (NoResultException nre){
            return null;
        }
    }
}
