package com.example.demo.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.entity.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {

	List<Product> findByName(String name);

	List<Product> findByDescAndPriceGreaterThanEqual(String desc, double price);

	List<Product> findByDescContains(String desc);

	List<Product> findByPriceBetween(double priceStart, double priceEnd);

	List<Product> findByDescLike(String desc);

	List<Product> findByNameIn(List<String> names);

	List<Product> findByNameIn(List<String> names, Pageable pageable);
}
