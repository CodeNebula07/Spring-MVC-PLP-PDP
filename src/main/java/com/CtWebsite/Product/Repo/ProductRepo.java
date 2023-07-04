package com.CtWebsite.Product.Repo;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.product.Product;
import com.commercetools.api.models.product.ProductDraft;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductRepo {

    @Autowired
    ProjectApiRoot apiRoot;

    public Product createProduct(ProductDraft productDraft) {
        return apiRoot.products().post(productDraft).executeBlocking().getBody();
    }
}
