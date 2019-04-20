package com.bagicode.myapplicationrv.rc_withoutlistener;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.bagicode.myapplicationrv.R;

import java.util.List;

public class MahasiswaAdapterClick extends RecyclerView.Adapter<MahasiswaAdapterClick.MyViewHolder> {

    private List<MahasiswaModel> moviesList;
    private Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, subtitle;
        private ConstraintLayout Card;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.tv_title);
            subtitle = (TextView) view.findViewById(R.id.textView2);
            Card = (ConstraintLayout) view.findViewById(R.id.cl_card);
        }
    }

    public MahasiswaAdapterClick(List<MahasiswaModel> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item_mahasiswa, parent, false);

        context = parent.getContext();

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MahasiswaModel dataList = moviesList.get(position);

        holder.title.setText(dataList.getNama());
        holder.subtitle.setText(dataList.getKelas());

        holder.Card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Hai ganteng", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

}

