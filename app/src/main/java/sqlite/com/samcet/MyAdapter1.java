package sqlite.com.samcet;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by AlokRaj on 12/21/2016.
 */

public class MyAdapter1 extends BaseAdapter {
    Activity mAc;
    int[] mArr1;
    String[] mArr2;

    public MyAdapter1(Activity ac, int[] arr1, String[] arr2){
        mAc=ac;
        mArr1=arr1;
        mArr2=arr2;
    }
    @Override
    public int getCount() {
        return mArr1.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {


        View vi = mAc.getLayoutInflater().inflate(R.layout.list_item5, null);
        ImageView iv =(ImageView) vi.findViewById(R.id.iv);
        TextView tv = (TextView) vi.findViewById(R.id.tv);
        iv.setImageResource(mArr1[position]);
        tv.setText(mArr2[position]);

        vi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mAc, "You Clicked "+mArr2[position], Toast.LENGTH_LONG).show();
            }
        });
        return vi;
    }
}
