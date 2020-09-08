package com.uniso.lpdm.apprestaurante;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tvM = (TextView)findViewById(R.id.tvMessage);
        final Button btFP = (Button)findViewById(R.id.bFazerPedido);
        final Button btTH = (Button)findViewById(R.id.bTotalHoras);

        btFP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvM.setText("Registrando Pedido");
            }
        });

        btTH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvM.setText("Total de Horas");
            }
        });
    }
}