package com.example.official_manchesterunited.repository.product;

import com.example.official_manchesterunited.model.product.ProductSize;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductSizeRepository extends JpaRepository<ProductSize, Integer> {
}
