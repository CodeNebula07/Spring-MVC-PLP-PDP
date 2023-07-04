package com.CtWebsite.Product.Controller;

import com.CtWebsite.Product.Service.ProductService;
import com.commercetools.api.models.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/product/query")
    public String queryResponse(Model model , @RequestParam(defaultValue = "500") String Limit) {
        List<Product> products = productService.QueryAllProducts(Limit).getResults();
        System.out.println(products);
        model.addAttribute("products", products);
        return "product-list";
    }



    @GetMapping("/product/query/{id}")
    public ModelAndView getProductById(@PathVariable String id) {
        ModelAndView modelAndView = new ModelAndView("productDetail");
        Product product = productService.getProductById(id);
        modelAndView.addObject("product", product);
        return modelAndView;
    }
}
