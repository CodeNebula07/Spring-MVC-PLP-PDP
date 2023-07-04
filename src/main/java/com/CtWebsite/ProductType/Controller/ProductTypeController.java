package com.CtWebsite.ProductType.Controller;


import com.CtWebsite.ProductType.Service.ProductTypeService;
import com.commercetools.api.models.product_type.ProductType;
import com.commercetools.api.models.product_type.ProductTypeDraft;
import com.commercetools.api.models.product_type.ProductTypePagedQueryResponse;
import com.commercetools.api.models.product_type.ProductTypeUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductTypeController {

    @Autowired
    ProductTypeService productTypeService;

    // Creating Product Type
    @PostMapping("/productType/create")
    public ProductType createProductType(@RequestBody ProductTypeDraft productTypeDraft) {
        return productTypeService.createProductType(productTypeDraft);
    }

    // Update Product Type
    @PostMapping("/productType/update/{id}")
    public ProductType updateProductType(@RequestBody ProductTypeUpdate productTypeUpdate ,
                                         @PathVariable String id)
    {
        return productTypeService.updateProductTypeById(productTypeUpdate, id);
    }

    // Get All Product Types
    @GetMapping("/productType/Query")
    public ProductTypePagedQueryResponse getAllProductTypes(@RequestParam(required = false) String Limit)
    {
        return productTypeService.getAllProductTypes(Limit);
    }

}
