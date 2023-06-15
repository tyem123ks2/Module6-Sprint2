package com.example.official_manchesterunited.model.product;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class ProductSizeDetail {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
        private int id;
        private Integer quantity;
    @JsonBackReference
    @ManyToOne
    @JoinColumn
    private ProductSize productSize;

    @ManyToOne
    @JsonBackReference
    @JoinColumn
    private Product product;

    public ProductSizeDetail() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    public ProductSize getProductSize() {
        return productSize;
    }

    public void setProductSize(ProductSize productSize) {
        this.productSize = productSize;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
