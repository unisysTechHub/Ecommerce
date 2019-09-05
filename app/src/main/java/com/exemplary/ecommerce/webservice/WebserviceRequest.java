package com.exemplary.ecommerce.webservice;

import android.app.Application;
import android.content.Context;
import android.util.Log;


import androidx.lifecycle.MutableLiveData;


import javax.inject.Inject;

public class WebserviceRequest implements RequestExecutor {
    Context context;
    public static String TAG ="@WEBSERVICE";

   @Inject
   public WebserviceRequest(Application application)
            {
                this.context=application;
            }

    @Override
    public <T> void executeRequest(Class<T> responseClass, Resource resource, MutableLiveData mResult ) {
        Log.d(TAG,"ExecuteRequest");

        GsonRequest<T> gsonRequest = new GsonRequest<>(responseClass, resource,
                 response -> {
                    mResult.setValue(response);
                    Log.d(TAG,"On Response");


                 }, error -> {

                         Log.d(TAG,error.getLocalizedMessage());
        }

                );


        AppNetworkRequester.getInstance(context).getRequestQueue().add(gsonRequest);
    }


}
