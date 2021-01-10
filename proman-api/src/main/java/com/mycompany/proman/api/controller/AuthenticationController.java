package com.mycompany.proman.api.controller;

import com.mycompany.proman.api.model.AuthorizedUserResponse;
import com.mycompany.proman.service.business.AuthenticationService;
import com.mycompany.proman.service.entity.UserAuthTokenEntity;
import com.mycompany.proman.service.entity.UserEntity;
import com.mycompany.proman.service.exception.AuthenticationFailedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Base64;
import java.util.UUID;

@RestController
@RequestMapping("/")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @RequestMapping(method = RequestMethod.POST, path = "auth/login", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<AuthorizedUserResponse> login(@RequestHeader("authorization") final String authorization) throws AuthenticationFailedException {
        /* Basic asdewdasceasdaisdiebdenceunudbas==
           username:passowrd --> base64 encoded format..
         */
        byte[] decode = Base64.getDecoder().decode(authorization.split("Basic")[1].replace(" ",""));// extracting the second field from the above eg..
        String decodedText = new String(decode);
        String[] decodedArray = decodedText.split(":"); //username:password

        UserAuthTokenEntity userAuthTokenEntity = authenticationService.authenticate(decodedArray[0], decodedArray[1]);
        UserEntity user = userAuthTokenEntity.getUser();

        AuthorizedUserResponse authorizedUserResponse =  new AuthorizedUserResponse().id(UUID.fromString(user.getUuid()))
                .firstName(user.getFirstName()).lastName(user.getLastName())
                .emailAddress(user.getEmail()).mobilePhone(user.getMobilePhone())
                .lastLoginTime(user.getLastLoginAt());

        // passing access-token in headers (good practice)
        HttpHeaders headers = new HttpHeaders();
        headers.add("access-token", userAuthTokenEntity.getAccessToken());

        return new ResponseEntity<AuthorizedUserResponse>(authorizedUserResponse,headers, HttpStatus.OK);
    }
}
