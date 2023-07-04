package com.CtWebsite.ProductType.Repo;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.product_type.ProductType;
import com.commercetools.api.models.product_type.ProductTypeDraft;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductTypeRepo {

    private final ProjectApiRoot apiRoot;

    @Autowired
    public ProductTypeRepo(ProjectApiRoot apiRoot) {
        this.apiRoot = apiRoot;
    }

    public ProductType createProductType(ProductTypeDraft draft) {
        return apiRoot.productTypes().post(draft).executeBlocking().getBody();
    }
}
