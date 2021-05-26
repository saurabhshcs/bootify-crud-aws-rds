package com.techsharezone.bootifycrudawsrds.service;

/*
 * @created 27/05/2021 -05:01
 * @project bootify-crud-aws-rds
 * @author  saurabhshcs
 */

import com.techsharezone.bootifycrudawsrds.entity.Product;
import com.techsharezone.bootifycrudawsrds.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product saveProduct(final Product product){
        return repository.save(product);
    }

    public List<Product> saveProducts(final List<Product> products){
        return repository.saveAll(products);
    }

    public List<Product> findAllProducts(){
        return repository.findAll();
    }

    public Product findProductById(final Integer id){
        return repository.findById(id).orElse(null);
    }

    public Product findProductByName(final String name){
        return repository.findByName(name);
    }

    public String removeProduct(final Integer id){
        repository.deleteById(id);
        return "Product has been removed " + id;
    }

    public Product updateProduct(Product product) {
        Product existingProduct = repository.findById(product.getId().intValue()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQty(product.getQty());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }
}
