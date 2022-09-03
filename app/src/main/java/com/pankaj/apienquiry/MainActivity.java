package com.pankaj.apienquiry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.pankaj.apienquiry.api.RetrofitClient;
import com.pankaj.apienquiry.model.UserCreateResponse;
import com.pankaj.apienquiry.model.Users;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private EditText et_email, et_name, et_mobile, et_password;
    private static final String TAG = "MainActivityTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_email = (EditText) findViewById(R.id.et_email);
        et_name = (EditText) findViewById(R.id.et_name);
        et_mobile = (EditText) findViewById(R.id.et_mobile);
        et_password = (EditText) findViewById(R.id.et_password);
    }

    public void addEnquiry(View view) {
        String name = et_name.getText().toString().trim();
        String email = et_email.getText().toString().trim();
        String mobile = et_mobile.getText().toString().trim();
        String password = et_password.getText().toString().trim();

        //Retrofit
        Call<UserCreateResponse> call = RetrofitClient
                .getInstance()
                .getAPI()
                .createUser(name, email, mobile, password);

        call.enqueue(new Callback<UserCreateResponse>() {
            @Override
            public void onResponse(Call<UserCreateResponse> call, Response<UserCreateResponse> response) {
                if (response.isSuccessful()) {

                    UserCreateResponse users = response.body();
                    Log.d(TAG, "onResponse() called with: call = [" + call + "], response = [" + response + "]");
                    Toast.makeText(MainActivity.this, "success" + users.getMessage(), Toast.LENGTH_SHORT).show();

                }

            }

            @Override
            public void onFailure(Call<UserCreateResponse> call, Throwable t) {
                Log.d(TAG, "onFailure() called with: call = [" + call + "], t = [" + t + "]");
                Toast.makeText(MainActivity.this, "failed " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}