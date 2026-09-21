package com.example.myapplication;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    private ImageView imgCoverDetail;
    private TextView txtTitleDetail;
    private TextView txtContentDetail;
    private TextView txtViewDetail;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgCoverDetail = findViewById(R.id.imgCoverDetail);
        txtTitleDetail = findViewById(R.id.txtTitleDetail);
        txtContentDetail = findViewById(R.id.txtContentDetail);
        txtViewDetail = findViewById(R.id.txtViewDetail);

        int position = getIntent().getIntExtra("position", -1);

        if (position == -1) {
            finish();
            return;
        }
        Article article = ArticleRepository.getArticle(
                        this,
                        position);
        article.increaseView();
        txtTitleDetail.setText(
                article.getTitle()
        );

        txtContentDetail.setText(article.getContent());
        txtViewDetail.setText("Views: " + article.getView());
        int imageId = getResources()
                .getIdentifier(
                        article.getImgCover(),
                        "drawable",
                        getPackageName()
                );
        if (imageId != 0) {imgCoverDetail.setImageResource(imageId);}
    }
}
