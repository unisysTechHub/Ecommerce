package com.exemplary.ecommerce.viewmodel;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.exemplary.ecommerce.database.productdatabase.ProductDataRepository;
import com.exemplary.ecommerce.database.table.Product;
import com.exemplary.ecommerce.database.table.ProductCategory;
import com.exemplary.ecommerce.database.table.ProductDesc;
import com.exemplary.ecommerce.database.table.ProductDetails;
import com.exemplary.ecommerce.database.table.ProductSubCategory;
import com.exemplary.ecommerce.di.EcommerceApp;
import com.exemplary.ecommerce.model.JunkData;
import com.exemplary.ecommerce.webservice.presenter.Webservice;
import com.exemplary.ecommerce.webservice.response.ProductListResponse;


import java.util.List;

import javax.inject.Inject;


public class ProductLisrViiewModel extends AndroidViewModel {
    public static String TAG = "@Ramesh";
    ProductDataRepository productDataRepository;
    LiveData<List<Product>> productsList;
    MutableLiveData produtListObservable= new MutableLiveData();
    public MutableLiveData<JunkData> junkDataMutableLiveData = new MutableLiveData<>();

    Webservice webservice;



    public void setWebservice(Webservice webservice) {
        this.webservice = webservice;
    }

    public void setProductDataRepository(ProductDataRepository productDataRepository) {
        this.productDataRepository = productDataRepository;

    }

    public ProductLisrViiewModel(@NonNull Application application)
    {
        super(application);







    }

    public  LiveData<List<com.exemplary.ecommerce.database.tuples.Product>> getProductListObservable()
    {


        return productDataRepository.getAllProducts("MIC1230001");
    }

   public void  insertProductDesciprtion()
    {

        Log.d(TAG, "insertProductDesciprtion");
        ProductDesc productDesc = new ProductDesc();
        productDesc.setProductDescId("MIC1230001DESC");
        productDesc.setProductDes1("Description 1");
        productDesc.setProductDes2("Description 2");
        productDesc.setProductDes3("Description 3");
        productDesc.setProductDes4("Description 4");
        productDataRepository.insertProductDesc(productDesc);
    }


    public void insertProductDetails()
    {
        Log.d(TAG, "insertProductDetails");
        ProductDetails productDetails = new ProductDetails();
        productDetails.setProductDetailsId("MIC1230001Details");
        productDetails.setBandName("Philips");
        productDetails.setColorList("Green White Yellow");
        productDetails.setProductDescId("MIC1230001DESC");
        productDetails.setSizeList("32 34 36 38");
        productDataRepository.insertProductDetails(productDetails);

    }

    public void insertCategory()
    {
        Log.d(TAG, "insertCategory");
                ProductCategory productCategory= new ProductCategory();
                productCategory.setCategoryCode("ELEC");
                productCategory.setCategpryName("Electronics");
                productDataRepository.insertProductCategory(productCategory);




    }
    public void instertSubCategory()
    {
        Log.d(TAG, "instertSubCategory");
        ProductSubCategory productSubCategory = new ProductSubCategory();
        productSubCategory.setSubCategoryCode("ELECDRIER");
        productSubCategory.setSubCategoryName("DRIERS");
        productDataRepository.insertProductSubCategory(productSubCategory);


    }
    public void insertProduct()
    {

        Log.d(TAG, "insertProduct");
        Product product = new Product();
        product.setProductId("MIC1230001");
        product.setCategory_code("ELEC");
        product.setSub_category_code("ELECDRIER");
        product.setDetails_id("MIC1230001Details");
        product.setProduct_price(100.00);
        product.setProductName("MIC Condenser Microphones");
        productDataRepository.insertProduct(product);

    }

    public void callService()
    {
        productDataRepository.serviceRequest(produtListObservable);
    }

    public void juckDatSrvice()
    {

        productDataRepository.getjuckData(junkDataMutableLiveData);
    }


}
