package com.techsharezone.bootifycrudawsrds.controller;

/*
 * @created 08/11/2020 -04:57
 * @project bootify-crud-aws-rds
 * @author  saurabhshcs
 */

import com.techsharezone.bootifycrudawsrds.entity.Product;
import com.techsharezone.bootifycrudawsrds.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }
    
    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return service.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts(){
        return service.findAllProducts();
    }    
}
