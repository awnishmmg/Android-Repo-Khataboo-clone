package com.pankaj.apienquiry.api;


import com.pankaj.apienquiry.model.UserCreateResponse;
import com.pankaj.apienquiry.model.Users;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api {

    //    @POST("createuser.php")
//    Call<UserCreateResponse> createUser(@FieldMap HashMap<String, String> user);  // data post from row mathod
    @FormUrlEncoded
    @POST("createuser.php")
    // String data=>get
    Call<UserCreateResponse> createUser(
            @Field("name") String name,
            @Field("email") String email,
            @Field("mobile") String mobile,
            @Field("password") String password
    );

//    @POST("createuser.php")
//        //Post form data
//    Call<UserCreateResponse> createUser(@Body Users user);


}
