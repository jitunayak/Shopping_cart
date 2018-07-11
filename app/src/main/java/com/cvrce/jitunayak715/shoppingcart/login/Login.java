package com.cvrce.jitunayak715.shoppingcart.login;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import com.cvrce.jitunayak715.shoppingcart.R;
import com.cvrce.jitunayak715.shoppingcart.TabLayout.MainActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {

    Button login;
    Button signup;
    Button google_signin_button;
    FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        signup =findViewById(R.id.signup_id);
        login = findViewById(R.id.login_id);
        google_signin_button =findViewById(R.id.google_signin_id);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              ShowRegistrationForm();
                
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowLogin();
            }
        });

        google_signin_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                google_signin();
            }
        });
    }

    private void google_signin() {

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

    }


    private void ShowLogin() {

        AlertDialog.Builder dialog =new AlertDialog.Builder(this);
        dialog.setTitle("LOGIN");

        LayoutInflater inflater = LayoutInflater.from(this);
        View register_layout = inflater.inflate(R.layout.account_login,null);

        dialog.setView(register_layout);
        dialog.setCancelable(false);
        dialog.setPositiveButton("forgot password", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        dialog.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();
            }
        });
        dialog.show();


    }

    private void ShowRegistrationForm() {

        AlertDialog.Builder dialog =new AlertDialog.Builder(this);
        dialog.setTitle("Register");
        //dialog.setMessage("get your account today");

        LayoutInflater inflater = LayoutInflater.from(this);
        View register_layout = inflater.inflate(R.layout.account_register,null);

        dialog.setView(register_layout);
        dialog.setCancelable(false);
        dialog.setPositiveButton("REGISTER", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Intent it =new Intent(getApplicationContext(),MainActivity.class);
                startActivity(it);

            }
        });
        dialog.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();
            }
        });
        dialog.show();

    }
}
