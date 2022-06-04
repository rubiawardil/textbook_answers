package com.textbookanswers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.getSupportActionBar().hide();

    }

    public void entrar(View view){
        startActivity(new Intent(this,MainActivity.class));
    }

    public void cadastrar(View view){
        startActivity(new Intent(this,SignIn.class));
    }
}