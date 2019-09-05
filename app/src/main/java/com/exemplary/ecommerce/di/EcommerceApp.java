package com.exemplary.ecommerce.di;

import android.app.Application;
import android.content.Context;

public class EcommerceApp extends Application {
   public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        this.context=getApplicationContext();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    public AppModuleComponent getObjectGraph()
    {
                AppModuleComponent appModuleComponent=DaggerAppModuleComponent.builder().appModule(new AppModule(this)).build();

        return appModuleComponent;

    }

    public static AppModuleComponent getObjectGraph(Context context) {
        return ((EcommerceApp) context).getObjectGraph();
    }

}
