package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //从注册界面传进来的账号和密码
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Bundle bundle=this.getIntent().getExtras();
        //通过intent找到传输信息，并用两个字符串接受；

        final EditText etUsername = findViewById(R.id.et_username);
        final EditText etPassword = findViewById(R.id.et_password);

        Button btnlogin = findViewById(R.id.btn_login);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //点击登录按键后执行以下操作
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                //从EditText中取得账号和密码
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);

                //final String Name ,Password;
                String Name="root";
                String Password="password";
                if(bundle != null){
                    Name = bundle.getString("name");
                    Password = bundle.getString("password");
                }
                if (username.equals(Name) && password.equals(Password)) {
                    Toast.makeText(MainActivity.this, "登录成功！", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
                //验证正确则跳转到Main2Activity
                else {
                    Toast.makeText(MainActivity.this, "账号或密码错误！", Toast.LENGTH_SHORT).show();
                }
                //验证错误则冒泡错误信息
                //***************************************************************************************************
                //以上完成登录界面设计

            }


        });
        //登录界面内


        Button btmake = findViewById(R.id.btn_comemake);
        btmake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cometomakeintent = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(cometomakeintent);
            }
        });


    }
}
