package com.example.admin.flerken;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.admin.flerken.Adapter.MenuAdapter;
import com.example.admin.flerken.Model.PojoClass;

import java.util.ArrayList;

/**
 * Created by admin on 3/13/2019.
 */

public class FragmentMain extends android.support.v4.app.Fragment{
    public ImageButton imageButton;
    private RecyclerView rv, rv1;
    private ArrayList<PojoClass> pojoClassArrayList;
    private View rootView;

    private String[] text_name = {"Bàn phím chui tròn", "Màn hình Led", "Áo thun mặc 2 lần", "thau nhựa mới mua", "test"};
    private String[] text_location = {"222 Lê Văn Sỹ, Q3", "11 Nguyễn Khắc Nhu, Q1", "1094 Hoàng Sa, Q. Tân Bình", "521/69 Cmt8, Q3", "test"};
    private String[] text_menu1 = {"bàn phím dẹp", "màn hình vuông", "đèn pin", "tô ăn cơm", "test"};
    private String[] text_menu2 = {"gấu bông", "quần jean", "áo khoác", "áo tay dài", "test"};
    private String[] text_menu3 = {"chuột dây", "cáp iphone", "cục sạc", "tủ quần áo", "test"};

    private Integer[] image = {R.drawable.test1, R.drawable.test2, R.drawable.test3, R.drawable.test3, R.drawable.test2};
    private Integer[] indicate = {R.drawable.free_icon, R.drawable.noicon, R.drawable.free_icon, R.drawable.noicon, R.drawable.free_icon};
    private Integer[] image_location = {R.drawable.shape, R.drawable.shape, R.drawable.shape, R.drawable.shape, R.drawable.shape};

    private MenuAdapter menuAdapter;


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
          rootView = inflater.inflate(R.layout.fragment_main,container,false);
          init();
          return rootView;
    }




    public void init() {

        ImageButton btn = (ImageButton) rootView.findViewById(R.id.imageButtonAdd);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intentAdd = new Intent(rootView.getContext(), AddProductActivity.class);
                startActivity(intentAdd);

            }
        });


        pojoClassArrayList = new ArrayList<>();

        for (int i = 0; i < text_name.length; i++) {

            PojoClass pojoClass = new PojoClass();
            pojoClass.setText_name(text_name[i]);
            pojoClass.setImage(image[i]);
            pojoClass.setIndicate(indicate[i]);
            pojoClass.setImage_location(image_location[i]);
            pojoClass.setText_location(text_location[i]);
            pojoClass.setText_menu1(text_menu1[i]);
            pojoClass.setText_menu2(text_menu2[i]);
            pojoClass.setText_menu3(text_menu3[i]);
            pojoClassArrayList.add(pojoClass);
        }

        rv = (RecyclerView) rootView.findViewById(R.id.rv);


        menuAdapter = new MenuAdapter(getContext(), pojoClassArrayList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        rv.setLayoutManager(mLayoutManager);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(menuAdapter);
    }



















//    private View rootView;
//    TextView tvMessageWrong;
//    Button btnEnter;
//    ImageView tab_icon;
//    EditText edtPin;
//    Layout layout_message;
//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
//        rootView = inflater.inflate(R.layout.fragment_main,container,false);
//        initView();
//
//       btnEnter.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View view) {
//               Animation anim_translate, anim_moveup;
//               anim_translate = AnimationUtils.loadAnimation(getContext(), R.anim.anim_translate_ltor);
//               anim_moveup = AnimationUtils.loadAnimation(getContext(), R.anim.anim_moveup);
//               edtPin.startAnimation(anim_translate);
//               GradientDrawable gd = new GradientDrawable();
//               gd.setColor(Color.parseColor("#00ffffff"));
//               gd.setStroke(4,Color.RED);
//               gd.setColor(Color.WHITE);
//               edtPin.setBackground(gd);
//               tvMessageWrong.setVisibility(View.VISIBLE);
//               tvMessageWrong.startAnimation(anim_moveup);
//           }
//       });
//        return rootView;
//    }
//
//    private void initView() {
//        btnEnter = rootView.findViewById(R.id.ButtonEnterPin);
//        edtPin = rootView.findViewById(R.id.EditTextPin);
//        tvMessageWrong = rootView.findViewById(R.id.TextViewMessageWrong);
////        layout_message = rootView.findViewById(R.layout.layoutMessageWrong);
//    }
}
