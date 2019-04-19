package com.example.barath.jb;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

import java.util.ArrayList;


public class UserActivity extends AppCompatActivity {

    private Firebase mref;
    private ArrayList<String> mrate = new ArrayList<>();
    private ArrayList<String> mkey = new ArrayList<>();
    private ListView mlistview;
    private Button press;

    String[] movienames = new String[]{"Andhadhun","Aquaman","Hello Guru Prema Kosame","Imaikkanodigal","Jalebi","Kanna","Petta","Savyasachi","Simba","URI Surgical Strike"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        mlistview = (ListView) findViewById(R.id.ratelist);
        press = (Button) findViewById(R.id.wishreal);


        String DeviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);

        for(int i=0 ; i<movienames.length; i++) {
            mref = new Firebase("https://jbfirst-d45b8.firebaseio.com/" + DeviceID + "/"+ movienames[i]);

            final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mrate);
            mlistview.setAdapter(arrayAdapter);

            final int finalI = i;
            mref.addChildEventListener(new ChildEventListener() {
                @Override
                public void onChildAdded(DataSnapshot dataSnapshot, String s) {

                    String value = dataSnapshot.getValue(String.class);
                       if(value!=null)
                    mrate.add(String.format("%s\t%s", movienames[finalI], value));

                    arrayAdapter.notifyDataSetChanged();
                }

                @Override
                public void onChildChanged(DataSnapshot dataSnapshot, String s) {

                    String value = dataSnapshot.getValue(String.class);
                    String key = dataSnapshot.getKey();

                    if(value!=null){
                    int index = mkey.indexOf(key);
                    mrate.set(index,value);}

                    arrayAdapter.notifyDataSetChanged();

                }

                @Override
                public void onChildRemoved(DataSnapshot dataSnapshot) {

                }

                @Override
                public void onChildMoved(DataSnapshot dataSnapshot, String s) {

                }

                @Override
                public void onCancelled(FirebaseError firebaseError) {

                }
            });
        }

        press.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openuserwish();
            }
        });


    }

    public void openuserwish(){
        Intent intent = new Intent(this,Userwishlist.class);
        startActivity(intent);
    }
}
