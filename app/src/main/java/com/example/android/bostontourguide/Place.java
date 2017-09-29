package com.example.android.bostontourguide;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.net.URL;

/**
 * Created by shalom on 2017-04-10.
 */

public class Place {
    private String imageUrlString;
    private URL imageUrl;
    private String placeName;
    private String breifDescription;

    public Place(String placeName, String breifDescription, String imageUrlString) {
        this.imageUrlString = imageUrlString;
        this.placeName = placeName;
        this.breifDescription = breifDescription;
    }

    public Bitmap getImage() throws IOException {
        imageUrl = new URL(imageUrlString);
        Bitmap bitmap = BitmapFactory.decodeStream(imageUrl.openConnection().getInputStream());

        return bitmap;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getBreifDescription() {
        return breifDescription;
    }

}
