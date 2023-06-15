package com.example.official_manchesterunited.model.product;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ProductSize {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "productSize")
    private Set<ProductSizeDetail> productSizeDetailSet;

    public ProductSize() {

    }

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

    public Set<ProductSizeDetail> getProductSizeDetailSet() {
        return productSizeDetailSet;
    }

    public void setProductSizeDetailSet(Set<ProductSizeDetail> productSizeDetailSet) {
        this.productSizeDetailSet = productSizeDetailSet;
    }
}
