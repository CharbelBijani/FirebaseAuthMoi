package com.example.firebaseauthmoi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {

    /**variables globales **/
    View tv_email;
    View tv_password;
    Button btn_Register;

    /** initialisation **/
    private void initUi(){
        tv_email=findViewById(R.id.tv_Email);
        tv_password=findViewById(R.id.tv_Password);
        btn_Register=findViewById(R.id.btn_Register);
    }

    public void register(View view){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        /** recuperation de la valeur de l'intent **/
        Intent intent = getIntent();
        String titre = intent.getStringExtra("TitrePage");
        setTitle(titre);

        initUi();

    }
}