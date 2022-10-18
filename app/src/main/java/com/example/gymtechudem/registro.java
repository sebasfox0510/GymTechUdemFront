package com.example.gymtechudem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class registro extends AppCompatActivity {

    Button btnRegistro;
    EditText txtNombre;
    EditText txtApellido;
    EditText txtEmail;
    EditText txtContraseña;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        conectar();

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), login.class);
                startActivity(i);
            }
        });
    }

    private void conectar(){
        btnRegistro=findViewById(R.id.btnRegistro);
        txtNombre=findViewById(R.id.txtNombre);
        txtApellido=findViewById(R.id.txtApellido);
        txtEmail=findViewById(R.id.txtEmail);
        txtContraseña=findViewById(R.id.txtContraseña);
    }
}