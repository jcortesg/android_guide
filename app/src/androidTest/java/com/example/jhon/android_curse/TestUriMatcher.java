package com.example.jhon.android_curse;

import android.net.Uri;
import android.test.AndroidTestCase;
import com.example.jhon.android_curse.data.WeatherContract;


/**
 * Created by jhon on 4/27/16.
 */
public class TestUriMatcher extends AndroidTestCase {
    private static final String LOCATION_QUERY = "London, UK";
    private static final long TEST_DATE = 1419033600L;  // December 20th, 2014
    private static final long TEST_LOCATION_ID = 10L;

    // content://com.example.android.sunshine.app/weather"
    private static final Uri TEST_WEATHER_DIR = WeatherContract.WeatherEntry.CONTENT_URI;
    private static final Uri TEST_WEATHER_WITH_LOCATION_DIR = WeatherContract.WeatherEntry.buildWeatherLocation(LOCATION_QUERY);
    private static final Uri TEST_WEATHER_WITH_LOCATION_AND_DATE_DIR = WeatherContract.WeatherEntry.buildWeatherLocationWithDate(LOCATION_QUERY, TEST_DATE);

    // content://com.example.android.sunshine.app/location"
    private static final Uri TEST_LOCATION_DIR = WeatherContract.LocationEntry.CONTENT_URI;
}
