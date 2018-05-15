package com.example.kcruz.labo6drawer;

import android.support.v4.app.FragmentManager;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.kcruz.labo6drawer.fragments.RestaurantBreakfastMenuListFragment;
import com.example.kcruz.labo6drawer.fragments.RestaurantDinnerMenuListFragment;
import com.example.kcruz.labo6drawer.fragments.RestaurantIntroductionFragment;
import com.example.kcruz.labo6drawer.fragments.RestaurantLunchMenuListFragment;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawerLayout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


        NavigationView navigationView = findViewById(R.id.navigationView);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {

                item.setChecked(true);

                drawer.closeDrawers();

                switch(item.getItemId()){
                    case R.id.item1:
                        RestaurantIntroductionFragment frag = new RestaurantIntroductionFragment();
                        //frag.setArguments(bundle);

                        FragmentManager fragmentManager = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                        fragmentTransaction.replace(R.id.frameLayout, frag);
                        fragmentTransaction.commit();
                        break;
                    case R.id.item2:
                        RestaurantLunchMenuListFragment frag2 = new RestaurantLunchMenuListFragment();
                        //RestaurantIntroductionFragment frag = new RestaurantIntroductionFragment();
                        //frag.setArguments(bundle);

                        FragmentManager fragmentManager2 = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();

                        fragmentTransaction2.replace(R.id.frameLayout, frag2);
                        fragmentTransaction2.commit();
                        break;
                    case R.id.item3:
                        RestaurantDinnerMenuListFragment frag3 = new RestaurantDinnerMenuListFragment();
                        //RestaurantIntroductionFragment frag = new RestaurantIntroductionFragment();
                        //frag.setArguments(bundle);

                        FragmentManager fragmentManager3 = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction3 = fragmentManager3.beginTransaction();

                        fragmentTransaction3.replace(R.id.frameLayout, frag3);
                        fragmentTransaction3.commit();
                        break;
                    case R.id.item4:
                        RestaurantBreakfastMenuListFragment frag4 = new RestaurantBreakfastMenuListFragment();
                        //RestaurantIntroductionFragment frag = new RestaurantIntroductionFragment();
                        //frag.setArguments(bundle);

                        FragmentManager fragmentManager4 = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction4 = fragmentManager4.beginTransaction();

                        fragmentTransaction4.replace(R.id.frameLayout, frag4);
                        fragmentTransaction4.commit();
                        break;
                }

                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawerLayout);
                drawer.closeDrawer(GravityCompat.START);
                return true;
            }
        });
    }

   /* PARA CUANDO TENGA DOS LISTAS
   public void switchContent(Fragment fragment, String tag) {

        FragmentManager fm = getSupportFragmentManager();
        while (fm.popBackStackImmediate());

        if (fragment != null){
            FragmentTransaction transaction = fm.beginTransaction();
            transaction.replace(R.id., fragment, tag);

            //Solo FavoriteListFragment se agrega al backStack

            if(!(fragment instanceof ProductListFragment)){
                transaction.addToBackStack(tag);
            }
            transaction.commit();
            contentF = fragment;
        }
    }*/

    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawerLayout);
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
}
