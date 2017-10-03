package sqlite.com.samcet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ServiceDetailActivity extends AppCompatActivity {


    ImageView iv;
    TextView tvTitle, tvDesc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_detail);

        iv = (ImageView) findViewById(R.id.iv);
        tvTitle = (TextView) findViewById(R.id.tv_title);
        tvDesc = (TextView) findViewById(R.id.tv_desc);

        String[] services = getResources().getStringArray(R.array.services);
        String[] details = getResources().getStringArray(R.array.services_details);
        int[] images = {R.drawable.engineering, R.drawable.education, R.drawable.nursing, R.drawable.management, R.drawable.girls_college};

        Bundle b = getIntent().getExtras();
        int index = b.getInt("index");

        iv.setImageResource(images[index]);
        tvTitle.setText(services[index]);
        tvDesc.setText(details[index]);
    }
}
