package sqlite.com.samcet;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by AlokRaj on 12/2/2016.
 */
public class GalleryAdapter extends BaseAdapter {
    Activity activity;
    int[] images;

    public GalleryAdapter(Activity activity, int[] images) {
        super();
        this.activity = activity;
        this.images = images;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int arg0) {
        return arg0;
    }

    @Override
    public long getItemId(int arg0) {
        return arg0;
    }

    @Override
    public View getView(int arg0, View arg1, ViewGroup arg2) {


        ImageView iv = new ImageView(activity);
        iv.setImageResource(images[arg0]);
        return iv;
    }

}
