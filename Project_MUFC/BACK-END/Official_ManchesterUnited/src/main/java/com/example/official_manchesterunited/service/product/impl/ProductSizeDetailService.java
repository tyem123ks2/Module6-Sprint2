package com.example.official_manchesterunited.service.product.impl;

import com.example.official_manchesterunited.model.product.ProductSizeDetail;
import com.example.official_manchesterunited.repository.product.IProductSizeDetailRepository;
import com.example.official_manchesterunited.service.product.IProductSizeDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductSizeDetailService implements IProductSizeDetailService {
    @Autowired
    private IProductSizeDetailRepository productSizeDetailRepository;

    @Override
    public List<ProductSizeDetail> getAllProductDetail() {
        return productSizeDetailRepository.findAll();
    }
}
