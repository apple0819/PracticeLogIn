package com.example.practicelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button loginBtn = null;
    TextView findPwTxt = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = findViewById(R.id.loginBtn);
        findPwTxt = findViewById(R.id.findPwTxt);

//        로그인버튼의 글자를 => 회원가입으로 변경.
        loginBtn.setText("회원가입");

//        비밀번호 찾기 텍스트뷰를 => JAVA에서 "비번 찾기"로 변경.
        findPwTxt.setText("비번 찾기");

//        로그인 버튼이 눌리면 => 비번 찾기 버튼을 "AAA"로 변경

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findPwTxt.setText("AAA");
            }
        });


        findPwTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findPwTxt.setText("비밀번호 찾기");
            }
        });


        loginBtn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                loginBtn.setText("로그인");
                return true; // 손을 땠을때, onClick 실행을 막을 건지?
            }
        });

    }
}
