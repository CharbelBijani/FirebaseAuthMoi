package com.example.firebaseauthmoi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {

    /**variables globales **/
    TextView tv_email;
    TextView tv_password;
    Button btn_Register;
    TextView tv_titre;
    FirebaseAuth userAuth;

    /** initialisation **/
    private void initUi(){
        tv_email=findViewById(R.id.tv_Email);
        tv_password=findViewById(R.id.tv_Password);
        tv_titre=findViewById(R.id.tv_titre);
        btn_Register=findViewById(R.id.btn_confirm);
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
        btn_Register.setText(titre);
        tv_titre.setText(titre);

        btn_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // createUserWithEmailAndPassword

                Intent intent1 = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent1);
            }
        });

    }
}