package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity {
    private Button button;
    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        button1=(Button) findViewById(R.id.button4);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEarn();
            }
        });
        button2=(Button) findViewById(R.id.button6);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTrans();
            }
        });
        button3=(Button) findViewById(R.id.button7);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCost();
            }
        });
        button=(Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogin();
            }

        });
    }
    public void openLogin()
    {
        Intent intent=new Intent(this, CarpoolingActivity.class);
        startActivity(intent);
    }
    public void openEarn()
    {
        Intent intent=new Intent(this, EarnActivity.class);
        startActivity(intent);
    }
    public void openTrans()
    {
        Intent intent=new Intent(this, DoneActivity.class);
        startActivity(intent);
    }
    public void openCost()
    {
        Intent intent=new Intent(this, DoneActivity.class);
        startActivity(intent);
    }
}