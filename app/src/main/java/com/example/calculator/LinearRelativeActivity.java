package com.example.calculator;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.OnClick;

public class LinearRelativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_relative);
        }
        @OnClick({R.id.btn_main_seven,R.id.btn_main_eight,R.id.btn_main_nine})
        public void onButtonClick(Button button) {
            switch(button.getId()){
                case R.id.btn_main_seven:
                    break;
                case R.id.btn_main_eight:
                    break;
                case R.id.btn_main_nine:
                    break;
            }
        }


    }

