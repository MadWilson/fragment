package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1, button2, button3;
    ImageView imageView;
    TextView txtView, txtView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        imageView = (ImageView) findViewById(R.id.imageView);
        txtView = (TextView) findViewById(R.id.textView);
        txtView2 = (TextView) findViewById(R.id.textView2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);


    }
    
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:

                txtView.setText("Бананы");
                txtView2.setText("Любимая еда миньонов");
                imageView.setImageResource(R.drawable.bananas);
                break;
            case R.id.button2:

                txtView.setText("Пицца");
                txtView2.setText("Любимая еда черепашек-ниндзя");
                imageView.setImageResource(R.drawable.pizza);
                break;
            case R.id.button3:

                txtView.setText("Клубника");
                txtView2.setText("Любимая еда какого-нибудь героя из мультиков....подскажите");
                imageView.setImageResource(R.drawable.strawberry);
                break;
        }
    }
}