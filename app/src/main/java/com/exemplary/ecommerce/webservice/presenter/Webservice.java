package com.exemplary.ecommerce.webservice.presenter;

import android.app.Application;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.exemplary.ecommerce.model.JunkData;
import com.exemplary.ecommerce.webservice.Resource;
import com.exemplary.ecommerce.webservice.WebserviceRequest;


import org.json.JSONObject;

import java.util.HashMap;

import javax.inject.Inject;

public class Webservice {
    Application context;
    WebserviceRequest webserviceRequest;
    public static String TAG ="@Ramesh";
    public static String BASEURl;

    @Inject
    public Webservice(Application application, WebserviceRequest webserviceRequest)
    {
        this.context=application;
        this.webserviceRequest=webserviceRequest;
    }

    public  <T> void getPruductList(Class<T> var, MutableLiveData<T> mResult)
    {
                        HashMap<String,String> headers= new HashMap<>();


                     Resource resource= new Resource.Builder()
                    .setRequestMethod(Resource.Method.POST)
                            .setHeaders(headers)
                            .setResposeClass(var).SetRequestBody(new JSONObject()).build();


        Log.d(TAG,"product List webseri");


    }

  public  void getJunkData(MutableLiveData resut)
    { String url = "http://api.nytimes.com/svc/books/v2/lists/overview.json?published_date=2013-01-01";
        HashMap<String,String> headers= new HashMap<>();
        headers.put("Content-Type", "application/json");

        Resource resource= new Resource.Builder()
                .setRequestMethod(Resource.Method.POST).setUrl(url)
                .setHeaders(headers)
                .setResposeClass(JunkData.class).build();
        webserviceRequest.executeRequest(JunkData.class,resource,resut);

    }


}
