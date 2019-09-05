package com.exemplary.ecommerce.di;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceManager;
import com.exemplary.ecommerce.database.productdatabase.ProductDatabase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
@Module
@Singleton
public class AppBaseModulle {
    Application context;
    AppBaseModulle(Application application)
    {
        this.context=application;
    }

    @Provides
    public SharedPreferences sharedPreferencesProvider()
    {

        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Provides
    public Application applicationprovider()
    {
        return context;
    }

    @Provides
    public ProductDatabase productDatabaseProvider()
    {
        return ProductDatabase.getInstance(this.context);
    }

}
