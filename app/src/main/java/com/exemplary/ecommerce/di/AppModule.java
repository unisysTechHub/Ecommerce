package com.exemplary.ecommerce.di;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;

@Module
@Singleton
public class AppModule extends AppBaseModulle {

    AppModule(Application application)
    {
        super(application);

    }

}
