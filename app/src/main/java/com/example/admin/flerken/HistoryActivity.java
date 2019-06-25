package com.example.admin.flerken;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.admin.flerken.Adapter.Food7_Adapter;
import com.example.admin.flerken.Model.Food7_Model;

import java.util.ArrayList;

public class HistoryActivity extends AppCompatActivity {


    String[] Restaurant_Id  = {"Bàn Phím cũ","Màn hình cũ","Chuột cũ","Màn hình cũ"};
    String[] Address_Id = {"T160913 - Nguyễn Trần Thịnh","T160913 - Nguyễn Trần Thịnh","T160913 - Nguyễn Trần Thịnh","T160913 - Nguyễn Trần Thịnh"};
    String[] Reviews_Id ={"","","",""};
    String[] Date_Id = {"15/06/2019 10 : 30 AM","15/05/2019 12 : 30 AM","11/04/2019 10 : 30 AM","15/01/2019 11 : 35 PM"};
    String[] Dollar_Id={"HOÀN THÀNH","HOÀN THÀNH","HOÀN THÀNH","HOÀN THÀNH"};

    Integer[] FoodImage_Id = {R.drawable.test1,R.drawable.test2,R.drawable.test1,R.drawable.test2};
    Integer[] History_Id = {R.drawable.history,R.drawable.history,R.drawable.history,R.drawable.history};


    private RecyclerView recyclerView;
    private Food7_Adapter food7_adapter;
    private ArrayList<Food7_Model> modelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);


        recyclerView = findViewById(R.id.RecyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(HistoryActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        modelArrayList = new ArrayList<>();

        for (int i=0;i<Restaurant_Id.length;i++){
            Food7_Model food7_model = new Food7_Model(Restaurant_Id[i],Address_Id[i],Reviews_Id[i],Date_Id[i],Dollar_Id[i],FoodImage_Id[i],History_Id[i]);

            modelArrayList.add(food7_model);

        }
        food7_adapter = new Food7_Adapter(HistoryActivity.this,modelArrayList);
        recyclerView.setAdapter(food7_adapter);
    }

}

