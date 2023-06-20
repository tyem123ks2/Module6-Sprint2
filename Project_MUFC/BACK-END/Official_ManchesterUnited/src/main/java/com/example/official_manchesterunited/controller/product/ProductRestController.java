package com.example.official_manchesterunited.controller.product;

import com.example.official_manchesterunited.dto.product.ProductDTO;
import com.example.official_manchesterunited.model.product.Product;
import com.example.official_manchesterunited.service.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ProductRestController {
    @Autowired
    private IProductService productService;

    @GetMapping("/public/product-list")
    public ResponseEntity<List<Product>> showAllProduct() {
        List<Product> productList = productService.findAllProduct();
        if (productList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @GetMapping("public/product/{id}")
    public ResponseEntity<Product> findProductById(@PathVariable int id) {
        Product product = productService.findById(id);
        if (product == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @GetMapping("/admin/product/list")
    @ResponseStatus(HttpStatus.OK)
    public Page<ProductDTO> showList(@RequestParam(required = false, defaultValue = "") String name,
                                     @PageableDefault(direction = Sort.Direction.DESC, size = 5) Pageable pageable) {
        return productService.findByName(name, pageable);
    }


}
