/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // COMPLETED (1) Create a field to store the weather display TextView
    TextView weatherDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // COMPLETED (2) Use findViewById to get a reference to the weather display TextView
        weatherDisplay = (TextView)findViewById(R.id.tv_weather_data);
        // COMPLETED (3) Create an array of Strings that contain fake weather data
        String weather [] = {

                "Tonight: Scattered snow showers, mainly before 9pm.",
                "Friday: Partly sunny, with a high near 20. North wind 10 to 15 mph.",
                "Friday Night: Partly cloudy, with a low around -2. North wind around 15 mph.",
                "Saturday: Sunny, with a high near 3. North wind around 15 mph, with gusts as high as 25 mph.",
                "Saturday Night: Mostly clear, with a low around -8.",
                "Sunday: Mostly sunny, with a high near 4.",
                "Sunday Night: Mostly cloudy, with a low around -4.",
                "Monday: Partly sunny, with a high near 4.",
                "Monday Night: Partly cloudy, with a low around -5.",
                "Tuesday: Mostly sunny, with a high near 6.",
                "Tuesday Night: A chance of snow showers. Partly cloudy, with a low around -4.",
                "Wednesday: A chance of snow. Mostly sunny, with a high near 7.",
} ;
        // COMPLETED (4) Append each String from the fake weather data array to the TextView
        for(String text : weather)
            weatherDisplay.append(text+"\n\n\n");
    }
}