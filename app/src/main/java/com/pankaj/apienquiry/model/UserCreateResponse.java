package com.pankaj.apienquiry.model;

import androidx.annotation.Nullable;

import java.util.List;

public class UserCreateResponse {
    private String code;
    private String message;
    private boolean status;
//    private List<Users> data= null;
    private boolean error;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public boolean isStatus() {
        return status;
    }

//    public  List<Users> getData() {
//        return data;
//    }


    public boolean isError() {
        return error;
    }
}
