package com.bignerdranch.android.bugsbunny;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView title = (TextView) findViewById(R.id.titleTXT);
        title.setText("Random");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_adventure) {
            TextView i = (TextView)findViewById(R.id.titleTXT);
            i.setText("Climbing");
            return true;
        } else if (id == R.id.action_Aquatic) {
            TextView i = (TextView)findViewById(R.id.titleTXT);
            i.setText("Aquatic");
            return true;
        }else if (id == R.id.action_Beach) {
            TextView i = (TextView)findViewById(R.id.titleTXT);
            i.setText("Beach Life");
            return true;
        }else if (id == R.id.action_Extreme) {
            TextView i = (TextView)findViewById(R.id.titleTXT);
            i.setText("Extreme Sports");
            return true;
        }else if (id == R.id.action_Nature) {
            TextView i = (TextView)findViewById(R.id.titleTXT);
            i.setText("Nature");
            return true;
        }else if (id == R.id.action_Night) {
            TextView i = (TextView)findViewById(R.id.titleTXT);
            i.setText("Night Life");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    //for each menu button item
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.new_trip) {
            Intent i = new Intent(getApplicationContext(), Main3Activity.class);
            startActivity(i);
        } else if (id == R.id.profile) {

        } else if (id == R.id.Groups) {

        } else if (id == R.id.activities) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
