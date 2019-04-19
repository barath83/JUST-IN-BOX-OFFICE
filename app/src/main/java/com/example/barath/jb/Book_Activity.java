package com.example.barath.jb;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

public class Book_Activity extends AppCompatActivity {

    private TextView tvtitle;
    private ImageView img;

    EditText review;
    Button sreview;
    RatingBar ratingBar;
    Firebase mRef;
    Button lbtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_);

        Firebase.setAndroidContext(this);

        tvtitle = (TextView) findViewById(R.id.txttitle);
        img = (ImageView) findViewById(R.id.bookthumbnail);
        ratingBar = (RatingBar) findViewById(R.id.ratingbar);
        review = (EditText) findViewById(R.id.comment);
        sreview = (Button) findViewById(R.id.submit);
        lbtn = (Button) findViewById(R.id.linkb);



        // Recieve data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");

        int image = intent.getExtras().getInt("Thumbnail") ;

        // Setting values

        tvtitle.setText(Title);
        img.setImageResource(image);

        if(tvtitle.getText().toString().equalsIgnoreCase("Petta")){
            String DeviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);
            mRef = new Firebase("https://jbfirst-d45b8.firebaseio.com/" + DeviceID + "/" +tvtitle.getText().toString());
            ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                @Override
                public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                    Toast.makeText(Book_Activity.this,"Stars"+rating,Toast.LENGTH_SHORT).show();

                    Firebase mRefChild = mRef.child("Rating");
                    mRefChild.setValue(rating);

                }
            });}

        if(tvtitle.getText().toString().equalsIgnoreCase("Kanaa")){
            String DeviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);
            mRef = new Firebase("https://jbfirst-d45b8.firebaseio.com/" + DeviceID + "/" +tvtitle.getText().toString());
            ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                @Override
                public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                    Toast.makeText(Book_Activity.this,"Stars"+rating,Toast.LENGTH_SHORT).show();

                    Firebase mRefChild = mRef.child("Rating");
                    mRefChild.setValue(rating);

                }
            });}

        if(tvtitle.getText().toString().equalsIgnoreCase("Hello Guru Prema Kosame")){
            String DeviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);
            mRef = new Firebase("https://jbfirst-d45b8.firebaseio.com/" + DeviceID + "/" +tvtitle.getText().toString());
            ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                @Override
                public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                    Toast.makeText(Book_Activity.this,"Stars"+rating,Toast.LENGTH_SHORT).show();

                    Firebase mRefChild = mRef.child("Rating");
                    mRefChild.setValue(rating);

                }
            });}

        if(tvtitle.getText().toString().equalsIgnoreCase("Andhadhun")){
            String DeviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);
            mRef = new Firebase("https://jbfirst-d45b8.firebaseio.com/" + DeviceID + "/"+ tvtitle.getText().toString());
            ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                @Override
                public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                    Toast.makeText(Book_Activity.this,"Stars"+rating,Toast.LENGTH_SHORT).show();

                    Firebase mRefChild = mRef.child("Rating");
                    mRefChild.setValue(rating);

                }
            });}

        if(tvtitle.getText().toString().equalsIgnoreCase("Savyasachi")){
            String DeviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);
            mRef = new Firebase("https://jbfirst-d45b8.firebaseio.com/" + DeviceID + "/"+tvtitle.getText().toString());
            ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                @Override
                public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                    Toast.makeText(Book_Activity.this,"Stars"+rating,Toast.LENGTH_SHORT).show();

                    Firebase mRefChild = mRef.child("Rating");
                    mRefChild.setValue(rating);

                }
            });}

        if(tvtitle.getText().toString().equalsIgnoreCase("URI Surgical Strike")){
            String DeviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);
            mRef = new Firebase("https://jbfirst-d45b8.firebaseio.com/" + DeviceID + "/"+tvtitle.getText().toString());
            ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                @Override
                public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                    Toast.makeText(Book_Activity.this,"Stars"+rating,Toast.LENGTH_SHORT).show();

                    Firebase mRefChild = mRef.child("Rating");
                    mRefChild.setValue(rating);

                }
            });}

        if(tvtitle.getText().toString().equalsIgnoreCase("Aquaman")){
            String DeviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);
            mRef = new Firebase("https://jbfirst-d45b8.firebaseio.com/" + DeviceID + "/"+tvtitle.getText().toString());
            ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                @Override
                public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                    Toast.makeText(Book_Activity.this,"Stars"+rating,Toast.LENGTH_SHORT).show();

                    final Firebase mRefChild = mRef.child("Rating");
                    mRefChild.setValue(rating);



                }
            });}

        if(tvtitle.getText().toString().equalsIgnoreCase("Imaikkanodigal")){
            String DeviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);
            mRef = new Firebase("https://jbfirst-d45b8.firebaseio.com/" +  DeviceID + "/"+tvtitle.getText().toString());
            ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                @Override
                public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                    Toast.makeText(Book_Activity.this,"Stars"+rating,Toast.LENGTH_SHORT).show();

                    Firebase mRefChild = mRef.child("Rating");
                    mRefChild.setValue(rating);

                }
            });}


        if(tvtitle.getText().toString().equalsIgnoreCase("Simba")){
            String DeviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);
            mRef = new Firebase("https://jbfirst-d45b8.firebaseio.com/" + DeviceID + "/" +tvtitle.getText().toString());
            ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                @Override
                public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                    Toast.makeText(Book_Activity.this,"Stars"+rating,Toast.LENGTH_SHORT).show();

                    Firebase mRefChild = mRef.child("Rating");
                    mRefChild.setValue(rating);

                }
            });}

        if(tvtitle.getText().toString().equalsIgnoreCase("Jalebi")){
            String DeviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);
            mRef = new Firebase("https://jbfirst-d45b8.firebaseio.com/" + DeviceID +"/"+tvtitle.getText().toString());
            ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                @Override
                public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                    Toast.makeText(Book_Activity.this,"Stars"+rating,Toast.LENGTH_SHORT).show();

                    Firebase mRefChild = mRef.child("Rating");
                    mRefChild.setValue(rating);

                }
            });}



        /* Review from users submission into firebase */
        if(tvtitle.getText().toString().equalsIgnoreCase("Jalebi")){
        String DeviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);
        mRef = new Firebase("https://jbfirst-d45b8.firebaseio.com/" +  DeviceID + "/"+tvtitle.getText().toString());
        sreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String response = review.getText().toString();

                Firebase mRefChild = mRef.child("Your Review");
                mRefChild.setValue(response);
            }
        });}



        if(tvtitle.getText().toString().equalsIgnoreCase("Simba")){
            String DeviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);
            mRef = new Firebase("https://jbfirst-d45b8.firebaseio.com/" + DeviceID + "/"+tvtitle.getText().toString());
            sreview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String response = review.getText().toString();

                    Firebase mRefChild = mRef.child("Your Review");
                    mRefChild.setValue(response);
                }
            });}

        if(tvtitle.getText().toString().equalsIgnoreCase("Andhadhun")){
            String DeviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);
            mRef = new Firebase("https://jbfirst-d45b8.firebaseio.com/" + DeviceID + "/"+tvtitle.getText().toString());
            sreview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String response = review.getText().toString();

                    Firebase mRefChild = mRef.child("Your Review");
                    mRefChild.setValue(response);
                }
            });}

        if(tvtitle.getText().toString().equalsIgnoreCase("Imaikkanodigal")){
            String DeviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);
            mRef = new Firebase("https://jbfirst-d45b8.firebaseio.com/" + DeviceID + "/"+tvtitle.getText().toString());
            sreview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String response = review.getText().toString();

                    Firebase mRefChild = mRef.child("Your Review");
                    mRefChild.setValue(response);
                }
            });}

        if(tvtitle.getText().toString().equalsIgnoreCase("Aquaman")){
            String DeviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);
            mRef = new Firebase("https://jbfirst-d45b8.firebaseio.com/" + DeviceID + "/"+tvtitle.getText().toString());
            sreview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String response = review.getText().toString();

                    Firebase mRefChild = mRef.child("Your Review");
                    mRefChild.setValue(response);
                }
            });}

        if(tvtitle.getText().toString().equalsIgnoreCase("URI Surgical Strike")){
            String DeviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);
            mRef = new Firebase("https://jbfirst-d45b8.firebaseio.com/" + DeviceID + "/"+tvtitle.getText().toString());
            sreview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String response = review.getText().toString();

                    Firebase mRefChild = mRef.child("Your Review");
                    mRefChild.setValue(response);
                }
            });}

        if(tvtitle.getText().toString().equalsIgnoreCase("Savyasachi")){
            String DeviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);
            mRef = new Firebase("https://jbfirst-d45b8.firebaseio.com/" + DeviceID + "/"+tvtitle.getText().toString());
            sreview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String response = review.getText().toString();

                    Firebase mRefChild = mRef.child("Your Review");
                    mRefChild.setValue(response);
                }
            });}

        if(tvtitle.getText().toString().equalsIgnoreCase("Hello Guru Prema Kosame")){
            String DeviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);
            mRef = new Firebase("https://jbfirst-d45b8.firebaseio.com/" + DeviceID + "/"+tvtitle.getText().toString());
            sreview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String response = review.getText().toString();

                    Firebase mRefChild = mRef.child("Your Review");
                    mRefChild.setValue(response);
                }
            });}


        if(tvtitle.getText().toString().equalsIgnoreCase("Kanaa")){
            String DeviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);
            mRef = new Firebase("https://jbfirst-d45b8.firebaseio.com/" + DeviceID +"/"+tvtitle.getText().toString());
            sreview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String response = review.getText().toString();

                    Firebase mRefChild = mRef.child("Your Review");
                    mRefChild.setValue(response);
                }
            });}

        if(tvtitle.getText().toString().equalsIgnoreCase("Petta")){
            String DeviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);
            mRef = new Firebase("https://jbfirst-d45b8.firebaseio.com/" + DeviceID +"/"+ tvtitle.getText().toString());
            sreview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String response = review.getText().toString();

                    Firebase mRefChild = mRef.child("Your Review");
                    mRefChild.setValue(response);
                }
            });}

        if(tvtitle.getText().toString().equalsIgnoreCase("Petta")){
            lbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri uri = Uri.parse("https://in.bookmyshow.com/chennai/movies/petta/ET00083530"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

        }

        if(tvtitle.getText().toString().equalsIgnoreCase("Kanaa")){
            lbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri uri = Uri.parse("https://in.bookmyshow.com/chennai/movies/kanaa/ET00075842"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

        }


        if(tvtitle.getText().toString().equalsIgnoreCase("Hello Guru Prema Kosame")){
            lbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri uri = Uri.parse("https://www.primevideo.com/detail/0IV8S804M7H1R6JHQDQJWOUVT9/ref=atv_hover_title"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

        }

        if(tvtitle.getText().toString().equalsIgnoreCase("Andhadhun")){
            lbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri uri = Uri.parse("https://www.netflix.com/title/81039381"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

        }


        if(tvtitle.getText().toString().equalsIgnoreCase("Savyasachi")){
            lbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri uri = Uri.parse("https://www.primevideo.com/detail/0M6LHCXC74MMVT8MN2LOAKFNDH/ref=sr_hom_c_unkc_1_1?sr=1-1&qid=1547647278"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

        }


        if(tvtitle.getText().toString().equalsIgnoreCase("URI Surgical Strike")){
            lbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri uri = Uri.parse("https://in.bookmyshow.com/chennai/movies/uri-the-surgical-strike/ET00062444"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

        }


        if(tvtitle.getText().toString().equalsIgnoreCase("Aquaman")){
            lbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri uri = Uri.parse("https://in.bookmyshow.com/chennai/movies/aquaman/ET00052996"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

        }

        if(tvtitle.getText().toString().equalsIgnoreCase("Imaikkanodigal")){
            lbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri uri = Uri.parse("https://www.primevideo.com/detail/0U8G6AEUKN3CP2CP92LRD3ZSZ8/ref=sr_hom_c_unkc_1_1?sr=1-1&qid=1547647589"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

        }

        if(tvtitle.getText().toString().equalsIgnoreCase("Simba")){
            lbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri uri = Uri.parse("https://in.bookmyshow.com/chennai/movies/simmba/ET00066720"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

        }


        if(tvtitle.getText().toString().equalsIgnoreCase("Jalebi")){
            lbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri uri = Uri.parse("https://www.primevideo.com/detail/0K64TN5KN3T909NOLQ97VTHV3D/ref=sr_hom_c_unkc_1_1?sr=1-1&qid=1547647771"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

        }







    }

}
