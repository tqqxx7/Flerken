package com.example.admin.flerken.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.admin.flerken.Model.Food5_Detail_Model;
import com.example.admin.flerken.R;

import java.util.ArrayList;


public class Food5_Detail_Adapter extends RecyclerView.Adapter<Food5_Detail_Adapter.ViewHolder> {

    Context context;
    private ArrayList<Food5_Detail_Model> modelArrayList;

    public Food5_Detail_Adapter(Context context, ArrayList<Food5_Detail_Model> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }

    @NonNull
    @Override
    public Food5_Detail_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food5_detail_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Food5_Detail_Adapter.ViewHolder holder, int position) {
        Food5_Detail_Model food5_detail_model = modelArrayList.get(position);
        holder.FoodImage_Id.setImageResource(food5_detail_model.getFoodImage_Id());

    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView FoodImage_Id;
        public ViewHolder(View itemView) {
            super(itemView);

            FoodImage_Id = itemView.findViewById(R.id.FoodImage_Id);
        }
    }
}
