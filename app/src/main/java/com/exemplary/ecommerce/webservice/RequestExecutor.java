package com.exemplary.ecommerce.webservice;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public interface RequestExecutor {

    <T> void executeRequest(Class<T> responseClass, Resource resource, MutableLiveData result);

}
