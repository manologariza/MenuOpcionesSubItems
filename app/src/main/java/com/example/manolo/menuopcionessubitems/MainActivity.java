package com.example.manolo.menuopcionessubitems;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        Intent i;
        switch (item.getItemId()){
            case R.id.facebook:
                i=new Intent("android.intent.action.VIEW", Uri.parse("http://www.facebook.com"));
                startActivity(i);
                break;
            case R.id.twitter:
                i=new Intent("android.intent.action.VIEW", Uri.parse("http://www.twitter.com"));
                startActivity(i);
                break;
            case R.id.cursoJava:
                i=new Intent("android.intent.action.VIEW", Uri.parse("http://www.java.com"));
                startActivity(i);
                break;
            case R.id.cursoAndroid:
                i=new Intent("android.intent.action.VIEW", Uri.parse("http://developer.android.com"));
                startActivity(i);
                break;
            case R.id.marca:
                i=new Intent("android.intent.action.VIEW", Uri.parse("http://www.marca.com"));
                startActivity(i);
                break;
            case R.id.elpais:
                i=new Intent("android.intent.action.VIEW", Uri.parse("http://www.elpais.com"));
                startActivity(i);
                break;
            case R.id.elmundo:
                i=new Intent("android.intent.action.VIEW", Uri.parse("http://www.elmundo.es"));
                startActivity(i);
                break;
            case R.id.salir:
                finish();
                break;
        }


        return true;
    }
}
