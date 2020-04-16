package net.androidbootcamp.coffeefinder;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] coffeeShops={"Dunkin'", "St. Pete Bagel Co.", "Starbucks", "Wawa"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main,R.id.coffeeShops, coffeeShops));

    }
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch(position) {
            case 0:
                startActivity(new Intent(MainActivity.this, Shop0.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, Shop1.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, Shop2.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, Shop3.class));
                break;
        }
    }
}
