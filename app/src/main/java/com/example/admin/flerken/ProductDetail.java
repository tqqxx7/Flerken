package com.example.admin.flerken;

import android.app.Dialog;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.admin.flerken.Adapter.Food5_Detail_Adapter;
import com.example.admin.flerken.Adapter.Food5_Detail_Adapter2;
import com.example.admin.flerken.Adapter.FoodPagerAdapter;
import com.example.admin.flerken.Model.Food5_Detail_Model;
import com.example.admin.flerken.Model.Food5_Detail_Model2;

import java.util.ArrayList;

import me.relex.circleindicator.CircleIndicator;

public class ProductDetail extends AppCompatActivity {
    Button btnOk, btnGiveGet;
    Integer[] FoodImage_Id = {R.drawable.test1,R.drawable.test1,R.drawable.test1,R.drawable.test1,R.drawable.test1};
    Integer[] Food_13_Image_Id={R.drawable.test1,R.drawable.test1,R.drawable.test1,R.drawable.test1,R.drawable.test1};
    String[] Food5_RestaurantName_Id2 = {"Máy lạnh","Nồi cơm điện","Tủ lạnh"};

    private RecyclerView recyclerView;
    private Food5_Detail_Adapter food5_detail_adapter;
    private ArrayList<Food5_Detail_Model> modelArrayList;
    private Food5_Detail_Adapter2 food5_detail_adapter2;
    private ArrayList<Food5_Detail_Model2> modelArrayList2;


//viewpager code

    private FoodPagerAdapter loginPagerAdapter;
    private ViewPager viewPager;
    private CircleIndicator indicator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);


        recyclerView = findViewById(R.id.RecyclerView2_Food5_Detail_Id);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ProductDetail.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        modelArrayList = new ArrayList<>();


        for (int i=0;i<FoodImage_Id.length;i++){
            Food5_Detail_Model food5_detail_model = new Food5_Detail_Model(FoodImage_Id[i],Food_13_Image_Id[i]);

            modelArrayList.add(food5_detail_model);

        }
        food5_detail_adapter = new Food5_Detail_Adapter(ProductDetail.this,modelArrayList);
        recyclerView.setAdapter(food5_detail_adapter);

//Recycle 2

        recyclerView = findViewById(R.id.RecyclerView2_Food5_Detail_Id);
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(ProductDetail.this);
        recyclerView.setLayoutManager(layoutManager1);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        modelArrayList2 = new ArrayList<>();

        for (int i=0;i<Food5_RestaurantName_Id2.length;i++){
            Food5_Detail_Model2 food5_detail_model2 = new Food5_Detail_Model2(Food5_RestaurantName_Id2[i]);

            modelArrayList2.add(food5_detail_model2);

        }
        food5_detail_adapter2 = new Food5_Detail_Adapter2(ProductDetail.this,modelArrayList2);
        recyclerView.setAdapter(food5_detail_adapter2);








        viewPager = (ViewPager) findViewById(R.id.viewpager);

        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        loginPagerAdapter = new FoodPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(loginPagerAdapter);
        indicator.setViewPager(viewPager);
        loginPagerAdapter.registerDataSetObserver(indicator.getDataSetObserver());

        LinearLayout layoutContact = findViewById(R.id.LayoutContact);
        layoutContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog myDialog2 = new Dialog(ProductDetail.this);
                myDialog2.getWindow();
                myDialog2.requestWindowFeature(Window.FEATURE_NO_TITLE);
                myDialog2.setCancelable(true);
                myDialog2.setContentView(R.layout.dialogbox_contact);
                Button btnOkContact = myDialog2.findViewById(R.id.ButtonOkContact);

                btnOkContact.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(ProductDetail.this, "Đã đề nghị đổi", Toast.LENGTH_SHORT).show();
                        myDialog2.dismiss();

                    }
                });
                myDialog2.show();
            }
        });


        btnGiveGet = findViewById(R.id.ButtonGiveGet);
        btnGiveGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog myDialog = new Dialog(ProductDetail.this);
                myDialog.getWindow();
                myDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                myDialog.setCancelable(true);
                myDialog.setContentView(R.layout.dialogbox_giveget);
                btnOk = myDialog.findViewById(R.id.ButtonOkGiveGet);

                btnOk.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(ProductDetail.this, "Đã đề nghị đổi", Toast.LENGTH_SHORT).show();
                        myDialog.dismiss();
                    }
                });
                myDialog.show();
            }
        });


    }
}
