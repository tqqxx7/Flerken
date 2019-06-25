package com.example.admin.flerken.Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.admin.flerken.AddProductActivity;
import com.example.admin.flerken.MainActivity;
import com.example.admin.flerken.R;

public class LoginActivity extends AppCompatActivity {
    Button btnLogin;
    TextView tvRegister;
    EditText edtStuCode, edtPassWord;
    TextView tvMessageWrong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stuCode = edtStuCode.getText().toString();
                String passWord = edtPassWord.getText().toString();
                if(stuCode.equals("vanlang") && passWord.equals("vanlang")){
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }else{
                    Animation anim_translate, anim_moveup;
                    anim_moveup = AnimationUtils.loadAnimation(LoginActivity.this, R.anim.anim_moveup);
                    tvMessageWrong.setVisibility(View.VISIBLE);
                    tvMessageWrong.startAnimation(anim_moveup);
                }

            }
        });

        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initView() {
        btnLogin = findViewById(R.id.ButtonLogin1);
        tvRegister = findViewById(R.id.TextViewCreateAccount);
        edtStuCode = findViewById(R.id.EditTextStudentCode);
        edtPassWord = findViewById(R.id.EditTextPassword);
        tvMessageWrong = findViewById(R.id.TextViewMessageWrongLogin);
    }
}
