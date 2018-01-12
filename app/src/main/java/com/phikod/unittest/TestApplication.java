package com.phikod.unittest;

import android.app.Application;

/**
 * @author Philip
 * @since 2017-12-05
 */

public class TestApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Stetho.initializeWithDefaults(this);

//        if (BuildConfig.enableCrashlytics) {
        //initFabric();
//        }

    }
//
//    public static void initStetho(Application app) {
//        // Attach debug capabilities using Stetho only for debug builds
////        if (BuildConfig.DEBUG) {
//        Stetho.initializeWithDefaults(app);
//            com.facebook.stetho.Stetho.initialize(
//                    com.facebook.stetho.Stetho.newInitializerBuilder(app)
//                            .enableDumpapp(com.facebook.stetho.Stetho.defaultDumperPluginsProvider(app))
//                            .build());
////        }
//    }
}
