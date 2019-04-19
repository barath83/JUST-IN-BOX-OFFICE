package com.example.barath.jb;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

import java.util.ArrayList;
import java.util.List;

public class Userwishlist extends AppCompatActivity {

    private Firebase mref;
    private ArrayList<String> mwish = new ArrayList<>();
    private ArrayList<String> mkey = new ArrayList<>();
    private ListView mlistview;

    String sorc = String.valueOf(96);
    String des = "Ratchasan" ;

    String[] movienames = new String[]{"96", "Ratchasan", "Vadachennai","2.0","Aquaman","Kedarnath","Taxiwaala"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userwishlist);

        mlistview = (ListView) findViewById(R.id.wishlist);
        String DeviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);


             mref = new Firebase("https://jbfirst-d45b8.firebaseio.com/" + DeviceID + "/Wishlist/");

             final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mwish);
             mlistview.setAdapter(arrayAdapter);



             mref.addChildEventListener(new ChildEventListener() {
                 @Override
                 public void onChildAdded(DataSnapshot dataSnapshot, String s) {

                     String value = dataSnapshot.getValue(String.class);
                     String key = dataSnapshot.getRef().getParent().getKey();

                       if(value.equalsIgnoreCase("Yes"))
                       {
                           mwish.add(key);
                       }

                     arrayAdapter.notifyDataSetChanged();
                 }

                 @Override
                 public void onChildChanged(DataSnapshot dataSnapshot, String s) {

                     String value = dataSnapshot.getValue(String.class);
                     String key = dataSnapshot.getKey();


                     int index = mkey.indexOf(key);
                     mwish.set(index, value);

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



    }

