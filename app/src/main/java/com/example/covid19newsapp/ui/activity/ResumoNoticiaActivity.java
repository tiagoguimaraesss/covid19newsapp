package com.example.covid19newsapp.ui.activity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.covid19newsapp.R;
import com.example.covid19newsapp.ResourcesUtil;
import com.example.covid19newsapp.model.News;

import static com.example.covid19newsapp.Cons.CHAVE_NOTICIA;

public class ResumoNoticiaActivity extends AppCompatActivity {

    private News news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resumo_noticia_activity);

        carregaNoticia();
    }

    private void preencheCampos(News news) {
        TextView localPacote = findViewById(R.id.resumo_noticia_titulo);
        localPacote.setText(news.getTitle());

        ImageView imagemPacote = findViewById(R.id.resumo_noticia_imagem);
        Drawable drawableDoPacote = ResourcesUtil.getDrawable(this, news.getImagem());
        imagemPacote.setImageDrawable(drawableDoPacote);

        TextView dias = findViewById(R.id.resumo_noticia_descricao);
        String diasEmTexto = news.getDesc();
        dias.setText(diasEmTexto);
    }

    private void carregaNoticia() {
        Intent dados = getIntent();
        if(dados.hasExtra(CHAVE_NOTICIA)) {
            setTitle("Resumo da Noticia");
            news = (News) dados.getSerializableExtra(CHAVE_NOTICIA);
            preencheCampos(news);
        }
    }

}
