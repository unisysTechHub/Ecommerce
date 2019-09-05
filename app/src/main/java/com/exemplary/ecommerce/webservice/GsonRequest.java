package com.exemplary.ecommerce.webservice;

import android.util.Log;

import androidx.annotation.Nullable;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.util.Map;

public class GsonRequest<T> extends Request<T> {
    public static String TAG ="@WEBSERVICE";
     Gson gson = new Gson();
     Class<?> clazz;
     Map<String,String> headers;
     JSONObject requestBody;
     Response.Listener<T> listener;

    public GsonRequest(Class<?> clazz,Resource resource ,Response.Listener<T> listener ,@Nullable Response.ErrorListener errorListener) {
        super(resource.method, resource.url, errorListener);
        this.clazz=clazz;
        this.requestBody=resource.requestBody;
        this.headers=resource.headers;
        this.listener=listener;
        Log.d(TAG,"gson request constructor" + resource.url);

    }

    @Override
    public Map<String, String> getHeaders() {
        return headers;
    }

    @Override
    protected Response<T> parseNetworkResponse(NetworkResponse response) {
        Log.d(TAG,"networkresponse");
        try {

            String json = new String(
                    response.data,
                    HttpHeaderParser.parseCharset(response.headers));
            Log.d(TAG,json);
            return  Response.success(
                    (T)gson.fromJson(json, clazz),
                    HttpHeaderParser.parseCacheHeaders(response));
        } catch (UnsupportedEncodingException e) {
            return Response.error(new ParseError(e));
        } catch (JsonSyntaxException e) {
            return Response.error(new ParseError(e));
        }

    }



    @Override
    protected void deliverResponse(T response) {
        listener.onResponse(response);
    }



}
