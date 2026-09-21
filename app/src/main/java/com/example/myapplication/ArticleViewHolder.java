package com.example.myapplication;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class ArticleViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView txtTitle;
    TextView txtContent;
    TextView txtView;
    ImageView imgCover;
    private ArticleAdapter adapter;
    public ArticleViewHolder(
            @NonNull View itemView,
            ArticleAdapter adapter) {

        super(itemView);

        this.adapter = adapter;

        txtTitle = itemView.findViewById(R.id.txtTitle);
        txtContent = itemView.findViewById(R.id.txtContent);
        txtView = itemView.findViewById(R.id.txtView);
        imgCover = itemView.findViewById(R.id.imgCover);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        int position = getAdapterPosition();

        if (position != RecyclerView.NO_POSITION) {

            Intent intent = new Intent(
                    view.getContext(),
                    DetailActivity.class
            );

            intent.putExtra("position", position);
            view.getContext().startActivity(intent);
        }
    }
}
