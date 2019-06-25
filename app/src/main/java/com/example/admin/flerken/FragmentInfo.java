package com.example.admin.flerken;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.admin.flerken.Adapter.Nevigation_Adapter;
import com.example.admin.flerken.Model.Nevigation_Model;
import com.roughike.bottombar.BottomBar;

import java.util.ArrayList;

/**
 * Created by admin on 3/13/2019.
 */

public class FragmentInfo extends android.support.v4.app.Fragment {
    private View rootView;
    private LinearLayout layoutHistory;
    private TextView tvHistory;
    BottomBar bottomBar;

    String[] tv1 = {"Thông tin cá nhân","Điểm tin cậy","Cài đặt","Mời bạn bè"};

    Integer[] imagehistory = {R.drawable.payment_method,
            R.drawable.reward_credits,R.drawable.settings,R.drawable.invite_friends};
    Integer[] image1 ={R.drawable.ic_chevron_right_black_24dp,R.drawable.ic_chevron_right_black_24dp,R.drawable.ic_chevron_right_black_24dp,
            R.drawable.ic_chevron_right_black_24dp};

    private RecyclerView recyclerView;
    private Nevigation_Adapter nevigation_adapter;
    private ArrayList<Nevigation_Model> nevigation_models;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_info,container,false);
        recyclerView = rootView.findViewById(R.id.recycle11);
        tvHistory = rootView.findViewById(R.id.tv1);
        tvHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), HistoryActivity.class);
                startActivity(intent);
            }
        });
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        nevigation_models = new ArrayList<>();

        for(int i=0;i < imagehistory.length;i++) {
            Nevigation_Model ab = new Nevigation_Model(tv1[i],imagehistory[i],image1[i]);
            nevigation_models.add(ab);

        }





        nevigation_adapter = new Nevigation_Adapter(getContext(),nevigation_models);
        recyclerView.setAdapter(nevigation_adapter);
        return rootView;
    }







}
