package com.example.asampso2.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*ListView myListView = findViewById(R.id.myListView); // displays a selection fo views // requires type variable to link to objects

        final ArrayList<String> Family = new ArrayList<String>();




        Family.add("Dad");
        Family.add("Mom");
        Family.add("Mary");
        Family.add("Aaron");

       ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Family) ;//Arrayadapter converts arraylist  // what is context android dev

    myListView.setAdapter(arrayAdapter);

    myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            Toast.makeText(MainActivity.this, "Person tapped:" + Family.get(position), Toast.LENGTH_SHORT).show();




           // parent.setVisibility(View.GONE);// adapterview is the list view but could also be spinner (other interactive view)

            // view is the thing tapped in this example the row

            // Position is the number of the row tapped

            //id ??? same as position here but can be different.t

        }
    });
*/
/*
ListView theListView = findViewById(R.id.myListView);

final ArrayList<String> Friends = new ArrayList<>();

        Friends.add("finn");
        Friends.add("jake");
        Friends.add("pb");


        // aaron you tie into an interactive element through ArrayAdapter

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Friends); // this == (background)where it is in relation to the app and what else is going on

        theListView.setAdapter(arrayAdapter);

        //after setting the array to the interactive element I must set the click listener

        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Log.i("Ouput", Friends.get(position));

            }
        });
*/

ListView friendListView = findViewById(R.id.myListView);

final ArrayList<String> myFriends = new ArrayList<String>(asList("tom","dick","harry")); // make list and set it equal to arraylist

ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, myFriends);// does not work with simple list iiem 2

friendListView.setAdapter(arrayAdapter1);

friendListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Log.i("Ouput", myFriends.get(position));

    }
});

    }
}
