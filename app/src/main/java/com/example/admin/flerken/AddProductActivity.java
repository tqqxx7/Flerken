package com.example.admin.flerken;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class AddProductActivity extends AppCompatActivity {
    Button btnAddProduct, btnOk;
    TextView tvMessageWrong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);
        initView();
    }

    private void initView() {
        tvMessageWrong = findViewById(R.id.TextViewMessageWrong);
        btnAddProduct = findViewById(R.id.ButtonAddProduct);
        btnAddProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog myDialog = new Dialog(AddProductActivity.this);
                myDialog.getWindow();
                myDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                myDialog.setCancelable(true);
                myDialog.setContentView(R.layout.dialogbox);
                btnOk = myDialog.findViewById(R.id.ButtonOkAddProduct);

                btnOk.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
//                        myDialog.dismiss();
                        Intent intent = new Intent(AddProductActivity.this, MainActivity.class);
                        startActivity(intent);
                    }
                });
                myDialog.show();
            }
        });

        btnAddProduct.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Animation anim_translate, anim_moveup;
               anim_moveup = AnimationUtils.loadAnimation(AddProductActivity.this, R.anim.anim_moveup);
                tvMessageWrong.setVisibility(View.VISIBLE);
               tvMessageWrong.startAnimation(anim_moveup);
                return false;
            }
        });
    }
}
