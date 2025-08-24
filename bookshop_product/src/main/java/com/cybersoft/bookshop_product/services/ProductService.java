package com.cybersoft.bookshop_product.services;

import com.cybersoft.bookshop_product.dto.ProductDTO;
import com.cybersoft.bookshop_product.payload.request.CreateProductRequest;
import com.cybersoft.bookshop_product.payload.request.SearchProductRequest;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {
    ProductDTO createProduct(CreateProductRequest productRequest);
    ProductDTO updateProduct(String id, ProductDTO productDTO);
    void deleteProduct(String id);
    ProductDTO getProductById(String id);
    List<ProductDTO> getAllProducts();
    Page<ProductDTO> searchProducts(SearchProductRequest searchProductRequest);
}
