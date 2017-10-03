package sqlite.com.samcet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

public class GalleryActivity extends AppCompatActivity {


    ImageView image;
    Gallery gallery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        image = (ImageView) findViewById(R.id.image);
        gallery = (Gallery) findViewById(R.id.gallery);

        final int[] images = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4,R.drawable.img6,R.drawable.img7,R.drawable.img8,R.drawable.img9,R.drawable.img10};

        GalleryAdapter ad = new GalleryAdapter(this, images);
        gallery.setAdapter(ad);

        image.setImageResource(images[0]);
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {

                image.setImageResource(images[arg2]);
            }
        });
    }
}
