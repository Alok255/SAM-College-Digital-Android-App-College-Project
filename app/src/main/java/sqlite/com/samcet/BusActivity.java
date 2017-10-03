package sqlite.com.samcet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class BusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);
        ListView lv = (ListView) findViewById(R.id.lv);

        String[] titls = {"Ashish Kumar\n Bhopal", "Roshan Sharma\nAshoka Garden, Bhopal", "Vikalp\nKolar Road, Bhopal, Madhya Pradesh"};


        int[] imgs = {R.drawable.businessman1,R.drawable.businessman1,R.drawable.businessman1};

        MyAdapter ad = new MyAdapter(this, titls, imgs);
        lv.setAdapter(ad);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


            }
        });

    }
}
