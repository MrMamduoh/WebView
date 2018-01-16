package com.example.mamdouh.site3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

home();

    }


    protected void home (){
        WebView wvPage;
        wvPage = (WebView) findViewById(R.id.wvPage);
        String url = "http://www.androidsupport.co.in";
        wvPage.getSettings().setJavaScriptEnabled(true);
        wvPage.setWebViewClient(new WebViewClient());
        wvPage.loadUrl(url);

    }

    }

