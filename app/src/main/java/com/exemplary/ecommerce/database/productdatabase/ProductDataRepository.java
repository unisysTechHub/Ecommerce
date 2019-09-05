package com.exemplary.ecommerce.database.productdatabase;

import android.os.AsyncTask;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.exemplary.ecommerce.database.table.ProductCategory;
import com.exemplary.ecommerce.database.table.ProductDesc;
import com.exemplary.ecommerce.database.table.ProductDetails;
import com.exemplary.ecommerce.database.table.ProductSubCategory;
import com.exemplary.ecommerce.database.tuples.Product;
import com.exemplary.ecommerce.di.EcommerceApp;
import com.exemplary.ecommerce.webservice.presenter.Webservice;
import com.exemplary.ecommerce.webservice.response.ProductListResponse;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ProductDataRepository {


    ProductDatabase productDatabase;
    @Inject
    Webservice webservice;

    @Inject
    public ProductDataRepository(ProductDatabase productDatabase)
    {

        EcommerceApp.getObjectGraph(EcommerceApp.context).inject(this);
        this.productDatabase=productDatabase;
        this.webservice=webservice;
    }

    public LiveData<List<Product>> getAllProducts(String productName)
    {

        return productDatabase.productTableDao().getAllProductDetails(productName);
    }


    public void insertProduct(com.exemplary.ecommerce.database.table.Product product)
    {
                new InsertProductAsync().execute(product);

    }

    public void insertProductCategory(ProductCategory productCategory)
    {
        new InsertCategoryAysnc().execute(productCategory);

    }

    public void insertProductSubCategory(ProductSubCategory productSubCategory)
    {
        new InstertProductSubcategoryAsync().execute(productSubCategory);
    }


    public void insertProductDesc(ProductDesc productDesc)
    {
        new InsertProductDescAsyn().execute(productDesc);
    }

    public void insertProductDetails(ProductDetails productDetails)
    {

        new InsertPrdoctDetailAsync().execute(productDetails);
    }

    class InsertProductAsync extends AsyncTask<com.exemplary.ecommerce.database.table.Product,Void,Void>
    {
        @Override
        protected Void doInBackground(com.exemplary.ecommerce.database.table.Product... products) {
              productDatabase.productTableDao().insertProduct(products[0]);
            return null;
        }
    }

    class InsertCategoryAysnc extends AsyncTask<ProductCategory, Void,Void>
    {


        @Override
        protected Void doInBackground(ProductCategory... productCategories) {
              productDatabase.productCategoryDao().insterCategoreis(productCategories[0]);
            return null;
        }
    }

    class InsertProductDescAsyn extends AsyncTask<ProductDesc,Void,Void>
    {

        @Override
        protected Void doInBackground(ProductDesc... productDescs) {
            productDatabase.productDescDao().insertProductDesc(productDescs[0]);
            return null;
        }
    }

    class InsertPrdoctDetailAsync extends AsyncTask<ProductDetails,Void,Void>
    {


        @Override
        protected Void doInBackground(ProductDetails... productDetails) {
                productDatabase.productDescDao().insertProductDetail(productDetails[0]);
            return null;
        }
    }

    class InstertProductSubcategoryAsync extends AsyncTask<ProductSubCategory, Void,Void>
    {


        @Override
        protected Void doInBackground(ProductSubCategory... productSubCategories) {
            productDatabase.productCategoryDao().insertSubCategories(productSubCategories[0]);
            return null;
        }
    }


    public   void  serviceRequest(MutableLiveData result)
     {

         webservice.getPruductList(ProductListResponse.class,result);

     }

    public void  getjuckData(MutableLiveData result)
    {
        webservice.getJunkData(result);
    }
}
