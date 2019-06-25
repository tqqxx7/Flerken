package com.example.admin.flerken.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.flerken.ListGiveGetActivity;
import com.example.admin.flerken.Model.ListGiveGetModel;
import com.example.admin.flerken.ProductDetail;
import com.example.admin.flerken.R;


import java.util.ArrayList;



/**
 * Created by wolfsoft3 on 16/7/18.
 */

public class ListGiveGetAdapter extends RecyclerView.Adapter<ListGiveGetAdapter.ViewHolder> {

    private Context context;
    private ArrayList<ListGiveGetModel> modelRecyclerArrayList;

    public ListGiveGetAdapter(Context context, ArrayList<ListGiveGetModel> modelRecyclerArrayList) {
        this.context = context;
        this.modelRecyclerArrayList = modelRecyclerArrayList;
    }

    @Override
    public ListGiveGetAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_favorites,parent,false);

        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ListGiveGetAdapter.ViewHolder holder, int position) {
        holder.textrecycler.setText(modelRecyclerArrayList.get(position).getTxt1());
        holder.txt2.setText(modelRecyclerArrayList.get(position).getTxt2());
        holder.txt3.setText(modelRecyclerArrayList.get(position).getTxt3());

//        Glide.with(context)
//                .load(modelRecyclerArrayList.get(position).getImage())
//                .into(holder.img);
        holder.img.setImageResource(modelRecyclerArrayList.get(position).getImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog myDialog = new Dialog(view.getContext());
                myDialog.getWindow();
                myDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                myDialog.setCancelable(true);
                myDialog.setContentView(R.layout.dialog_giveget);
                Button btnOk = myDialog.findViewById(R.id.ButtonOkGiveGet);
                btnOk.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        myDialog.dismiss();
                    }
                });
                Button btnNot = myDialog.findViewById(R.id.ButtonNotGiveGet);
                btnNot.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        myDialog.dismiss();
                    }
                });
                myDialog.show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return modelRecyclerArrayList.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textrecycler,txt2,txt3;
        ImageView img;
        public ViewHolder(View itemView) {
            super(itemView);
            textrecycler = itemView.findViewById(R.id.textrecycler);
            txt2 = itemView.findViewById(R.id.textrecycler1);
            txt3 = itemView.findViewById(R.id.textrecycler2);
            img = itemView.findViewById(R.id.img1);





        }
    }
}
