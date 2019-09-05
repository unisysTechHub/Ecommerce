package com.exemplary.ecommerce;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModelStore;
import androidx.room.Insert;

import android.os.Bundle;
import android.util.Log;

import com.exemplary.ecommerce.database.productdatabase.ProductDataRepository;
import com.exemplary.ecommerce.database.tuples.Product;
import com.exemplary.ecommerce.di.EcommerceApp;
import com.exemplary.ecommerce.viewmodel.ProductLisrViiewModel;
import com.exemplary.ecommerce.webservice.presenter.Webservice;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    ProductDataRepository productDataRepository;




    public static String TAG = "@Ramesh";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EcommerceApp.getObjectGraph(this.getApplicationContext()).inject(this);
        ProductLisrViiewModel productLisrViiewModel= ViewModelProviders.of(this).get(ProductLisrViiewModel.class);
        productLisrViiewModel.setProductDataRepository(productDataRepository);
        productLisrViiewModel.callService();
        productLisrViiewModel.getProductListObservable().observe(this,
                productsList -> {
                    Log.d(TAG, "observer" + productsList.size());
                    for(Product product : productsList)
                    {  Log.d(TAG, product.getPoductId() );
                        Log.d(TAG,product.getName());
                        Log.d(TAG,product.getCategory());
                        Log.d(TAG,product.getSubCategory());
                        }

                }
                );

        productLisrViiewModel.junkDataMutableLiveData.observe(this,
                data -> {Log.d(TAG,data.getJunkDataSubClass().getFaultString());});
        productLisrViiewModel.juckDatSrvice();

//        productLisrViiewModel.insertCategory();
//          productLisrViiewModel.instertSubCategory();
//        productLisrViiewModel.insertProductDesciprtion();
//        productLisrViiewModel.insertProductDetails();
//        productLisrViiewModel.insertProduct();
    }
}
