package com.uniso.lpdm.apprestaurante;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class RestauranteMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_restaurante);
    }

    public void onClickRegistrarPedido(View view) {
        TextView tvM = (TextView)findViewById(R.id.tvMessage);
        tvM.setText("Total de Horas");
    }

    public void onClickConsultarTotalHoras(View view) {
        Intent acessarTimer = new Intent(this, TimerActivity.class);

        startActivity(acessarTimer);
    }

    public void onClickAcessarMensageiro(View view) {
        Intent enviarMensagem = new Intent(this, EnviarMensagemActivity.class);

        startActivity(enviarMensagem);
    }
}