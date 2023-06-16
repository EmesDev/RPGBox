package com.example.rpgbox;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class MainActivity extends AppCompatActivity {
    String url = "http://192.168.0.85:4200/";

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("http://192.168.0.85:4200/");

//        CustomTabsIntent.Builder customTabIntent = new CustomTabsIntent.Builder();
//        customTabIntent.setToolbarColor(color.parseColor("#008000"))




        WebSettings webSettings = myWebView.getSettings();

        webSettings.setDomStorageEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);

        webSettings.setJavaScriptEnabled(true);

    }
}