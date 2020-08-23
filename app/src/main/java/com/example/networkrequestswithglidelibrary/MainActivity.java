package com.example.networkrequestswithglidelibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MainActivity extends AppCompatActivity {

    ImageView imageView, imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        imageView2 =findViewById(R.id.imageView2);

        Glide.with(this).load("https://i.ibb.co/60tghkB/maxresdefault.jpg").into(imageView);
        Glide.with(this).load("https://i.ibb.co/sP6mZtB/watercolor-painting-fox-clip-art-png-favpng-ud-RBv-BZDvg9-WDS2-W0q-Qcxpnx-P.jpg").into(imageView2);


        /* We need:

        * in build.gradle(:app)
        implementation 'com.github.bumptech.glide:glide:4.11.0'
        annotationProcessor 'com.github.bumptech.glide:compiler:4.11.0'

        * in build.graddple(project) in buildscripts
        mavenCentral()

        * in AndroidManifest
        <uses-permission android:name="android.permission.INTERNET"/>

         */

    }
}