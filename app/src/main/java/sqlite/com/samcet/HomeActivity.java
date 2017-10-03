package sqlite.com.samcet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        findViewById(R.id.bus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5 = new Intent(HomeActivity.this,BusActivity.class);
                startActivity(i5);
            }
        });

        findViewById(R.id.map).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(HomeActivity.this,CustomerActivity.class);
                startActivity(i4);
            }
        });

        findViewById(R.id.user_reg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(HomeActivity.this,FeedBackActivity.class);
                startActivity(i2);
            }
        });

        findViewById(R.id.home1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(HomeActivity.this,CollegeActivity.class);
                startActivity(i2);
            }
        });
        findViewById(R.id.user_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(HomeActivity.this,Login2Activity.class);
                startActivity(i3);
            }
        });

        findViewById(R.id.gall).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(HomeActivity.this,LoginActivity.class);
                startActivity(i1);
            }
        });


    }
}
