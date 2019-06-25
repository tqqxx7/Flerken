package com.example.admin.flerken.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;
import android.widget.ImageView;

import com.example.admin.flerken.FragmentNoti;
import com.example.admin.flerken.FragmentInfo;
import com.example.admin.flerken.FragmentMain;
import com.example.admin.flerken.ListGiveGetActivity;
import com.example.admin.flerken.Model.Model;
import com.example.admin.flerken.R;
import com.example.admin.flerken.TabViewItem;
import com.hold1.pagertabsindicator.TabViewProvider;

import java.util.List;

/**
 * Created by admin on 3/11/2019.
 */

public class CustomViewPageAdapter extends FragmentPagerAdapter implements TabViewProvider.CustomView  {
    List<Model> models;
    Context context;
    ImageView tab_icon;




    public CustomViewPageAdapter(FragmentManager fm, final Context context) {
        super(fm);
        this.context=context;

    }
//
//    public CustomViewPageAdapter(List<Model> models, Context context) {
//        this.models = models;
//        this.context = context;
//    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "page"+(position+1);
    }


    @Override
    public Fragment getItem(int position) {
        if(position==0){
            FragmentMain fragmentMain = new FragmentMain();
            return fragmentMain;
        }else if (position==2){
//            Toast.makeText(context, "1", Toast.LENGTH_SHORT).show();
            ListGiveGetActivity listGiveGetActivity = new ListGiveGetActivity();
            return listGiveGetActivity;
        }else if(position==1){
//            MyProductActivity myProductActivity = new MyProductActivity();
//            return myProductActivity;
            ListGiveGetActivity listGiveGetActivity = new ListGiveGetActivity();
            return listGiveGetActivity;
        }else if (position==3){
            FragmentNoti fragmentNoti = new FragmentNoti();
            return fragmentNoti;
        }else if(position==4){
            FragmentInfo fragmentInfo = new FragmentInfo();
            return fragmentInfo;
        }
        return null;
    }



    @Override
    public View getView(int i) {
        if(i==0){
            return new TabViewItem(context,
                    "Page 1",
                    R.drawable.ic_assignment_black_24dp,
                    0xFF2ECD70,
                    0xFF363636);
        }else if(i==1){
            return new TabViewItem(context,
                    "Page 2 ",
                    R.drawable.ic_insert_comment_black_24dp,
                    0xFF2ECD70,
                    0xFF363636);
        }else if(i==2){
            return new TabViewItem(context,
                    "Page 3",
                    R.drawable.ic_perm_identity_black_24dp,
                    0xFF2ECD70,
                    0xFF363636);
        }else if(i==3){
            return new TabViewItem(context,
                    "Page 4",
                    R.drawable.ic_android_black_24dp,
                    0xFF2ECD70,
                    0xFF363636);
        }else
            return new TabViewItem(context,
                    "Page 5",
                    R.drawable.ic_child_care_black_24dp,
                    0xFF2ECD70,
                    0xFF363636);
    }
}
