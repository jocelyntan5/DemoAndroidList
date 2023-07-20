package sg.edu.rp.c346.id22043453.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    ArrayList<AndroidVersion> items = new ArrayList<AndroidVersion>();
    //ArrayAdapter<AndroidVersion> aaAndroidVersions;

    /*
    Previous Version
    ArrayList<String> items = new ArrayList();
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        /*
        Previous Version
        items.add("Pie - 9.0");
        items.add("Orea - 8.0 - 8.1");
        items.add("Nougat - 7.0 - 7.12");
        items.add("Marshamallow - 6.0 - 6.0.1");
        items.add("Lillipop - 5.0 - 5.1.1");
        items.add("KitKat - 4.4 - 4.44");
        items.add("Jelly Bean - 4.1 - 4.3.1");
        */

        items.add(new AndroidVersion("Pie", "9.0"));
        items.add(new AndroidVersion("Orea", "8.0 - 8.1"));
        items.add(new AndroidVersion("Nougat", "7.0 - 7.12"));
        items.add(new AndroidVersion("Marshamallow", "6.0 - 6.0.1"));
        items.add(new AndroidVersion("Lillipop", "5.0 - 5.1.1"));
        items.add(new AndroidVersion("Jelly Bean", "4.1 - 4.3.1"));


        // Create ArrayAdapter
        //ArrayAdapter<AndroidVersion> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);

        CustomAdapter adapter = new CustomAdapter(this, R.layout.row, items);

        // Link the adapter to the listView
        listView.setAdapter(adapter);

    }
}