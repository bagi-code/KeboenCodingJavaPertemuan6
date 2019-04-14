package com.bagicode.myapplicationrv;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MyViewHolder> {

    private List<MahasiswaModel> moviesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, subtitle;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.tv_title);
            subtitle = (TextView) view.findViewById(R.id.textView2);
        }
    }

    public MahasiswaAdapter(List<MahasiswaModel> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item_mahasiswa, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MahasiswaModel dataList = moviesList.get(position);

        holder.title.setText(dataList.getNama());
        holder.subtitle.setText(dataList.getKelas());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

}

