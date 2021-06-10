package com.teddy.yukkunjungi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class  ContohPostActivity extends AppCompatActivity {

    //Memanggil Variabel Widget Drawer supaya bisa dicoding
    //Inisialiasi Variabel
    DrawerLayout drawerLayout;
    WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contoh_post);

        //buka webnya
        webView = findViewById(R.id.contohpost_webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.yuk-kunjungi.com/contoh-mini-landing-page/");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //assign variabelnya
        drawerLayout = findViewById(R.id.drawer_layout);

    }

    public void ClickMenu(View view){
        //Open drawer
        MainActivity.openDrawer (drawerLayout);
    }

    public void ClickLogo(View view){
        //Close Drawernya
        MainActivity.closeDrawer(drawerLayout);
    }

    public void ClickHome(View view){
        //Redirect activity ke Beranda
        MainActivity.redirectActivity(this,MainActivity.class);
    }

    public void ClickBisnisProduk (View view){
        //Redirect activity ke Daftar Bisnis Produk
        MainActivity.redirectActivity(this,BisnisProdukActivity.class);
    }

    public void ClickBisnisJasa (View view){
        //Redirect activity ke Daftar Bisnis Jasa
        MainActivity.redirectActivity(this,BisnisJasaActivity.class);
    }

    public void ClickTentang (View view){
        //Redirect activity ke Tentang Yuk Kunjungi
        MainActivity.redirectActivity(this,CompanyActivity.class);
    }

    public void ClickContoh (View view){
        //Recreate activity
        recreate();
    }

    public void ClickCaraGabung (View view){
        //Redirect activity ke Artikel Cara Gabung
        MainActivity.redirectActivity(this,CaraGabungActivity.class);
    }

    public void ClickInput (View view){
        //Redirect activity ke Inputan Bisnis
        MainActivity.redirectActivity(this,InputUsahaActivity.class);
    }

    public void ClickKontak (View view){
        //Redirect activity ke Kontak Resmi
        MainActivity.redirectActivity(this,KontakActivity.class);
    }

    public void ClickKomunitas (View view){
        //Redirect activity ke Info Komunitas
        MainActivity.redirectActivity(this,KomunitasActivity.class);
    }

    public void ClickAplikasi (View view){
        //Redirect activity ke Tentang Aplikasi
        MainActivity.redirectActivity(this,AplikasiActivity.class);
    }
    public void ClickLogout (View view){
        //Menutup Aplikasi
        MainActivity.logout(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        //Close Drawer
        MainActivity.closeDrawer(drawerLayout);
    }

}