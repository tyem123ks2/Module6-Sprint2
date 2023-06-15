package com.example.official_manchesterunited.service.product;

import com.example.official_manchesterunited.dto.product.ProductDTO;
import com.example.official_manchesterunited.model.product.Product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {
    Page<ProductDTO> findByName(String name, Pageable pageable);

    Product findById(int id);

    List<Product> findAllProduct();

    void save (Product product);

    void createProduct (ProductDTO productDTO);

    boolean deleteProduct(int id);
}
