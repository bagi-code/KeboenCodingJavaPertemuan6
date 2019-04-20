package com.bagicode.myapplicationrv.rc_listener;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.bagicode.myapplicationrv.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivityListener extends AppCompatActivity {

    private List<MahasiswaModelListener> itemproductList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rc_mahasiswa);
        recyclerView.setAdapter(new MahasiswaAdapterListener(itemproductList, new MahasiswaAdapterListener.OnItemClickListener() {
            @Override public void onItemClick(MahasiswaModelListener item) {
                Toast.makeText(MainActivityListener.this, "Item Clicked "+item.nama, Toast.LENGTH_LONG).show();
            }
        }));

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);

        loadDataDummy();

    }

    private void loadDataDummy() {
        MahasiswaModelListener dataDummy = new MahasiswaModelListener();
        dataDummy = new MahasiswaModelListener("Robby", "A");
        itemproductList.add(dataDummy);

        dataDummy = new MahasiswaModelListener("Dian", "A");
        itemproductList.add(dataDummy);

        dataDummy = new MahasiswaModelListener("Putra", "A");
        itemproductList.add(dataDummy);

    }


}
