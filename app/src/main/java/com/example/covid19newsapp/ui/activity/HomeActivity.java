package com.example.covid19newsapp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.covid19newsapp.R;
import com.example.covid19newsapp.adapter.ListaNoticiasAdapter;
import com.example.covid19newsapp.dto.NewsDAO;
import com.example.covid19newsapp.model.News;

import java.util.List;

import static com.example.covid19newsapp.Cons.CHAVE_NOTICIA;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen_activity);
        configureList();
    }

    private void configureList() {
        ListView listaDeNoticias = findViewById(R.id.lista_noticia_listview);
        List<News> news = new NewsDAO().lista();
        listaDeNoticias.setAdapter(new ListaNoticiasAdapter(news, this));
        configuraListenerDeCliquePorItem(listaDeNoticias);
    }

    private void configuraListenerDeCliquePorItem(ListView noticiasLista) {
        noticiasLista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int indice, long id) {
                News newsEscolhida = (News) adapterView.getItemAtPosition(indice);
                abreResumoNewsEscolhida(newsEscolhida);
            }
        });
    }

    private void abreResumoNewsEscolhida(News news) {
        Intent vaiParaFormActtivity = new Intent(HomeActivity.this, ResumoNoticiaActivity.class);
        vaiParaFormActtivity.putExtra(CHAVE_NOTICIA, news);
        startActivity(vaiParaFormActtivity);
    }

}
