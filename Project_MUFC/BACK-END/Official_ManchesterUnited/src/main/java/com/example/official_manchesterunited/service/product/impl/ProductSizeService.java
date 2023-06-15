package com.example.official_manchesterunited.service.product.impl;

import com.example.official_manchesterunited.model.product.ProductSize;
import com.example.official_manchesterunited.repository.product.IProductSizeRepository;
import com.example.official_manchesterunited.service.product.IProductSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductSizeService implements IProductSizeService {
    @Autowired
    private IProductSizeRepository productSizeRepository;

    @Override
    public List<ProductSize> getAllProductSize() {
        return productSizeRepository.findAll();
    }
}
