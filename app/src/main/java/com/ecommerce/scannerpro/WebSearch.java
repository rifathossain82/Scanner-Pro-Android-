package com.ecommerce.scannerpro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebSearch extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_search);

        setTitle("Result");

        webView=findViewById(R.id.webView_id);
        webView.setWebViewClient(new WebViewClient());

        String link=getIntent().getStringExtra("data");
        if(link.contains("http")){
            webView.loadUrl(link);
        }
        else{
            webView.loadUrl("http://www.google.com/search?q="+link);
        }


    }
}