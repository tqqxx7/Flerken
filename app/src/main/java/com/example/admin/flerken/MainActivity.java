package com.example.admin.flerken;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.admin.flerken.Adapter.CustomViewPageAdapter;
import com.example.admin.flerken.Model.Model;
import com.hold1.pagertabsindicator.PagerTabsIndicator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Model> models = new ArrayList<>();
    ViewPager viewPager;
    PagerTabsIndicator tabsIndicator;
//    ImageView tab_icon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initModel();
        viewPager = findViewById(R.id.ViewPager);
        tabsIndicator = findViewById(R.id.tabs_indicator);
//        tab_icon = findViewById(R.id.tab_icon);
        viewPager.setAdapter(new CustomViewPageAdapter(getSupportFragmentManager(),MainActivity.this ));
        tabsIndicator.setViewPager(viewPager);
    }






    private void initModel() {
        Model model = new Model("page 1", R.drawable.ic_assignment_black_24dp);
        models.add(model);
        model = new Model("page 2", R.drawable.ic_child_care_black_24dp);
        models.add(model);
        model = new Model("page 3", R.drawable.ic_perm_identity_black_24dp);
        models.add(model);
        model = new Model("page 4", R.drawable.ic_insert_comment_black_24dp);
        models.add(model);
        model = new Model("page 5", R.drawable.ic_android_black_24dp);
        models.add(model);
//        for(int i=0;i<3;i++){
//            models.add(new Model("Page "+i, 0));
//        }
    }
}
