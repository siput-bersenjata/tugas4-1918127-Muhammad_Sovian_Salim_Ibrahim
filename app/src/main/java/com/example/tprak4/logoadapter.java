package com.example.tprak4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class logoadapter extends RecyclerView.Adapter<logoadapter.ViewHolder> {

    private ArrayList<logomodel> dataItem;

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtnama;
        TextView txtpencipta;
        TextView txttahun;
        ImageView imageIcon;

        public ViewHolder(@NonNull View itemView){
            super(itemView);

            txtnama = itemView.findViewById(R.id.txt_nama);
            txtpencipta = itemView.findViewById(R.id.txt_pencipta);
            txttahun = itemView.findViewById(R.id.txt_tahun);
            imageIcon = itemView.findViewById(R.id.imageList);
        }
    }

    logoadapter(ArrayList<logomodel>dataItem){
        this.dataItem = dataItem;
    }

    @NonNull
    @Override
    public logoadapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull logoadapter.ViewHolder holder, int position) {
        TextView txtnama = holder.txtnama;
        TextView txtpencipta = holder.txtpencipta;
        TextView txttahun = holder.txttahun;
        ImageView imageIcon = holder.imageIcon;

        txtnama.setText(dataItem.get(position).getNama());
        txtpencipta.setText(dataItem.get(position).getPencipta());
        txttahun.setText(dataItem.get(position).getTahun());
        imageIcon.setImageResource(dataItem.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }


}

