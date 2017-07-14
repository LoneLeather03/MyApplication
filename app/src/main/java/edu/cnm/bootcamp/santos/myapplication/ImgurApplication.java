package edu.cnm.bootcamp.santos.myapplication;

import android.app.Application;

import edu.cnm.bootcamp.santos.myapplication.api.API;

/**
 * Created by David Martinez on 7/14/2017.
 */

public class ImgurApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        API.init();
    }
}
