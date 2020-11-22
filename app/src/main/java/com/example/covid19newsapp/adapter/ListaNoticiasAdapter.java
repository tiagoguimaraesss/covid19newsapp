package com.example.covid19newsapp.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.covid19newsapp.R;
import com.example.covid19newsapp.ResourcesUtil;
import com.example.covid19newsapp.model.News;

import java.util.List;

public class ListaNoticiasAdapter extends BaseAdapter {

    private final List<News> news;
    private final Context context;
    private View viewCriada;
    private News noticia;

    public ListaNoticiasAdapter(List<News> noticia, Context context) {
        this.news = noticia;
        this.context = context;
    }

    @Override
    public int getCount() {
        return news.size();
    }

    @Override
    public News getItem(int i) {
        return news.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        viewCriada = LayoutInflater.from(context).
                inflate(R.layout.item_noticia, parent, false);

        noticia = news.get(i);

        mostraImagem();
        mostraTitulo();

        return viewCriada;
    }

    private void mostraTitulo() {
        TextView tituloNoticia = viewCriada.findViewById(R.id.item_noticia_titulo);
        String titulo = noticia.getTitle();
        tituloNoticia.setText(titulo);
    }

    private void mostraImagem() {
        ImageView imagem = viewCriada.findViewById(R.id.item_noticia_imagem);
        Drawable drawableImagemPacote = ResourcesUtil.getDrawable(context, noticia.getImagem());
        imagem.setImageDrawable(drawableImagemPacote);
    }

}
