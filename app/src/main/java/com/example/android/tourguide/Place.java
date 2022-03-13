package com.example.android.tourguide;

import java.io.Serializable;

public class Place implements Serializable {

    private String mPlaceName;
    private String mAddress;
    private int mImageResourceId;

    public Place(String placeName, String address, int imageResourceId) {
        mPlaceName = placeName;
        mAddress = address;
        mImageResourceId = imageResourceId;
    }

    public String getPlaceName() {
        return mPlaceName;
    }
    public String getAddress() { return mAddress; }
    public int getImageResourceId() { return mImageResourceId; }
}
