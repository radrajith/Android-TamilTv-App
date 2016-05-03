package com.example.raji.tamiltv;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.provider.Browser;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class Tamil extends Activity {
    private Firebase ref;
    private String channel1Url;
    private String channel2Url;
    private String channel3Url;
    private String channel4Url;
    private String channel5Url;
    private String channel6Url;
    private String channel7Url;
    private String channel8Url;
    private String channel9Url;
    private String channel10Url;
    private String channel11Url;
    private String channel12Url;
    private String channel13Url;
    private String channel14Url;
    private String channel15Url;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tamil_activity);
        Firebase.setAndroidContext(this);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTo1Display();
            }
        });
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTo2Display();
            }
        });
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTo3Display();
            }
        });
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTo4Display();
            }
        });
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTo5Display();
            }
        });
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTo6Display();
            }
        });
        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTo7Display();
            }
        });
        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTo8Display();
            }
        });
        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTo9Display();
            }
        });
        button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTo10Display();
            }
        });
        button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTo11Display();
            }
        });
        button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTo12Display();
            }
        });
        button13 = (Button) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTo13Display();
            }
        });
        button14 = (Button) findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTo14Display();
            }
        });
        button15 = (Button) findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTo15Display();
            }
        });
        //firebaseUpdate();
        Firebase channels = new Firebase("https://tamiltv.firebaseio.com/");
        channels.child("channel-1/").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                button1.setText((String)dataSnapshot.child("name").getValue());
                channel1Url = (String)dataSnapshot.child("url").getValue();
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        channels.child("channel-2/").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                button2.setText((String)dataSnapshot.child("name").getValue());
                channel2Url = (String)dataSnapshot.child("url").getValue();
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        channels.child("channel-3/").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                button3.setText((String)dataSnapshot.child("name").getValue());
                channel3Url = (String)dataSnapshot.child("url").getValue();
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        channels.child("channel-4/").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                button4.setText((String)dataSnapshot.child("name").getValue());
                channel4Url = (String)dataSnapshot.child("url").getValue();
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        channels.child("channel-5/").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                button5.setText((String)dataSnapshot.child("name").getValue());
                channel5Url = (String)dataSnapshot.child("url").getValue();
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        channels.child("channel-6/").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                button6.setText((String)dataSnapshot.child("name").getValue());
                channel6Url = (String)dataSnapshot.child("url").getValue();
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        channels.child("channel-7/").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                button7.setText((String)dataSnapshot.child("name").getValue());
                channel7Url = (String)dataSnapshot.child("url").getValue();
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        channels.child("channel-8/").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                button8.setText((String)dataSnapshot.child("name").getValue());
                channel8Url = (String)dataSnapshot.child("url").getValue();
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        channels.child("channel-9/").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                button9.setText((String)dataSnapshot.child("name").getValue());
                channel9Url = (String)dataSnapshot.child("url").getValue();
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        channels.child("channel-10/").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                button10.setText((String)dataSnapshot.child("name").getValue());
                channel10Url = (String)dataSnapshot.child("url").getValue();
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        channels.child("channel-11/").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                button11.setText((String)dataSnapshot.child("name").getValue());
                channel11Url = (String)dataSnapshot.child("url").getValue();
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        channels.child("channel-12/").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                button12.setText((String)dataSnapshot.child("name").getValue());
                channel12Url = (String)dataSnapshot.child("url").getValue();
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        channels.child("channel-13/").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                button13.setText((String)dataSnapshot.child("name").getValue());
                channel13Url = (String)dataSnapshot.child("url").getValue();
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        channels.child("channel-14/").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                button14.setText((String)dataSnapshot.child("name").getValue());
                channel14Url = (String)dataSnapshot.child("url").getValue();
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        channels.child("channel-15/").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                button15.setText((String)dataSnapshot.child("name").getValue());
                channel15Url = (String)dataSnapshot.child("url").getValue();
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });


    }
