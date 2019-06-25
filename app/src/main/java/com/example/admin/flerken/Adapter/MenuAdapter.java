package com.example.admin.flerken.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.flerken.Model.LeftRoundedCornersBitmap;
import com.example.admin.flerken.Model.PojoClass;
import com.example.admin.flerken.ProductDetail;
import com.example.admin.flerken.R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;
import java.util.ArrayList;

/**
 * Created by kuldeep on 23/01/18.
 */

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {
    private Context context;
    private ArrayList<PojoClass> pojoClassArrayList;

    public MenuAdapter(Context context, ArrayList<PojoClass> pojoClassArrayList) {
        this.context = context;
        this.pojoClassArrayList = pojoClassArrayList;
    }

    @Override
    public MenuAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.menu_layout, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MenuAdapter.ViewHolder holder, int position) {
        holder.text_name.setText(pojoClassArrayList.get(position).getText_name());
        holder.text_location.setText(pojoClassArrayList.get(position).getText_location());
        holder.text_menu1.setText(pojoClassArrayList.get(position).getText_menu1());
        holder.text_menu2.setText(pojoClassArrayList.get(position).getText_menu2());
        holder.text_menu3.setText(pojoClassArrayList.get(position).getText_menu3());
//        holder.text_review.setText(pojoClassArrayList.get(position).getText_review());
        holder.indicate.setImageResource(pojoClassArrayList.get(position).getIndicate());
        holder.image_location.setImageResource(pojoClassArrayList.get(position).getImage_location());
        Picasso.with(context).load(pojoClassArrayList.get(position).getImage()).transform((Transformation) new LeftRoundedCornersBitmap()).into(holder.image);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ProductDetail.class);
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount()   {return pojoClassArrayList.size();}


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView text_name,text_location,text_menu1,text_menu2,text_menu3,text_review;
        ImageView image,image_location,indicate;

        public ViewHolder(View view) {
            super(view);

            text_name =  view.findViewById(R.id.text_name);
            text_location =  view.findViewById(R.id.text_location);
            text_menu1 =  view.findViewById(R.id.text_menu1);
            text_menu2 =  view.findViewById(R.id.text_menu2);
            text_menu3 =  view.findViewById(R.id.text_menu3);
//            text_review =  view.findViewById(R.id.text_review);
            image = view.findViewById(R.id.image);
            indicate = view.findViewById(R.id.indicate);
            image_location = view.findViewById(R.id.image_location);

        }
    }
}


