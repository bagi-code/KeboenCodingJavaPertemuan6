package com.bagicode.myapplicationrv.rc_listener;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bagicode.myapplicationrv.R;

import java.util.List;

public class MahasiswaAdapterListener extends RecyclerView.Adapter<MahasiswaAdapterListener.MyViewHolder> {

    private List<MahasiswaModelListener> moviesList;
    private OnItemClickListener listener;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, subtitle;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.tv_title);
            subtitle = (TextView) view.findViewById(R.id.textView2);
        }
    }

    public MahasiswaAdapterListener(List<MahasiswaModelListener> moviesList, OnItemClickListener listener) {
        this.moviesList = moviesList;
        this.listener = listener;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item_mahasiswa, parent, false);

        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final MahasiswaModelListener dataList = moviesList.get(position);

        holder.title.setText(dataList.getNama());
        holder.subtitle.setText(dataList.getKelas());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                listener.onItemClick(dataList);
            }
        });
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public interface OnItemClickListener {
        void onItemClick(MahasiswaModelListener item);
    }

}

