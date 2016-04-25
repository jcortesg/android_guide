package com.example.jhon.android_curse;

import android.support.v4.app.Fragment;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }

    /**
     *  A fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState){
            ArrayAdapter<String> mForecastAdapter;
            // Create some dummy data for the ListView.  Here's a sample weekly forecast
            String[] data = {
                    "Mon 6/23 - Sunny - 31/17",
                    "Tue 6/24 - Foggy - 21/8",
                    "Wed 6/25 - Cloudy - 22/17",
                    "Thurs 6/26 - Rainy - 18/11",
                    "Fri 6/27 - Foggy - 21/10",
                    "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
                    "Sun 6/29 - Sunny - 20/7"
            };

            List<String> weekForecast = new ArrayList<String>(Arrays.asList(data));

            mForecastAdapter = new ArrayAdapter<String>(
                    getActivity(),
                    R.layout.list_item_forecast,
                    R.id.list_item_forecast_textview,
                    weekForecast);


            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
            listView.setAdapter(mForecastAdapter);

            return rootView;
        }
    }
}
