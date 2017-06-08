package com.example.yls.bmob03006;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.security.KeyPairGenerator;

import cn.bmob.v3.BmobQuery;

public class MainActivity extends AppCompatActivity {

    private KeyPairGenerator bmob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bmob.initialize(Integer.parseInt("oLy0EEEO"));

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                queryOne();
                queryAll();
            }

            private void queryOne() {
                BmobQuery<Person> query = new BmobQuery<>();
            }
        });
    }

    private void queryAll() {


    }
}
