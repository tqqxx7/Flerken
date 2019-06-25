package com.example.admin.flerken;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.hold1.pagertabsindicator.TabView;

/**
 * Created by admin on 3/12/2019.
 */

public class TabViewItem extends TabView {
    private TextView tab_name;
    private ImageView tab_icon;
    private int activeColor;
    private int tabColor;
    private Animation anim_rote;

    public TabViewItem( Context context, String title, int imageId, int activeColor, int tabColor) {
        super(context);

        LayoutInflater.from(context).inflate(R.layout.custom_item, this);
        tab_name = findViewById(R.id.tab_name);
        tab_icon = findViewById(R.id.tab_icon);
        tab_name.setText(title);
        tab_icon.setImageResource(imageId);
        this.anim_rote=AnimationUtils.loadAnimation(context,R.anim.anim_rotate);
        this.tabColor=tabColor;
        this.activeColor=activeColor;
        this.tab_icon.setColorFilter(tabColor);
        this.tab_name.setTextColor(tabColor);
        anim_rote = AnimationUtils.loadAnimation(this.getContext(),R.anim.anim_rotate);
//        Toast.makeText(getContext(), "2", Toast.LENGTH_SHORT).show();

    }


//    Animation anim_rote;
//    anim_rote = AnimationUtils.loadAnimation(context,R.anim.anim_rotate);
//           this.tab_icon.setAnimation(anim_rote);
//    getView(position).setAnimation(anim_rote);

    @Override
    public void onOffset(float offset) {
        this.tab_icon.setColorFilter(getColorWithOpacity(activeColor,(int)(100*offset)));
        this.tab_name.setTextColor(mixTwoColors(activeColor,tabColor,offset));
        int test = (int)offset;
        if(test!=0){
            this.tab_icon.startAnimation(anim_rote);
        }

    }




    private int mixTwoColors(int color1, int color2, float offset) {
        byte ALPHA_CHANEL=24;
        byte RED_CHANEL = 16;
        byte GREEN_CHANEL = 8;
        byte BLUE_CHANEL = 0;

        float inversemount = 1.0f-offset;
        int a = ((int)(((float)(color1>>ALPHA_CHANEL & 0xff)*offset)+((float)(color2>>ALPHA_CHANEL & 0xff)*inversemount)))&0xff;
        int r = ((int)(((float)(color1>>RED_CHANEL & 0xff)*offset)+((float)(color2>>RED_CHANEL & 0xff)*inversemount)))&0xff;
        int g = ((int)(((float)(color1>>GREEN_CHANEL & 0xff)*offset)+((float)(color2>>GREEN_CHANEL & 0xff)*inversemount)))&0xff;
        int b = ((int)(((float)(color1 & 0xff)*offset)+((float)(color2 & 0xff)*inversemount)))&0xff;

        return a<<ALPHA_CHANEL | r<<RED_CHANEL | g<<GREEN_CHANEL | b<<BLUE_CHANEL;

    }

    private int getColorWithOpacity(int activeColor, int i) {
        return Color.argb(i*255/100,Color.red(activeColor),Color.green(activeColor),Color.blue(activeColor));
    }
}
