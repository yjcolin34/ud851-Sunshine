package com.example.android.sunshine.utilities;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.util.Log;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.sunshine.R;

import java.util.zip.Inflater;

import static android.content.ContentValues.TAG;

/**
 * Adapater
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {

    private String[] mWeatherData;

    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflate the list item xml into a view
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        int layoutId = R.layout.forecast_list_item;
        boolean shouldAttatchToParentImmediately = false;

        View view = inflater.inflate(layoutId,parent,shouldAttatchToParentImmediately);
        return new ForecastAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder holder, int position) {
        String weatherofDay = mWeatherData[position];
        holder.mWeatherTextView.setText(weatherofDay);
    }


    @Override
    public int getItemCount() {

        if(mWeatherData == null)
            return 0;
        return mWeatherData.length;
    }
    
    public void setWeatherData (String [] weatherData){
        mWeatherData = weatherData;
        notifyDataSetChanged();
    }

    /**
     * ViewHolder
     */
    class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {

        public final TextView mWeatherTextView;
        public ForecastAdapterViewHolder(View itemView) {
            super(itemView);
            mWeatherTextView = (TextView) itemView.findViewById(R.id.tv_weather_data);
        }

    }
}

