package com.example.barath.jb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class castcrew extends AppCompatActivity {
    ImageView cimageview;
    TextView cctextview;
    TextView itextview;
    TextView btextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.castcrew);

        cimageview = (ImageView) findViewById(R.id.imageView4);
        cctextview = (TextView) findViewById(R.id.textView7);
        itextview = (TextView) findViewById(R.id.textView15);
        btextview = (TextView) findViewById(R.id.textView17);
        Bundle mbundle = getIntent().getExtras();
        if(mbundle!=null){
            cctextview.setText(mbundle.getString("CastName"));
            cimageview.setImageResource(mbundle.getInt("CastImage"));
            itextview.setText(mbundle.getString("Castidentity"));
            btextview.setText(mbundle.getString("Castbio"));


        }



    }
}
