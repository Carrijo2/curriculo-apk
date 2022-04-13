package com.example.apresentation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public TextView apresentarTexto;
    private Button buttonExperience;
    private Button buttonConhecimento;
    private Button buttonQuemSou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apresentarTexto = findViewById(R.id.textView6);
        buttonExperience = findViewById(R.id.button2);

        buttonExperience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), ExperienceActivity.class );

                startActivity( intent );

            }
        });

        buttonConhecimento = findViewById(R.id.button1);
        buttonConhecimento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), ConhecimentosActivity.class);

                startActivity( intent );

            }
        });

        buttonQuemSou = findViewById(R.id.button3);
        buttonQuemSou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), QuemSouActivity.class);

                startActivity( intent );

            }
        });


    }

    String experienciaTexto = "\n\nAuxiliar Administrativo - EBF \n Auxiliar de Compras - Gardem \n Desenvolvedor Java/Android Freelancer";
    String quemSouTexto = "\n\nDedicado ao trabalho e a familia, busco um emprego que consiga ser presente e me desenvolver como programador.\n Sou esforçado, curioso, " +
            "batalhador e decidido.\n\n\n\n Me envie o desafio de teste de competencia.";

    public void mudarTextoexperiencia(View view){
        apresentarTexto.setText(experienciaTexto);
    }
    public void mudarTextoQuemSou(View view){
        apresentarTexto.setText(quemSouTexto);
    }


}