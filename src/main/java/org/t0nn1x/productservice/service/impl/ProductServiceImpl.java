package org.t0nn1x.productservice.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.t0nn1x.productservice.dto.ProductRequestDto;
import org.t0nn1x.productservice.model.Product;
import org.t0nn1x.productservice.repository.ProductRepository;
import org.t0nn1x.productservice.service.ProductService;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

  private final ProductRepository productRepository;

  @Override
  public void createProduct(ProductRequestDto productRequest) {
    Product product = Product.builder()
        .name(productRequest.getName())
        .description(productRequest.getDescription())
        .price(productRequest.getPrice())
        .build();

    productRepository.save(product);
    log.info("Product with id {} is saved", product.getId());
  }
}
