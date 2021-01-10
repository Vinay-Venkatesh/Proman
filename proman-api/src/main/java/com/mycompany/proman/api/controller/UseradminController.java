package com.mycompany.proman.api.controller;

import com.mycompany.proman.api.model.CreateUserRequest;
import com.mycompany.proman.api.model.CreateUserResponse;
import com.mycompany.proman.api.model.UserDetailsResponse;
import com.mycompany.proman.api.model.UserStatusType;
import com.mycompany.proman.service.business.UseradminService;
import com.mycompany.proman.service.entity.UserEntity;
import com.mycompany.proman.service.exception.ResourceNotFoundException;
import com.mycompany.proman.service.exception.UnauthorizedException;
import com.mycompany.proman.service.type.UserStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.UUID;

@RestController
@RequestMapping("/")
public class UseradminController {

    @Autowired
    private UseradminService useradminService;

    @RequestMapping(method= RequestMethod.GET,path = "/users/{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<UserDetailsResponse> getUser(@PathVariable("id") final String userUUID,
                                                       @RequestHeader("authorization") final String authorization) throws ResourceNotFoundException, UnauthorizedException {
        // ResourceNotFoundException invokes RestException resourceNotFoundException method..
        final UserEntity userEntity = useradminService.getUser(userUUID,authorization);
        UserDetailsResponse userDetailsResponse = new UserDetailsResponse()
                .id(userEntity.getUuid())
                .firstName(userEntity.getFirstName())
                .lastName(userEntity.getLastName())
                .emailAddress(userEntity.getEmail())
                .mobileNumber(userEntity.getMobilePhone())
                .status(UserStatusType.valueOf(UserStatus.getEnum(userEntity.getStatus()).name()));

        //Return type is of ResponseEntity object..
        return new ResponseEntity<UserDetailsResponse>(userDetailsResponse,HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST,path = "/users",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CreateUserResponse> createUser(@RequestBody final CreateUserRequest userRequest){
        UserEntity userEntity = new UserEntity();
        userEntity.setUuid(UUID.randomUUID().toString());
        userEntity.setFirstName(userRequest.getFirstName());
        userEntity.setLastName(userRequest.getLastName());
        userEntity.setEmail(userRequest.getEmailAddress());
        userEntity.setMobilePhone(userRequest.getMobileNumber());
        userEntity.setStatus(UserStatus.ACTIVE.getCode());
        userEntity.setCreatedAt(ZonedDateTime.now());
        userEntity.setCreatedBy("api-backend");

        final UserEntity createdUser = useradminService.createUser(userEntity);
        CreateUserResponse createdUserResponse = new CreateUserResponse().id(createdUser.getUuid()).status(UserStatusType.ACTIVE);
        return new ResponseEntity<CreateUserResponse>(createdUserResponse,HttpStatus.CREATED);
    }
}
