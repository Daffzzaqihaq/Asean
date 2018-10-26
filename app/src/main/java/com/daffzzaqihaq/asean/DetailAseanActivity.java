package com.daffzzaqihaq.asean;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailAseanActivity extends AppCompatActivity {

    @BindView(R.id.imgLogo)
    ImageView imgLogo;
    @BindView(R.id.txtTitle)
    TextView txtTitle;
    @BindView(R.id.txtDetail)
    TextView txtDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_asean);
        ButterKnife.bind(this);

        txtTitle.setText(getIntent().getStringExtra("na"));
        txtDetail.setText(getIntent().getStringExtra("da"));
        Glide.with(this).load(getIntent().getIntExtra("ga",0)).into(imgLogo);

    }
}

