package com.example.official_manchesterunited.dto.product;

import com.example.official_manchesterunited.model.product.ProductSizeDetail;
import com.example.official_manchesterunited.model.product.ProductType;

import java.util.Set;

public class ProductDTO {
    private int id;
    private String name;
    private String imgProduct;
    private double price;
    private double sellPrice;
    private double quantity;
    private ProductType productType;
    private Set<ProductSizeDetail> productSizeDetails;

    public ProductDTO() {

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

    public String getImgProduct() {
        return imgProduct;
    }

    public void setImgProduct(String imgProduct) {
        this.imgProduct = imgProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Set<ProductSizeDetail> getProductSizeDetails() {
        return productSizeDetails;
    }

    public void setProductSizeDetails(Set<ProductSizeDetail> productSizeDetails) {
        this.productSizeDetails = productSizeDetails;
    }
}
