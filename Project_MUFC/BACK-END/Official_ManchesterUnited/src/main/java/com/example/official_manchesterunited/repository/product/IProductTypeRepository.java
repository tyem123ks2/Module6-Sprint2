package com.example.official_manchesterunited.repository.product;

import com.example.official_manchesterunited.model.product.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductTypeRepository extends JpaRepository<ProductType, Integer> {
}
