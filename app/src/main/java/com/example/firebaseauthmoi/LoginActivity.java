package com.example.firebaseauthmoi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    /**variables globales **/
    TextView tv_email;
    TextView tv_password;
    Button btn_Login;
    TextView tv_titre;

    /** initialisation **/
    private void initUi(){
        tv_email=findViewById(R.id.tv_Email);
        tv_password=findViewById(R.id.tv_Password);
        tv_titre=findViewById(R.id.tv_titre);
        btn_Login=findViewById(R.id.btn_confirm);
    }

    public void login(View view){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_register);

        /** recuperation de la valeur de l'intent **/
        Intent intent = getIntent();
        String titre = intent.getStringExtra("TitrePage");
        setTitle(titre);

        initUi();
        btn_Login.setText(titre);
        tv_titre.setText(titre);

        btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent1);
            }
        });

    }
}