package sqlite.com.samcet;

import android.Manifest;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);




        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();


        findViewById(R.id.btn_curr_loc).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (ActivityCompat.checkSelfPermission(MapsActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(MapsActivity.this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    mMap.setMyLocationEnabled(false);
                    return;
                }
                mMap.setMyLocationEnabled(true);
            }
        });
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.animateCamera( CameraUpdateFactory.zoomTo( 25.0f ) );

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(23.2636765, 77.45757549999996);
            mMap.addMarker(new MarkerOptions().position(sydney).title("BUS R1").snippet("J K Road, Bhopal").icon(BitmapDescriptorFactory.fromResource(R.drawable.mar1)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        LatLng samc = new LatLng(23.2599856, 77.43188950000001);
        mMap.addMarker(new MarkerOptions().position(samc).title("BUS R2").snippet("Ashoka Garden, Bhopal, Madhya Pradesh").icon(BitmapDescriptorFactory.fromResource(R.drawable.mar1)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(samc));

        LatLng samco = new LatLng(23.1715, 77.4128);
        mMap.addMarker(new MarkerOptions().position(samco).title("BUS R3").snippet("Kolar Road, Bhopal, Madhya Pradesh").icon(BitmapDescriptorFactory.fromResource(R.drawable.mar1)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(samco));

        LatLng samca = new LatLng(23.1715, 77.4128);
        mMap.addMarker(new MarkerOptions().position(samca).title("BUS R4").snippet("Kolar Road, Bhopal, Madhya Pradesh").icon(BitmapDescriptorFactory.fromResource(R.drawable.mar1)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(samca));

        LatLng samcb = new LatLng(23.2599333,77.41261499999996);
        mMap.addMarker(new MarkerOptions().position(samcb).title("BUS R5").snippet("Raishan Bhopal, Madhya Pradesh").icon(BitmapDescriptorFactory.fromResource(R.drawable.mar1)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(samcb));

        mMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(this, R.raw.style_json));
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Maps Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://sqlite.com.samcet/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Maps Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://sqlite.com.samcet/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }



}
