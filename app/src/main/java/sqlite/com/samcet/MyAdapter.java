package sqlite.com.samcet;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by AlokRaj on 12/5/2016.
 */

public class MyAdapter extends BaseAdapter {

    Activity mAc;
    String[] mArr1;
    int[] mArr2;

    public MyAdapter(Activity ac, String[] arr1, int[] arr2){
        mAc = ac;
        mArr1 = arr1;
        mArr2 = arr2;
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
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = mAc.getLayoutInflater().inflate(R.layout.list_item, null);

        ImageView iv = (ImageView) v.findViewById(R.id.iv);
        TextView tv = (TextView) v.findViewById(R.id.tv);

        iv.setImageResource(mArr2[position]);
        tv.setText(mArr1[position]);

        return v;
    }



}


