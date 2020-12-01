package com.example.location_helper;

import android.location.Location;

class LocationHelper {

    public static float getDistanceInKM(double startLatitude,double endLatitude,double startLongitude,double endLongitude){
      float[] result = new float[0];

        Location.distanceBetween(startLongitude,endLongitude,startLatitude,endLatitude,result);

        return result[0]/1000;


    }

}
