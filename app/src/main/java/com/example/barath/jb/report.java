package com.example.barath.jb;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class report extends AppCompatActivity {

    Button clickit;
    TextView extract;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        clickit = (Button) findViewById(R.id.clicks);
        extract = (TextView) findViewById(R.id.report);

        clickit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new doit().execute();
            }
        });

    }
    public class doit extends AsyncTask<Void,Void,Void> {
        String content;

        int s,d;

        String temp;
        @Override
        protected Void doInBackground(Void... voids) {
            try {
                Document doc = Jsoup.connect("https://www.bollymoviereviewz.com/2013/04/bollywood-box-office-collection-2013.html").get();
                content = doc.text();


                s =  content.indexOf("Alita Battle Angel");
                d =  content.indexOf("Manmarziyan");



                temp = String.valueOf(s);
                content = content.substring(s,d);
                 content = ""+content;



            } catch(Exception e){
                e.printStackTrace();

            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            extract.setText(content);
        }
    }

}
