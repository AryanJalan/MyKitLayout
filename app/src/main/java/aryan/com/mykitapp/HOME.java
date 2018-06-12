package aryan.com.mykitapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;


public class HOME extends Fragment  {
    WebView wv1;

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view=inflater.inflate(R.layout.fragment_home,null);
        wv1=(WebView)view.findViewById(R.id.webview);
        WebSettings ws=wv1.getSettings();
        ws.setJavaScriptEnabled(true);
        wv1.loadUrl("file:///android_asset/index.html");
        return view;
    }
}