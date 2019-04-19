package com.example.barath.jb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class firstpage extends AppCompatActivity {
    private Button button;
    private Button buttonnews;
    private Button buttoncard;
    private Button buttonuser;
    private Button buttonsoup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensecondpage();
            }
        });

        buttonnews = (Button) findViewById(R.id.button1);
        buttonnews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennewsfeed();
            }
        });

        buttoncard = (Button) findViewById(R.id.button2);
        buttoncard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencardview();
            }
        });

        buttonuser = (Button) findViewById(R.id.button3);
        buttonuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openuser();
            }
        });

        buttonsoup = (Button) findViewById(R.id.button4);
        buttonsoup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbox();
            }
        });


    }
    public void opensecondpage(){
        Intent intent = new Intent(this,secondpage.class);
        startActivity(intent);
    }

    public  void opennewsfeed(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void opencardview(){
        Intent intent = new Intent(this,MainActivityc.class);
        startActivity(intent);
    }

    public void openuser(){
        Intent intent = new Intent(this,UserActivity.class);
        startActivity(intent);
    }
    public void openbox(){
        Intent intent = new Intent(this,report.class);
        startActivity(intent);

    }

}
