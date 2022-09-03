package com.pankaj.apienquiry.model;

public class Users {
    private int id;
    private String name;
    private String email;
    private String mobile;
    private String password;
    private String date_time;
    private int is_login;
    private int status;
    private String token;

    public Users(String name, String email, String mobile, String password) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getMobile() {
        return mobile;
    }

    public String getDate_time() {
        return date_time;
    }

    public int getIs_login() {
        return is_login;
    }

    public int getStatus() {
        return status;
    }

    public String getToken() {
        return token;
    }
}