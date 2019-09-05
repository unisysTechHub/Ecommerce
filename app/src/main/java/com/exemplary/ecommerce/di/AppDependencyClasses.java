package com.exemplary.ecommerce.di;

import com.exemplary.ecommerce.database.productdatabase.ProductDataRepository;
import com.exemplary.ecommerce.database.productdatabase.ProductDatabase;
import com.exemplary.ecommerce.viewmodel.ProductLisrViiewModel;
import com.exemplary.ecommerce.webservice.presenter.Webservice;

public interface AppDependencyClasses {
    void inject(EcommerceApp ecommerceApp);
    void inject(Webservice webservice);
    void inject(ProductDataRepository productDataRepository);


    ProductDatabase productDatabaseProvider();
}
