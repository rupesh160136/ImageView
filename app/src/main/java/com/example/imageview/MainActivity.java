package com.example.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    private RadioButton rbtn1, rbtn2, rbtn3;
    private ImageView imghero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rbtn1 = findViewById(R.id.rdodayahang);
        rbtn2 = findViewById(R.id.rdorajeshdai);
        rbtn2 = findViewById(R.id.rdosaugat);
        imghero = findViewById(R.id.imgvw1);

        rbtn1.setOnClickListener(this);
        rbtn2.setOnClickListener(this);
        rbtn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rdodayahang:
                imghero.setImageResource(R.drawable.dayahang);
                break;
            case R.id.rdorajeshdai:
                imghero.setImageResource(R.drawable.profile);
                break;
            case R.id.rdosaugat:
                imghero.setImageResource(R.drawable.saugat);
                break;

        }

    }
}
