package com.example.practicelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button loginBtn = null;
    TextView findPwTxt = null;
    TextView signUpTxt = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = findViewById(R.id.loginBtn);
        findPwTxt = findViewById(R.id.findPwTxt);
        signUpTxt = findViewById(R.id.signUpTxt);

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

//      회원가입 버튼을 누르면 => "회원가입 화면으로 이동합니다." 안내문구 출력
        signUpTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "회원가입 화면으로 이동합니다.", Toast.LENGTH_SHORT).show();
            }
        });

//        로그인 버튼을 누르면 => 로그인 합니다. 토스트 출력.

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "로그인 합니다.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
