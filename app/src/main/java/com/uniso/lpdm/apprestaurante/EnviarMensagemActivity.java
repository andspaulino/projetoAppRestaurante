package com.uniso.lpdm.apprestaurante;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class EnviarMensagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar_mensagem);
    }

    public void onClickEnviarMensagem(View view) {
        EditText editText = (EditText)findViewById(R.id.editMensagem);
        String mensagem = editText.getText().toString();

        Intent intencao = new Intent(Intent.ACTION_SEND);
        intencao.setType("text/plain");
        intencao.putExtra(Intent.EXTRA_TEXT, mensagem);


        startActivity(intencao);
    }
}