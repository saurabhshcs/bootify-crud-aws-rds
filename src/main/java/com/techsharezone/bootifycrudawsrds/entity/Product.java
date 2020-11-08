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
@Table(name = "PRODUCT")
public class Product {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int qty;
    private double price;
    private String creationTS;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCreationTS() {
        return creationTS;
    }

    public void setCreationTS(String creationTS) {
        this.creationTS = creationTS;
    }
}
