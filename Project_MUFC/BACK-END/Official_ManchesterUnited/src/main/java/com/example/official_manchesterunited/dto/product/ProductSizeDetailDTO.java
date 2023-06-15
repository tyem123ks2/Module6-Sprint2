package com.example.official_manchesterunited.dto.product;

import com.example.official_manchesterunited.model.product.Product;
import com.example.official_manchesterunited.model.product.ProductSize;

public class ProductSizeDetailDTO {
    private int id;
    private Integer quantity;
    private ProductSize productSize;
    private Product product;

    public ProductSizeDetailDTO() {
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
