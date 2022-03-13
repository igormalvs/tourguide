package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class CurrentPlace3 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current3);
        getIncomingIntent();

    }

    private void getIncomingIntent() {

        if (getIntent().hasExtra("place")){
            Place place = (Place) getIntent().getSerializableExtra("place");
            setPlace(place.getPlaceName());
            setAddress(place.getAddress());
            setImage(place.getImageResourceId());
        }
    }

    private void setPlace(String placeName) {

        TextView name = (TextView) findViewById(R.id.place_current);
        name.setText(placeName);
    }

    private void setAddress(String address) {

        TextView name = (TextView) findViewById(R.id.address_current);
        name.setText(address);
    }

    private void setImage(int imageResourceId) {

        ImageView image = (ImageView) findViewById(R.id.image_current);
        image.setImageResource(imageResourceId);
    }

}
