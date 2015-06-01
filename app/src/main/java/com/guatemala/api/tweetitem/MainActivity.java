package com.guatemala.api.tweetitem;

import android.app.ListActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;


public class MainActivity extends ListActivity {

    private TweetAdapter tweetItemArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] valores = new String[10];

        for (int i=0; i<10; i++){
            valores[i] = "Titulo: " + String.valueOf(i);
        }
        ArrayList<Tweet> lista = new ArrayList<>();
        tweetItemArrayAdapter = new TweetAdapter(this, lista);
        Tweet tweet;
        for (int i= 0; i<10; i++){
            tweet = new Tweet(valores[i]);
            tweetItemArrayAdapter.add(tweet);
        }

        setListAdapter(tweetItemArrayAdapter);
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
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
