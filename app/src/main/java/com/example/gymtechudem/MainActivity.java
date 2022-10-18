package com.example.gymtechudem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ProgressBar p;
    int progreso = 0;
    Handler handler=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        conectar();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (progreso < 100){
                    progreso = progreso + 5;

                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            p.setProgress(progreso);
                            if (progreso==100){
                                Toast.makeText(MainActivity.this, "Carga completa, iniciando app", Toast.LENGTH_LONG).show();
                                Intent i=new Intent(getApplicationContext(), login.class);
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                startActivity(i);
                            }
                            //text
                        }
                    });
                    try {
                        Thread.sleep(200);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    private void conectar(){
        p=findViewById(R.id.progressbar);
    }
}