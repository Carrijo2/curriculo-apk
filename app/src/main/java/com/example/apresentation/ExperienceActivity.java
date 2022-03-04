package com.example.apresentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.apresentation.adapter.Adapter;
import com.example.apresentation.model.Experience;

import java.util.ArrayList;
import java.util.List;

public class ExperienceActivity extends AppCompatActivity {


    private RecyclerView listaExperience;
    private List<Experience> listaExperiences = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience);

        listaExperience = findViewById(R.id.recyclerView);

        this.criarExperience();

        Adapter adapter = new Adapter( listaExperiences );

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        listaExperience.setLayoutManager( layoutManager);
        listaExperience.setHasFixedSize(true);
        listaExperience.setAdapter( adapter );

        listaExperience.addOnItemTouchListener(
                new RecycleritemClickListener(
                        getApplicationContext(),
                        listaExperience,
                        new RecycleritemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                Experience experience = listaExperiences.get(position);

                                Toast.makeText(getApplicationContext(),"Cargo: " + experience.getCargo(), Toast.LENGTH_SHORT).show();

                            }

                            @Override
                            public void onLongItemClick(View view, int position) {

                            }

                            @Override
                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                            }
                        }
                )
        );

    }

    public void criarExperience(){

        Experience experience = new Experience("AUXILIAR ADMINISTRATIVO", "1 Ano", "EBF", "Atividades de RH e DP para admissão de novos contratados e ambientação nas rotinas e horarios da empresa. ");
        this.listaExperiences.add(experience);
        experience = new Experience("AUXILIAR ADMINISTRATIVO", "7 Meses", "Gardem", "Compras de suprimentos e mantimentos para contratos com a NOVACAP, Cotações de preço para analise de compra e alcance do preço minimo para pregão eletronico. ");
        this.listaExperiences.add(experience);
        experience = new Experience("DESENVOLVEDOR WEB FREELANCE", "1 Ano e 3 Meses", "D&C", "Desenvolvimento de paginas web basicas com HTML, Css e bootstrap.");
        this.listaExperiences.add(experience);
        experience = new Experience("DESENVOLVEDOR ANDROID TESTE", "2 Meses", "D&C", "Desenvolvimento de aplicações Android usando AndroidStudio usando Java -  - Afinidade com RecycleView.");
        this.listaExperiences.add(experience);

    }

}