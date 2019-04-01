package com.example.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private RadioButton rbtn1,rbtn2,rbtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rbtn1= findViewById(R.id.rdodayahang);
        rbtn2= findViewById(R.id.rdorajeshdai);
        rbtn2=findViewById(R.id.rdosaugat);

        rbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.rdodayahang:
                        break;
                    case R.id.rdorajeshdai:
                        break;
                }

            }
        });

        rbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        rbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });





    }
}
