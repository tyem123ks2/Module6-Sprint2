package com.example.official_manchesterunited.service.product.impl;

import com.example.official_manchesterunited.model.product.ProductType;
import com.example.official_manchesterunited.repository.product.IProductTypeRepository;
import com.example.official_manchesterunited.service.product.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeService implements IProductTypeService {
    @Autowired
    private IProductTypeRepository productTypeRepository;

    @Override
    public List<ProductType> getAllProductType() {
        return productTypeRepository.findAll();
    }
}
