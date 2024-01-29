package org.t0nn1x.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.t0nn1x.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
