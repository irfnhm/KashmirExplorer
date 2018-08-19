package com.example.irfan.explorekashmir;

public class Place {

    //Place name
    private String mPlaceName;

    //Opening hours
    private String mOpeningHours;

    //Image resource id for the place.
    private int mImageResourceId;

    //Rating for the place.
    private float mRating;

    /**
     * Create a new Place object.
     *
     * @param placeName       is the place name of the place
     * @param openingHours    is the opening hours of the place.
     * @param imageResourceId is the id of the place image
     **/
    public Place(String placeName, String openingHours, int imageResourceId) {
        mPlaceName = placeName;
        mOpeningHours = openingHours;
        mImageResourceId = imageResourceId;
    }

    //Get the place name for the place
    public String getPlaceName() {
        return mPlaceName;
    }

    //Get the opening hour of the place
    public String getOpeningHours() {
        return mOpeningHours;
    }

    //Get the image Resource id for the place
    public int getImageResourceId() {
        return mImageResourceId;
    }
}