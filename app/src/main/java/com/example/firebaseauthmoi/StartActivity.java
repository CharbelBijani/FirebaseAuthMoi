package com.example.firebaseauthmoi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    /** variables globales **/
    Button btn_Login, btn_Register;

    /** initialisation et fbi des variables **/
    private void initUI(){
        btn_Login=findViewById(R.id.btn_Login);
        btn_Register=findViewById(R.id.btn_Register);
    }

    public void login(View view){
        Intent intent = new Intent(StartActivity.this, LoginActivity.class);
        String titre=btn_Login.getText().toString();
        intent.putExtra("TitrePage", titre);
        startActivity(intent);
    }

    public void register(View view){
        Intent intent = new Intent(StartActivity.this, RegisterActivity.class);
        String titre=btn_Register.getText().toString();
        intent.putExtra("TitrePage", titre);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        initUI();
    }

}