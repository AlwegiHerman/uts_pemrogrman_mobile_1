package com.example.alwegi.uts.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.alwegi.uts.R;
import com.example.alwegi.uts.model.Mahasiswa;

import java.util.ArrayList;
import java.util.List;


public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder> {

    private List<Mahasiswa> mahasiswaList = new ArrayList<>();

    public MahasiswaAdapter(List<Mahasiswa> mahasiswaList) {
        this.mahasiswaList = mahasiswaList;
    }

    @Override
    public MahasiswaAdapter.MahasiswaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_mahasiwa, parent, false);
        MahasiswaViewHolder mahasiswaViewHolder = new MahasiswaViewHolder(view);
        return mahasiswaViewHolder;
    }

    @Override
    public void onBindViewHolder(MahasiswaAdapter.MahasiswaViewHolder holder, int position) {
        holder.txt_resultnama.setText(mahasiswaList.get(position).getNama());
//        holder.txt_resulttempatlahir.setText(mahasiswaList.get(position).getTempat_lahir());
    }

    @Override
    public int getItemCount() {
        return mahasiswaList.size();
    }

    public static class MahasiswaViewHolder extends RecyclerView.ViewHolder {

        TextView txt_resultnama;
//        TextView txt_resulttempatlahir;

        public MahasiswaViewHolder(View itemView) {
            super(itemView);

            txt_resultnama = (TextView) itemView.findViewById(R.id.txt_resultnama);
//            txt_resulttempatlahir = (TextView) itemView.findViewById(R.id.txt_resulttempatlahir);
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
