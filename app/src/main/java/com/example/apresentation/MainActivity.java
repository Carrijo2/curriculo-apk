package com.example.apresentation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public TextView apresentarTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apresentarTexto = findViewById(R.id.textView6);

    }
    String conhecimentoTexto = "\n\nGestão de Marketing - UCB \n Desenvolvimento Android - Udemy \n Desenvolvimento web - Udemy \n Java - Udemy \n Inglês Basico - CILC";
    String experienciaTexto = "\n\nAuxiliar Administrativo - EBF \n Auxiliar de Compras - Gardem \n Desenvolvedor Java/Android Freelancer";
    String quemSouTexto = "\n\nDedicado ao trabalho e a familia, busco um emprego que consiga ser presente e me desenvolver como desenvolvedor.\n Sou esforçado, curioso, " +
            "batalhador e decidido.\n\n\n\n Me envie o desafio de teste de competencia.";

    public void mudarTextoConhecimento(View view){
        apresentarTexto.setText(conhecimentoTexto);
    }
    public void mudarTextoexperiencia(View view){
        apresentarTexto.setText(experienciaTexto);
    }
    public void mudarTextoQuemSou(View view){
        apresentarTexto.setText(quemSouTexto);
    }


}