package com.example.sushil.ubs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_page);
    }

    public void registerUser(View view){
        Intent intent=new Intent(this, Register.class);
        startActivity(intent);
    }
    public void logIn(View view, String username, String password){

    }









}
