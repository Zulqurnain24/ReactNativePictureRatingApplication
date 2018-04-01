package com.example.zulqarnainafaq.manager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void btnRegistration_Click(View v) {

//        Intent i = new Intent(MainActivity.this, RegistrationActivity.class);
//        startActivity(1);
    }

    private void startActivity(int i) {
    }
}
