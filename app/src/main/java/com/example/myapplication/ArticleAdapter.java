package com.example.myapplication;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ArticleAdapter extends RecyclerView.Adapter<ArticleViewHolder> {
    private Context context;
    private ArrayList<Article> articles;

    public ArticleAdapter(Context context, ArrayList<Article> articles) {
        this.context = context;
        this.articles = articles;
    }
    @NonNull
    @Override
    public ArticleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(
                        R.layout.item_article,
                        parent,
                        false
                );

        return new ArticleViewHolder(view, this);
    }


    @Override
    public void onBindViewHolder(
            @NonNull ArticleViewHolder holder,
            int position) {

        Article article = articles.get(position);

        holder.txtTitle.setText(
                article.getTitle()
        );

        holder.txtContent.setText(
                article.getContent()
        );

        holder.txtView.setText(
                "Views: " + article.getView()
        );

        int imageId = context.getResources()
                .getIdentifier(
                        article.getImgCover(),
                        "drawable",
                        context.getPackageName()
                );
        if (imageId != 0) {holder.imgCover.setImageResource(imageId);
        }
    }

    @Override
    public int getItemCount() {
        return articles.size();
    }
}
