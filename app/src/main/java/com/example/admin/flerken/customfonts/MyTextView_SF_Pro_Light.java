package com.example.admin.flerken.customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;


public class MyTextView_SF_Pro_Light extends android.support.v7.widget.AppCompatTextView {

    public MyTextView_SF_Pro_Light(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyTextView_SF_Pro_Light(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTextView_SF_Pro_Light(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "Fonts/SF-Pro-Display-Light.otf");
            setTypeface(tf);
        }
    }

}