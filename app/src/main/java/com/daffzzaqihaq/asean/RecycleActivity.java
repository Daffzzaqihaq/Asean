package com.daffzzaqihaq.asean;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleActivity extends AppCompatActivity {

    @BindView(R.id.my_recycler_view)
    RecyclerView myRecyclerView;

    String[] namaAsean,detailAsean;
    int[] gambarAsean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);


        namaAsean = getResources().getStringArray(R.array.aseans_name);
        detailAsean = getResources().getStringArray(R.array.aseans_detail);
        gambarAsean = new int[]{R.drawable.indonesia, R.drawable.malaysia, R.drawable.singapura, R.drawable.thailand, R.drawable.filipina, R.drawable.vietnam, R.drawable.myanmar, R.drawable.kamboja, R.drawable.brunei, R.drawable.laos};

        Adapter adapter = new Adapter(RecycleActivity.this, gambarAsean,namaAsean,detailAsean);

        myRecyclerView.setHasFixedSize(true);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(RecycleActivity.this));
        myRecyclerView.setAdapter(adapter);

    }
}
