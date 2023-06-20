package com.example.official_manchesterunited.service.product.impl;

import com.example.official_manchesterunited.dto.product.ProductDTO;
import com.example.official_manchesterunited.model.product.Product;
import com.example.official_manchesterunited.repository.product.IProductRepository;
import com.example.official_manchesterunited.service.product.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public Page<ProductDTO> findByName(String name, Pageable pageable) {
        List<ProductDTO> productDTOList = new ArrayList<>();
        Page<Product> productPage = productRepository.findByName(name, pageable);
        ProductDTO productDTO;
            for (Product product : productPage) {
                productDTO = new ProductDTO();
                BeanUtils.copyProperties(product, productDTO);
                productDTOList.add(productDTO);
            }
        return new PageImpl<>(productDTOList, productPage.getPageable(), productPage.getTotalElements());
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public void createProduct(ProductDTO productDTO) {

    }

    @Override
    public boolean deleteProduct(int id) {
        return false;
    }
}
