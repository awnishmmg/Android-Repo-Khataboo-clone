package com.pankaj.apienquiry.model;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class UserCreateResponse {
    private int code;
    private String message;
    private boolean status;
    private ArrayList<Users> data = null;
    private boolean error;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public boolean isStatus() {
        return status;
    }

    public ArrayList<Users> getData() {
        return data;
    }


    public boolean isError() {
        return error;
    }
}
