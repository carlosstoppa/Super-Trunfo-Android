package com.example.admin2.superpokemon;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Jogada1Activity extends AppCompatActivity {
    private TextView tv_valor;
    private ImageView iv_computador;
    private TextView tv_velocidade_computador;
    private static int TEMPO = 9000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_jogada);
        tv_valor = (TextView) findViewById(R.id.tv_valor);
        iv_computador = (ImageView) findViewById(R.id.iv_computador);
        tv_velocidade_computador = (TextView) findViewById(R.id.tv_velocidade_computador);
        //
        Intent i = getIntent();
        Bundle valor = i.getExtras();

        String getValor = (String) valor.get("valor");
        int valorJogador = Integer.valueOf(getValor);
        tv_valor.setText(getValor);

        int escolhaComputador = (int) (Math.random()*100)+1;
        int personagemComputador = (int) (Math.random()*3)+1;

        if(personagemComputador == 1){
            iv_computador.setImageResource(R.drawable.c1);
        }else if(personagemComputador == 2){
            iv_computador.setImageResource(R.drawable.c2);
        }else if(personagemComputador == 3) {
            iv_computador.setImageResource(R.drawable.c3);
        }
        else if(personagemComputador == 4) {
            iv_computador.setImageResource(R.drawable.c4);
        }

        tv_velocidade_computador.setText(Integer.toString(escolhaComputador));

        if(escolhaComputador == valorJogador){
            Toast.makeText(getBaseContext(),
                    "EMPATE",Toast.LENGTH_LONG).show();
        }else if(escolhaComputador < valorJogador){
            Toast.makeText(getBaseContext(),
                    "JOGADOR GANHOU",Toast.LENGTH_LONG).show();
            Score.score += 560;
        }else{
            Toast.makeText(getBaseContext(),
                    "JOGADOR PERDEU",Toast.LENGTH_LONG).show();
            Score.score -= 260;
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getBaseContext(), MenuActivity.class);
                startActivity(i);
                finish();
            }
        },TEMPO);

    }
}
