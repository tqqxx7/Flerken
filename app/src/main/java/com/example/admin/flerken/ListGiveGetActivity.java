package com.example.admin.flerken;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.admin.flerken.Adapter.ListGiveGetAdapter;
import com.example.admin.flerken.Model.ListGiveGetModel;

import java.util.ArrayList;

public class ListGiveGetActivity extends android.support.v4.app.Fragment{
    private View rootView;
    Integer[] img = {R.drawable.test1,R.drawable.test2};
    String[] TEXT = {"textrecycler","textrecycler1","textrecycler2"};



    private ListGiveGetAdapter adapterRecycler;
    private RecyclerView recyclerView;
    private ArrayList<ListGiveGetModel> modelRecyclerArrayList;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.activity_list_give_get,container,false);
        recyclerView = rootView.findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        modelRecyclerArrayList = new ArrayList<>();
//        for (int i = 0; i < (img.length);i++) {
//            ModelRecycler modelRecycler = new ModelRecycler();
//            modelRecycler.setImg1(img[i]);
//            modelRecycler.setImga2(img[i]);
//            modelRecycler.setText(TEXT[i]);
//
//
//            modelRecyclerArrayList.add(modelRecycler);

        ListGiveGetModel model = new ListGiveGetModel(R.drawable.test1,"Bàn phím cũ","Đang đợi phản hồi","");
        modelRecyclerArrayList.add(model);
        ListGiveGetModel model1 = new ListGiveGetModel(R.drawable.test2,"Màn hình cũ","Đang đợi phản hồi","");
        ListGiveGetModel model2 = new ListGiveGetModel(R.drawable.test1,"Bàn phím cũ","Đang đợi phản hồi","");
        ListGiveGetModel model3 = new ListGiveGetModel(R.drawable.test2,"Màn hình cũ","Đang đợi phản hồi","");
        modelRecyclerArrayList.add(model1);

        modelRecyclerArrayList.add(model2);

        modelRecyclerArrayList.add(model3);

        adapterRecycler = new ListGiveGetAdapter(getContext(), modelRecyclerArrayList);
        recyclerView.setAdapter(adapterRecycler);
        return rootView;
    }
}