//    public void firebaseUpdate(){
//        Firebase channels = new Firebase("https://tamiltv.firebaseio.com/");
//        channels.child("channel-1/").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                channel1Url =(String)dataSnapshot.child("url").getValue();
//                System.out.println(channel1Url);
//            }
//
//            @Override
//            public void onCancelled(FirebaseError firebaseError) {
//
//            }
//        });
//    }
    public void goTo15Display(){
        Intent intent = new Intent(Intent.ACTION_VIEW );
        intent.setDataAndType(Uri.parse(channel15Url), "video/*");
        //intent.setDataAndType(Uri.parse("http://62.210.107.171:8080/29f4c47c8f0aa856f05cfe7ae4a15d76eb477684b099239d281c27e5c3a6aed8/hls/theoffice.m3u8"), "video/*");
        Bundle bundle = new Bundle();
        bundle.putString("User-Agent", ":http-user-agent=HTTP/1.1");
        intent.putExtra(Browser.EXTRA_HEADERS, bundle);
        startActivity(intent);

    }
    public void goTo14Display(){
        Intent intent = new Intent(Intent.ACTION_VIEW );
        intent.setDataAndType(Uri.parse(channel4Url), "video/*");
        //intent.setDataAndType(Uri.parse("http://62.210.107.171:8080/29f4c47c8f0aa856f05cfe7ae4a15d76eb477684b099239d281c27e5c3a6aed8/hls/s4fhimym.m3u8"), "video/*");
        Bundle bundle = new Bundle();
        bundle.putString("User-Agent", ":http-user-agent=HTTP/1.1");
        intent.putExtra(Browser.EXTRA_HEADERS, bundle);
        startActivity(intent);
    }
    public void goTo13Display(){
        Intent intent = new Intent(Intent.ACTION_VIEW );
        intent.setDataAndType(Uri.parse(channel13Url), "video/*");
        //intent.setDataAndType(Uri.parse("http://62.210.107.171:8080/29f4c47c8f0aa856f05cfe7ae4a15d76eb477684b099239d281c27e5c3a6aed8/hls/friends.m3u8"), "video/*");
        Bundle bundle = new Bundle();
        bundle.putString("User-Agent", ":http-user-agent=HTTP/1.1");
        intent.putExtra(Browser.EXTRA_HEADERS, bundle);
        startActivity(intent);
    }
    public void goTo12Display(){
        Intent intent = new Intent(Intent.ACTION_VIEW );
        intent.setDataAndType(Uri.parse(channel12Url), "video/*");
        //intent.setDataAndType(Uri.parse("http://play-fs.amgiptv.com/vxtvathavan/athavantvlive.stream/playlist.m3u8"), "video/*");
        startActivity(intent);
    }
    public void goTo11Display(){
        Intent intent = new Intent(Intent.ACTION_VIEW );
        intent.setDataAndType(Uri.parse(channel11Url), "video/*");
        //intent.setDataAndType(Uri.parse("http://live.streamjo.com:1935/sarastv/sarastv/chunklist_w1421620375.m3u8"), "video/*");
        startActivity(intent);
    }
    public void goTo10Display(){
        Intent intent = new Intent(Intent.ACTION_VIEW );
        intent.setDataAndType(Uri.parse(channel10Url), "video/*");
        //intent.setDataAndType(Uri.parse("http://edgecastthanthitv.purplestream.in/httporg/ngrp:thanthi_all/chunklist_b500000.m3u8"), "video/*");
        startActivity(intent);
    }
    public void goTo9Display(){
        Intent intent = new Intent(Intent.ACTION_VIEW );
        intent.setDataAndType(Uri.parse(channel9Url), "video/*");
        //intent.setDataAndType(Uri.parse("http://live-fs.wmncdn.net/ddpodigailive1/live1.stream/playlist.m3u8"), "video/*");
        startActivity(intent);
    }
    public void goTo8Display(){
        Intent intent = new Intent(Intent.ACTION_VIEW );
        intent.setDataAndType(Uri.parse(channel8Url), "video/*");
        //intent.setDataAndType(Uri.parse("http://play-fs.amgiptv.com/vxtvsiripoli/siripoli.stream/playlist.m3u8"), "video/*");
        startActivity(intent);
    }
    public void goTo7Display(){
        Intent intent = new Intent(Intent.ACTION_VIEW );
        intent.setDataAndType(Uri.parse(channel7Url), "video/*");
        intent.setDataAndType(Uri.parse("http://d2voe16cs5psaw.cloudfront.net/news7new/smil:news7new.smil/chunklist_w2061316371_b894000_sleng.m3u8"), "video/*");
        startActivity(intent);
    }
    public void goTo6Display(){
        Intent intent = new Intent(Intent.ACTION_VIEW );
        intent.setDataAndType(Uri.parse(channel6Url), "video/*");
        //intent.setDataAndType(Uri.parse("http://45.79.203.234:1935/z1/myStream/chunklist_w1982904549.m3u8"), "video/*");
        startActivity(intent);
    }
    public void goTo5Display(){
        Intent intent = new Intent(Intent.ACTION_VIEW );
        intent.setDataAndType(Uri.parse(channel5Url), "video/*");
        //intent.setDataAndType(Uri.parse("http://play-fs.amgiptv.com/vxtvmega24/mega24.stream/playlist.m3u8"), "video/*");
        startActivity(intent);
    }
    public void goTo4Display() {
        Intent intent = new Intent(Intent.ACTION_VIEW );
        intent.setDataAndType(Uri.parse(channel5Url), "video/*");
        //intent.setDataAndType(Uri.parse("http://ibctamil.zecast.net/ibctamil/smil:ibctamil.smil/playlist.m3u8"), "video/*");
        startActivity(intent);
    }
    public void goTo3Display(){
        Intent intent = new Intent(Intent.ACTION_VIEW );
        intent.setDataAndType(Uri.parse(channel3Url), "video/*");
        //intent.setDataAndType(Uri.parse("http://64.185.179.179/cdn-live/_definst_/vasanth/secure/live/feed01/chunklist_w386391329.m3u8?e=0&h=54e44f64b2e6d5122acdf77d01ab7f9f&time=1459036629598"), "video/*");
        startActivity(intent);
    }
    private void goTo2Display(){
        //String urlPath = "http://166.62.121.101:1935/ttn/ttn/chunklist_w1146584302.m3u8";"http://37.59.17.222:1935/live_ca/eettv/chunklist_w644886228.m3u8";
        //Uri vidUri = Uri.parse(urlPath);
        Intent intent = new Intent(Intent.ACTION_VIEW );
       // intent.setDataAndType(Uri.parse("http://166.62.121.101:1935/ttn/ttn/chunklist_w1146584302.m3u8"), "video/*");
        intent.setDataAndType(Uri.parse(channel2Url), "video/*");
        startActivity(intent);
    }
    private void goTo1Display(){

        Intent intent = new Intent(Intent.ACTION_VIEW );
        //intent.setDataAndType(Uri.parse("http://37.59.17.222:1935/live_ca/eettv/chunklist_w1170065978.m3u8"), "video/*");
        intent.setDataAndType(Uri.parse(channel1Url), "video/*");
        startActivity(intent);
    }
}


