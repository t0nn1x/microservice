package org.t0nn1x.productservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.t0nn1x.productservice.dto.ProductRequestDto;
import org.t0nn1x.productservice.service.ProductService;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

  private final ProductService productService;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public void createProduct(@RequestBody ProductRequestDto productRequest) {
    productService.createProduct(productRequest);
  }


}
