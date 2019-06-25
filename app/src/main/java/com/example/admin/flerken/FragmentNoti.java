package com.example.admin.flerken;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.admin.flerken.Adapter.NotificationsAdapter;
import com.example.admin.flerken.Model.NotificationsModel;

import java.util.ArrayList;

/**
 * Created by admin on 3/13/2019.
 */

public class FragmentNoti extends android.support.v4.app.Fragment {
    private View rootView;
    TextView textView;

    private ArrayList<NotificationsModel> modelfoodrecyclerArrayList;
    private RecyclerView recyclerview;
    private NotificationsAdapter adapter;

    Integer Foodimg1[] = {R.drawable.test1,R.drawable.test2,R.drawable.test3,R.drawable.test1};
    String foodtext1[] = {"Bàn phím cơ","Màn hình Led 12 inch ","Áo thun kem","Test"};
    String foodtext2[] = {"T160913 - Nguyễn Trần Thịnh đã đồng ý đổi hàng.","T160001 - Nguyễn Công Phượng không đồng ý đổi hàng ","Sản phẩm đã bị xóa ","Đổi không thanh công, tài khoản chủ món hàng đã bị khóa"};
    String foodtext3[] = {"20 phút trước","2 giờ trước","Hôm qua","3 ngày trước"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_noti,container,false);
        recyclerview = rootView.findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());

        modelfoodrecyclerArrayList = new ArrayList<>();

        for (int i = 0; i < Foodimg1.length; i++) {
            NotificationsModel vrusti = new NotificationsModel(Foodimg1[i],foodtext1[i],foodtext2[i],foodtext3[i]);
            modelfoodrecyclerArrayList.add(vrusti);
        }
        adapter = new NotificationsAdapter(getContext(),modelfoodrecyclerArrayList);
        recyclerview.setAdapter(adapter);
        return rootView;
    }
}
