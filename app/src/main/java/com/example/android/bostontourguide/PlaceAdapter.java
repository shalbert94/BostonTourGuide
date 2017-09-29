package com.example.android.bostontourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by shalom on 2017-04-11.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    //ArrayList which contains Class Place objects
    ArrayList<Place> placeArrayList;


    public PlaceAdapter(Context context, ArrayList<Place> placeArrayList) {
        super(context, 0, placeArrayList);
        this.placeArrayList = placeArrayList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Place place = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.place_list_item, parent, false);
        }

        ImageView listItemPicture = (ImageView) convertView.findViewById(R.id.list_item_picture);
        TextView listItemName = (TextView) convertView.findViewById(R.id.list_item_name);
        TextView listItemDescription = (TextView) convertView.findViewById(R.id.list_item_description);

        try {
            listItemPicture.setImageBitmap(place.getImage());
        } catch (IOException e) {
            e.printStackTrace();
        }

        listItemName.setText(place.getPlaceName());
        listItemDescription.setText(place.getBreifDescription());


        return convertView;
    }
}
