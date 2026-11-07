package com.redline.game
import android.app.Activity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
class MainActivity : Activity() {
  override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState)
    val w=WebView(this); w.settings.javaScriptEnabled=true; w.settings.domStorageEnabled=true
    w.webChromeClient=WebChromeClient(); w.webViewClient=WebViewClient(); setContentView(w)
    w.loadUrl("file:///android_asset/index.html")
  }
  @Deprecated("Deprecated in Android") override fun onBackPressed() { super.onBackPressed() }
}
