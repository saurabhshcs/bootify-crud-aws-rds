package com.techsharezone.bootifycrudawsrds.repository;

/*
 * @created 08/11/2020 -05:02
 * @project bootify-crud-aws-rds
 * @author  saurabhshcs
 */


import com.techsharezone.bootifycrudawsrds.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}
