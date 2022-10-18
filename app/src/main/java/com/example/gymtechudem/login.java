package com.example.gymtechudem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity {

    Button btnLogin;
    TextView tvSincuenta;
    EditText txtEmailLogin;
    EditText txtContraseñaLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        conectar();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(getApplicationContext(), registro.class);
                startActivity(i1);
            }
        });

        tvSincuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(getApplicationContext(), registro.class);
                startActivity(i2);
            }
        });
    }

    private void conectar(){
        btnLogin=findViewById(R.id.btnLogin);
        tvSincuenta=findViewById(R.id.tvSincuenta);
        txtEmailLogin=findViewById(R.id.txtEmailLogin);
        txtContraseñaLogin=findViewById(R.id.txtContraseñaLogin);
    }
}