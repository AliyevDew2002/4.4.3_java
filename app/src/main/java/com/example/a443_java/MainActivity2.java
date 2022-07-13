package com.example.a443_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.a443_java.model.User;

public class MainActivity2 extends AppCompatActivity {
    static  final String TAG=MainActivity2.class.toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initViews();
    }
    void initViews(){
        TextView text=findViewById(R.id.main2_text);

        User user=(User)getIntent().getSerializableExtra("user");

        Log.d(TAG,user.toString());

        text.setText(user.toString());



    }
}