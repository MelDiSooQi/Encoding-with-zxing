package com.pureix.sample;

import android.graphics.Color;
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
import android.widget.ImageView;

import com.pureix.encodinganddecodinglib.EncodingZxing;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private static final int QR_CODE        = 0;
    private static final int PDF_417        = 1;
    private static final int DATA_MATRIX    = 2;
    private static final int AZTEC          = 3;

    private int currentEncoding = 2;

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imageView = (ImageView) findViewById(R.id.imageView);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (currentEncoding) {
                    case QR_CODE:
                    {
                        imageView.setImageBitmap(EncodingZxing
                                .encodeToQrCode("Encoding with zxing", 500));
                        break;
                    }
                    case PDF_417:
                    {
                        imageView.setImageBitmap(EncodingZxing
                                .encodeToPDF417("Encoding with zxing", 500, Color.BLACK, Color.WHITE));
                        break;
                    }
                    case DATA_MATRIX:
                    {
                        imageView.setImageBitmap(EncodingZxing
                                .encodeToDataMatrix("Encoding with zxing", 26, 12));
                        break;
                    }
                    case AZTEC:
                    {
                        imageView.setImageBitmap(EncodingZxing
                                .encodeToPDF417("Encoding with zxing", 500, Color.BLACK, Color.WHITE));
                        break;
                    }
                    default:
                    {
                        Snackbar.make(view, "Error", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                    }
                }

                Snackbar.make(view, "Done", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
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
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.navQrCode) {
            currentEncoding = QR_CODE;
        } else if (id == R.id.navPDF417) {
            currentEncoding = PDF_417;
        } else if (id == R.id.navDataMatrix) {
            currentEncoding = DATA_MATRIX;
        } else if (id == R.id.nav_manage) {
            currentEncoding = AZTEC;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
