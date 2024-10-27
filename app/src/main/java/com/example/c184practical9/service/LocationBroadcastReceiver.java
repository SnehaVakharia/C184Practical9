package com.example.c184practical9.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.c184practical9.MainActivity;

public class LocationBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("LOCATION_UPDATE")) {
            ((MainActivity) context).disableStartButton();
        }
    }
}