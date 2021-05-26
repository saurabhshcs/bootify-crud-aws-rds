package com.techsharezone.bootifycrudawsrds.entity;

/*
 * @created 08/11/2020 -04:57
 * @project bootify-crud-aws-rds
 * @author  saurabhshcs
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {

    @Id
    private Long id;
    private String name;
    private Integer qty;
    private Double price;
    private String creationTS;
}
