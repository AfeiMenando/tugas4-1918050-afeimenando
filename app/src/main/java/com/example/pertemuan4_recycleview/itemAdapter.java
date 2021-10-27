package com.example.pertemuan4_recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class itemAdapter extends RecyclerView.Adapter<itemAdapter.ItemViewHolder>{
    private ArrayList<item> dataList;
    public itemAdapter(ArrayList<item> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public itemAdapter.ItemViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_santuy, parent, false);
        return new ItemViewHolder(view);
    }
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.Logo.setImageResource(dataList.get(position).getLogo());
        holder.txtMerk.setText(dataList.get(position).getMerk());
        holder.txtUkuran.setText(dataList.get(position).getUkuran());
        holder.txtJumlah.setText(dataList.get(position).getJumlah());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
    public class ItemViewHolder extends RecyclerView.ViewHolder{
        private TextView txtMerk, txtUkuran, txtJumlah;
        private ImageView Logo;
        public ItemViewHolder(View itemView) {
            super(itemView);
            Logo = (ImageView)
                    itemView.findViewById(R.id.img_logo);
            txtMerk = (TextView)
                    itemView.findViewById(R.id.txt_Merk);
            txtUkuran = (TextView)
                    itemView.findViewById(R.id.txt_Ukuran);
            txtJumlah = (TextView)
                    itemView.findViewById(R.id.txt_Jumlah);
        }
    }
}
