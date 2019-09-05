package com.exemplary.ecommerce.webservice;

public interface Callback<T>  {
     void notify(T response);
}
