package org.t0nn1x.productservice.service;

import org.t0nn1x.productservice.dto.ProductRequestDto;

public interface ProductService {

  void createProduct(ProductRequestDto productRequest);
}
