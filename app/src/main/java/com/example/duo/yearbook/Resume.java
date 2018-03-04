package com.example.duo.yearbook;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class Resume extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);
        WebView myWebView = (WebView) findViewById(R.id.webview);  //make webview
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.getSettings().setJavaScriptEnabled(true);         //enable javascript to play in app
        myWebView.loadUrl("https://www.youtube.com/watch?v=oHg5SJYRHA0");  //lulz

    }

}
