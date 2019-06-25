package com.example.admin.flerken.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.admin.flerken.Model.Food5_Detail_Model2;
import com.example.admin.flerken.R;


import java.util.ArrayList;



public class Food5_Detail_Adapter2 extends RecyclerView.Adapter<Food5_Detail_Adapter2.ViewHolder> {

    Context context;
    private ArrayList<Food5_Detail_Model2> modelArrayList;

    public Food5_Detail_Adapter2(Context context, ArrayList<Food5_Detail_Model2> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }

    @NonNull
    @Override
    public Food5_Detail_Adapter2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food5_detail_item2,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Food5_Detail_Model2 food5_detail_model2 = modelArrayList.get(position);
        holder.Food5_RestaurantName_Id2.setText(food5_detail_model2.getFood5_RestaurantName_Id2());

    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView Food5_RestaurantName_Id2;
        public ViewHolder(View itemView) {
            super(itemView);

            Food5_RestaurantName_Id2 = itemView.findViewById(R.id.Food5_RestaurantName_Id2);
        }
    }
}
