package com.dibsyhex.droid10;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;


public class CreditsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        String list[]=new String[]{
          "Kate Hartmann ",
          "Johanna Curiel",
          "Krishnendu Paul @bidhata"
        };


        ArrayList<String>credits=new ArrayList<String>();
        credits.addAll(Arrays.asList(list));


        ListView creditsList=(ListView)findViewById(R.id.creditslist);

        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(this,R.layout.simple_list_item_1,credits);
        creditsList.setAdapter(arrayAdapter);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_credits, menu);
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
