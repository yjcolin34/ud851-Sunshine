package com.example.android.sunshine.sync;
// TODO (5) Create a new class called SunshineSyncIntentService that extends IntentService
//  TODO (6) Create a constructor that calls super and passes the name of this class
//  TODO (7) Override onHandleIntent, and within it, call SunshineSyncTask.syncWeather

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import com.example.android.sunshine.sync.SunshineSyncTask;
import com.example.android.sunshine.utilities.SunshineWeatherUtils;
import java.io.IOException;
import org.json.JSONException;

public class SunshineSyncIntentService extends IntentService{


  /**
   * Creates an IntentService.  Invoked by your subclass's constructor.
   *
   * @param name Used to name the worker thread, important only for debugging.
   */
  public SunshineSyncIntentService() {
    super("SunshineSyncIntentService");
  }

  @Override
  protected void onHandleIntent(@Nullable Intent intent) {
    try {
      SunshineSyncTask.syncWeather(this);
    } catch (IOException e) {
      e.printStackTrace();
    } catch (JSONException e) {
      e.printStackTrace();
    }
  }
}