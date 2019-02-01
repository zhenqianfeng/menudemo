package com.concordia.cejv669.menudemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.side_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int itemId=item.getItemId();

        if (itemId == R.id.create_new) {
            Toast.makeText(getApplicationContext(), "You Clicked on New", Toast.LENGTH_SHORT).show();
        }

        if (itemId == R.id.open) {
            Toast.makeText(getApplicationContext(), "You Clicked on Title", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}
