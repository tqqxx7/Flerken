package com.example.admin.flerken.customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

class TextViewSFProDisplayRegularItalicextends extends android.support.v7.widget.AppCompatTextView {

    public TextViewSFProDisplayRegularItalicextends(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public TextViewSFProDisplayRegularItalicextends(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextViewSFProDisplayRegularItalicextends(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "Fonts/SF-Pro-Display-RegularItalic.otf");
            setTypeface(tf);
        }
    }
}
