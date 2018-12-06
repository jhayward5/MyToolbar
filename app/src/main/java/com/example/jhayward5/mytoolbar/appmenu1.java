package com.example.jhayward5.mytoolbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class appmenu1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appmenu1);

        Toolbar toolbar =(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("  Frequently Asked Questions");
        getSupportActionBar().setIcon(getDrawable(R.drawable.dxclogo1));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.settings:
                Intent settings = new Intent(this, appmenu3.class);
                startActivity(settings);
                break;
            case R.id.contact_us:
                Intent contact_us = new Intent(this, appmenu2.class);
                startActivity(contact_us);
                break;

            default: //unknown error
        }
        return super.onOptionsItemSelected(item);
    }
}
