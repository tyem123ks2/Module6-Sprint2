package com.example.official_manchesterunited.repository.product;

import com.example.official_manchesterunited.model.product.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {
    @Query(value = "SELECT * FROM Product WHERE name like concat('%',:name,'%') and is_deleted = false", nativeQuery = true)
    Page<Product> findByName(@Param("name") String name, Pageable pageable);
}
