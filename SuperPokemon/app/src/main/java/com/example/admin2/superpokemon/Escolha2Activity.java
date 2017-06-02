package com.example.admin2.superpokemon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Escolha2Activity extends AppCompatActivity {
    private Button btn_velocidade1;
    private Button btn_forca1;
    private Button btn_inteligencia1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_escolha2);
        btn_velocidade1 = (Button) findViewById(R.id.btn_velocidade1);
        btn_velocidade1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ir = new Intent(getBaseContext(), Velocidade2Activity.class);
                startActivity(ir);
            }
        });
        btn_forca1 = (Button) findViewById(R.id.btn_forca1);
        btn_forca1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ir = new Intent(getBaseContext(), Forca2Activity.class);
                startActivity(ir);
            }
        });
        btn_inteligencia1 = (Button) findViewById(R.id.btn_inteligencia1);
        btn_inteligencia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ir = new Intent(getBaseContext(), Inteligencia2Activity.class);
                startActivity(ir);
            }
        });
    }
}
