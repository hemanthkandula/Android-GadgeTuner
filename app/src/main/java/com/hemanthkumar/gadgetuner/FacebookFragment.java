package com.hemanthkumar.gadgetuner;










import android.app.Fragment;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.View.OnKeyListener;

public class FacebookFragment extends Fragment {

    ProgressDialog mProgress;
    WebView webview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_blog, container,
                false);
        String url = "https://www.facebook.com/HEMANTHKANDULA/";

        webview = (WebView) rootView.findViewById(R.id.webview1);

        WebSettings settings = webview.getSettings();
        settings.setJavaScriptEnabled(true);

        mProgress = ProgressDialog.show(getActivity(), "Loading",
                "Please wait for a moment...");
        webview.loadUrl(url);



        webview.setOnKeyListener(new OnKeyListener()
        {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event)
            {
                if(event.getAction() == KeyEvent.ACTION_DOWN)
                {
                    WebView webView = (WebView) v;

                    switch(keyCode)
                    {
                        case KeyEvent.KEYCODE_BACK:
                            if(webView.canGoBack())
                            {
                                webView.goBack();
                                return true;
                            }
                            break;
                    }
                }

                return false;
            }
        });








        webview.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {

                view.loadUrl(url);
                return true;
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (mProgress.isShowing()) {
                    mProgress.dismiss();
                }
            }
        });

        return rootView;
    }

}



