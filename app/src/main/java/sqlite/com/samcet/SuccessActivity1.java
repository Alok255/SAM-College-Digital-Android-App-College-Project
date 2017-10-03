package sqlite.com.samcet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SuccessActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success1);

        Intent intent = getIntent();
        String email = intent.getStringExtra(RegistrationActivity.USER_NAME);

        TextView tv = (TextView)findViewById(R.id.user_profile_name);
        tv.setText("Welcome "+email);
    }

    public void sendNofi(View view){
        Intent i = new Intent(this,SendNotifActivity.class);

        startActivity(i);
    }

    public void UploadStu(View view){
        Intent i = new Intent(this,UploadActivity.class);

        startActivity(i);
    }

    public void ApproveLeave(View view){
        Intent i = new Intent(this,AproveActivity.class);

        startActivity(i);
    }

    public void StuAttendance(View view){
        Intent i = new Intent(this,ViewActivity.class);

        startActivity(i);
    }

    public void QuesAns(View view){
        Intent i = new Intent(this,QueAnsActivity.class);

        startActivity(i);
    }
}
