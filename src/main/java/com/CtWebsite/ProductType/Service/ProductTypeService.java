package com.CtWebsite.ProductType.Service;

import com.CtWebsite.ProductType.Repo.ProductTypeRepo;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.product_type.ProductType;
import com.commercetools.api.models.product_type.ProductTypeDraft;
import com.commercetools.api.models.product_type.ProductTypePagedQueryResponse;
import com.commercetools.api.models.product_type.ProductTypeUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductTypeService {

    @Autowired
    ProductTypeRepo productTypeRepo;

    @Autowired
    ProjectApiRoot apiRoot;


    // Creating Product Type
    public ProductType createProductType(ProductTypeDraft productTypeDraft) {
        return productTypeRepo.createProductType(productTypeDraft);
    }

    // Update Product Type
    public ProductType updateProductTypeById(ProductTypeUpdate productTypeUpdate , String id)
    {
      ProductType updateProductType = apiRoot
              .productTypes()
              .withId(id)
              .post(productTypeUpdate)
              .executeBlocking()
              .getBody();

      return updateProductType;
    }

    // Get All Product Types
    public ProductTypePagedQueryResponse getAllProductTypes(String limit)
    {

        ProductTypePagedQueryResponse productType = apiRoot
                .productTypes()
                .get()
                .withLimit(limit)
                .executeBlocking()
                .getBody();
        return productType;
    }
}
