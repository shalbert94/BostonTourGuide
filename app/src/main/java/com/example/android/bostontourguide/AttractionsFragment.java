package com.example.android.bostontourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {

    private View rootView;
    private ArrayList<Place> placeArrayList = new ArrayList<>();
    public static final String ARG_PAGE = "ARG_PAGE";
    private int mPage;

    public static AttractionsFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        AttractionsFragment fragment = new AttractionsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

    public AttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.places_list, container, false);

        setupListView();

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        PlaceAdapter placeAdapter = new PlaceAdapter(getContext(), placeArrayList);
        listView.setAdapter(placeAdapter);

        return rootView;
    }

    private void setupListView() {
        placeArrayList.add(new Place("Feneuil Hall", "Outdoor marketplace", "http://cdn.clubzone.com/content/uploads/places/3048503/4.jpg"));
        placeArrayList.add(new Place("Fenway Park", "Sports stadium", "http://www.smartdestinations.com/img/pt/dest/Bos/att/Bos_Att_Fenway_Park_Tour/gallery/Fenway-Park-Tour-1.jpg" ));
        placeArrayList.add(new Place("New England Aquarium", null, "https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/Tunnelaquarium_14-05-2009_15-54-09.JPG/1024px-Tunnelaquarium_14-05-2009_15-54-09.JPG"));
        placeArrayList.add(new Place("Codzilla: Thrill Boat Ride", "Fast boat ride", "https://a.travel-assets.com/mediavault.le/media/52da507075c1f1cac6562366667624bb7a163331.jpeg"));
        placeArrayList.add(new Place("Whale Watching Cruise", null,"https://a.travel-assets.com/mediavault.le/media/88c42e2761b3b338d4c045e3341457358e8aa403.jpeg"));
        placeArrayList.add(new Place("Sam Adams Brewery Tour", null, "https://s-media-cache-ak0.pinimg.com/originals/5b/d9/57/5bd957d4cec34e7af8919fd4e0bf1617.jpg"));
        placeArrayList.add(new Place("Coit Observatory", "Boston University's observatory","https://www.google.de/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwiL2c_XvpzTAhVJ6xoKHS_2DAQQjRwIBw&url=https%3A%2F%2Fwww.bostonglobe.com%2Fmagazine%2F2014%2F12%2F07%2Ftips-for-enjoying-geminids-meteor-shower%2F4neByNdtDDNRa91sQGNgZN%2Fstory.html&bvm=bv.152180690,d.d2s&psig=AFQjCNHJvHFWOFgSwGchYuQNgi6oVQDBFA&ust=1492003047521184"));
        placeArrayList.add(new Place("Artisans Asylum", "Workshop studio","http://makerzone.mathworks.com/files/2015/01/artisans_asylum_velodrome.jpg" ));
        placeArrayList.add(new Place("Flat Top Johnny's", "Billiards bar", "https://static1.squarespace.com/static/536145d2e4b0c0f6c53f6d5f/53673742e4b08700007fcbe3/53673742e4b01e9923eccb80/1399273285745/1480740_10151974131620356_153756823724358215_n.png"));
        placeArrayList.add(new Place("Bleacher Bar", "Sports bar", "https://dcf54aygx3v5e.cloudfront.net/26999b2f-7c10-4962-918c-e964709e745d/9dc53ad9-d5ae-4526-b5ce-b6306fb917e6_h.jpg"));
        placeArrayList.add(new Place("Brooklyn Boulders", "Climbing gym", "http://blog.chowdaheadz.com/wp-content/uploads/2016/04/3023162-poster-p-ed-wonsek-collab-space-on-top-of-climbing-wall-in-back-of-shot.jpg"));
        placeArrayList.add(new Place("Central Bottle", "Wine tasting bar", "http://www.centralbottle.com/files/1414/6135/3969/bigwine.jpg"));
        placeArrayList.add(new Place("Top of the Hub", "High elevation bar", "http://topofthehub.net/wp-content/uploads/2016/06/headerimage21.jpg"));
        placeArrayList.add(new Place("Castle Island", null, "https://s-media-cache-ak0.pinimg.com/736x/f3/3a/4b/f33a4b1d2a415796c661eb7967f29254.jpg"));
        placeArrayList.add(new Place("Gondola di Venezia", "Gondola ride", "https://media-cdn.tripadvisor.com/media/photo-s/06/8c/84/03/gondola-di-venezia.jpg"));
        placeArrayList.add(new Place("Saloon", "Nice bar", "https://storage.googleapis.com/zgt-user/SaloonInterior_boston.jpg"));
        placeArrayList.add(new Place("Back Bar", "Nice bar", "http://assets.bonappetit.com/photos/575ae626f9990c0766591ea3/16:9/w_1200,c_limit/backbar-boston-bar.jpg"));
        placeArrayList.add(new Place("Drink", "Nice bar", "http://bostoncommon-magazine.com/get/files/image/migration/content_drink-boston-speakeasy.jpg"));
        placeArrayList.add(new Place("Brick and Mortar", "Nice bar", "http://punchdrink.com/wp-content/uploads/2014/11/boston-craftcocktailbars-brickandmortar.jpg"));
        placeArrayList.add(new Place("Algiers Coffee House", "Cafe", "http://www.cambridgelocalfirst.org/wp-content/uploads/2014/07/172_algiers2.jpg"));
        placeArrayList.add(new Place("Atwood's Tavern", "Patio bar", "https://cdn0.vox-cdn.com/thumbor/6gs5TnVx34LDxsTjCwMLidzYtFQ=/1x0:598x448/800x600/filters:format(webp)/cdn0.vox-cdn.com/uploads/chorus_image/image/49571335/10394090_10153411917476319_7705655435028226809_n.0.0.jpg"));
        placeArrayList.add(new Place("Escape Room", null, "https://c.o0bg.com/rf/image_1920w/Boston/2011-2020/2016/04/04/BostonGlobe.com/Travel/Images/DCEscapeRoomLivelobby_BTWImagesA.jpg"));
    }

}
