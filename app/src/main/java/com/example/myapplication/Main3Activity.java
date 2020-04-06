package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        final EditText etmakename =findViewById(R.id.et_001);
        final EditText etmakepassword = findViewById(R.id.et_002);
        Button btmake=findViewById(R.id.btn_001);
        //以下建立注册按钮的点击监听器
        btmake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 String Etmakename = etmakename.getText().toString();
                 String Etmakepassword = etmakepassword.getText().toString();
                //从EditText中得到数据
                Bundle bundle=new Bundle();
                bundle.putString("name",Etmakename);
                bundle.putString("password",Etmakepassword );
                Intent intent=new Intent(Main3Activity.this,MainActivity.class);
                //使用bundle传递数据
               intent.putExtras(bundle);
               startActivity(intent);

            }
        });

    }
}
