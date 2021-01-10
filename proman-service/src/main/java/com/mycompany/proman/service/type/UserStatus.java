/*
    This method is used to transform the status code returned by database to readable string.
 */
package com.mycompany.proman.service.type;

import java.util.HashMap;
import java.util.Map;

public enum UserStatus {

    ACTIVE(1) , INACTIVE(0), LOCKED(2),REGISTERED(4);

    private static final Map<Integer, UserStatus> Lookup = new HashMap<>();

    static{
        for(UserStatus userStatus : UserStatus.values()){
            Lookup.put(userStatus.getCode(), userStatus);
        }
    }
    private final int code;
    private  UserStatus(final int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    public static UserStatus getEnum(final int code){
        return Lookup.get(code);
    }
}
