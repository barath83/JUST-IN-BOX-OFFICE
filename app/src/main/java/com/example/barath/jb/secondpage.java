package com.example.barath.jb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class secondpage extends AppCompatActivity {

    ListView mlistview;

    String[] movienames = new String[]{"96", "Ratchasan", "VadaChennai","2.0","Aquaman","Kedarnath","Taxiwaala"};
    String [] moviecensor= new String[]{"U","U/A","A","U/A","U/A","U/A","Not Rated"};
    int[] movieposters ={R.drawable.movie96,
                         R.drawable.ratchasanmovie,
                         R.drawable.vadachennaimovie,
                         R.drawable.twomovie,
                         R.drawable.aquamanmovie,
                         R.drawable.kedarnathmovie,
                         R.drawable.taxiwalamovie};


    String [] movieyear = new String[] {"2018","2018","2018","2018","2018","2018","2018"};
    String [] runtime   = new String[]  {"156 mins","170 mins","164 mins","148 mins","143 mins","116 mins","137 mins"};
    String [] category   = new String[]   {"Romance","Action,Crime,Drama","Action,Crime","Action,Sci-Fi,Thriller","Action,Adventure,Fantasy","Drama,Romance","Comedy,Drama,Fantasy"};
    String [] synopsis = new String[]   {"Two high school sweethearts meet at a reunion after 22 years and reminisce about their past over the course of an evening.A heartwarming tale of romance that endures the test of time.",
                                           "Constant rejections in his attempts to become a filmmaker and family constraints force Arun to let go of his dream and take up the job of a Police officer.Meanwhile in the Chennai City, a series of murders turn up mysteriuosly.Will Arun's intutions help him solve the mystery?.",
                            "A young carrom player in north Chennai becomes a reluctant participant in a war between two warring gangsters.The film revolves around the political happenings and mafia war of Vada Chennai in the 80's.",
                     "Scientists help the government investigate a threat beyond understanding.Dr.Vaseegaran's Chitti returns to fight against the evolution of the fith force.Will it be enough?",
                   "Arthur Curry learns that he is the heir to the underwater kingdom of Atlantis, and must step forward to lead his people and be a hero to the world.Will he unite worlds and become the true heir of Atlantis? ",
             "A Hindu-Muslim love story, Kedarnath portrays how a Muslim pithoo saves a Hindu tourist from the Uttrakhand floods at the pilgrimage, and the love that eventually develops between them.",
            "A job monger, Shiva ends up as a taxiwala only to realise that his ride is a beyond what anyone could have expected.Shiva buys a vintage car to earn money as a taxi driver but ends up with a ghost for a passenger."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);

        mlistview = (ListView) findViewById(R.id.listview);
        MyAdapter myAdapter = new MyAdapter(secondpage.this,movienames,movieposters,moviecensor);
        mlistview.setAdapter(myAdapter);
        mlistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent mIntent = new Intent(secondpage.this,ninetysix.class);
            mIntent.putExtra("MovieName",movienames[position]);
            mIntent.putExtra("MoviePoster",movieposters[position]);
            mIntent.putExtra("Censor",moviecensor[position]);
            mIntent.putExtra("Movieyear",movieyear[position]);
            mIntent.putExtra("Movietime",runtime[position]);
            mIntent.putExtra("Moviecategory",category[position]);
            mIntent.putExtra("Movieabout",synopsis[position]);
            startActivity(mIntent);

            }
        });
    }
}





