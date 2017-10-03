package sqlite.com.samcet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {



            // Using handler with postDelayed called runnable run method



            @Override

            public void run() {

                Intent i = new Intent(SplashActivity.this, HomeActivity.class);

                startActivity(i);



                // close this activity

                finish();

            }

        }, 5*1000); // wait for 5 seconds



    }



    @Override

    protected void onDestroy() {



        super.onDestroy();

    }
}
