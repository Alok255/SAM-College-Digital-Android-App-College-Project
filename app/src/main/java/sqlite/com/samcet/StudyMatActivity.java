package sqlite.com.samcet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class StudyMatActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_mat);
        ListView lv=(ListView) findViewById(R.id.lv);
        int[] image={R.drawable.a,R.drawable.b,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j};
        String[] titles = {"OS","TOC","Data Com","CGM","DBMS","Linux","OS1","DBMS 1","Data Com 2"};
        MyAdapter1 Ad = new MyAdapter1(this,image,titles);
        lv.setAdapter(Ad);

    }
}
