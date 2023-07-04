package com.CtWebsite.Product.Service;


import com.CtWebsite.Product.Repo.ProductRepo;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.ResourcePagedQueryResponse;
import com.commercetools.api.models.product.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;
    @Autowired
    ProjectApiRoot apiRoot;


    // Create A Product
    public Product createProduct (ProductDraft productDraft)
    {
        return productRepo.createProduct(productDraft);
    }

     // Get All Product
    public ProductPagedQueryResponse QueryAllProducts(String Limit ) {
        ProductPagedQueryResponse queryResponse = apiRoot
                .products()
                .get()
                .addLimit(Limit)
                .executeBlocking()
                .getBody();
        return  queryResponse;
    }

    // update product by Id
    public Product productUpdate(ProductUpdate productUpdate , String id)
    {
        Product update = apiRoot
                .products()
                .withId(id)
                .post(productUpdate)
                .executeBlocking()
                .getBody();
        return update;
    }

    // Get Product By id
    public Product getProductById(String id) {

        Product product= apiRoot
                .products()
                .withId(id)
                .get()
                .executeBlocking()
                .getBody();
        return  product;
    }

}
