package com.kodilla.ecommercee.repository;

import com.kodilla.ecommercee.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ProductRepository extends CrudRepository<Product, Long> {
}
