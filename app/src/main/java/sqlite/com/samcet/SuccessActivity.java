package sqlite.com.samcet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static sqlite.com.samcet.RegistrationActivity.USER_NAME;

public class SuccessActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        Intent intent = getIntent();
        String email = intent.getStringExtra(USER_NAME);

        TextView tv = (TextView)findViewById(R.id.user_profile_name);
        tv.setText("Welcome "+email);



    }
    public void LeaveApp(View view){
        Intent i = new Intent(this,StuLeaveActivity.class);

        startActivity(i);
    }
    public void Attendance(View view){
        Intent i = new Intent(this,AttendanceActivity.class);
        startActivity(i);
    }
    public void ViewAtt(View view){
        Intent i = new Intent(this,ViewAttActivity.class);
        startActivity(i);
    }

    public void ToDa(View view){
        Intent i = new Intent(this,NotifActivity.class);
        startActivity(i);
    }

    public void StudyMat(View view){
        Intent i = new Intent(this,StudyMatActivity.class);
        startActivity(i);
    }

}
