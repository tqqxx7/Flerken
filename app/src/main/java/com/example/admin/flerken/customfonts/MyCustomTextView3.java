package com.example.admin.flerken.customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by kuldeep on 17/01/18.
 */

public class MyCustomTextView3 extends TextView {
    public MyCustomTextView3(Context context, AttributeSet attrs)
    {
        super(context,attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(),"Fonts/Roboto-Medium.ttf"));
    }
}
