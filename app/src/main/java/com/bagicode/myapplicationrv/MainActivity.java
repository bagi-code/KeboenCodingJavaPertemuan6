package com.bagicode.myapplicationrv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<MahasiswaModel> itemproductList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MahasiswaAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rc_mahasiswa);

        mAdapter = new MahasiswaAdapter(itemproductList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        loadDataDummy();

    }

    private void loadDataDummy() {
        MahasiswaModel dataDummy = new MahasiswaModel();
        dataDummy = new MahasiswaModel("Robby", "A");
        itemproductList.add(dataDummy);

        dataDummy = new MahasiswaModel("Dian", "A");
        itemproductList.add(dataDummy);

        dataDummy = new MahasiswaModel("Putra", "A");
        itemproductList.add(dataDummy);


        mAdapter.notifyDataSetChanged();

    }


}
