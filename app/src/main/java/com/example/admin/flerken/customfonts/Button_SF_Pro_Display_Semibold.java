package com.example.admin.flerken.customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class Button_SF_Pro_Display_Semibold extends android.support.v7.widget.AppCompatButton {

    public Button_SF_Pro_Display_Semibold(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public Button_SF_Pro_Display_Semibold(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Button_SF_Pro_Display_Semibold(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "Fonts/SF-Pro-Display-Semibold.otf");
            setTypeface(tf);
        }
    }
}

