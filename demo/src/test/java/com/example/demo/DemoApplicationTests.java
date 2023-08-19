package com.example.demo;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.example.demo.entity.Product;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.ProductRepository;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private EmployeeRepository repository;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	EntityManager entityManager;

	@Test
	void findByName() {
		List<Product> products = productRepository.findByName("vivo");
		products.forEach(product -> System.err.println(product));
	}

	@Test
	void findByMultipleFields() {
		List<Product> products = productRepository.findByDescAndPriceGreaterThanEqual("laptop", 4000);
		products.forEach(product -> System.err.println(product));
	}

	@Test
	void findByDescContains() {
		List<Product> products = productRepository.findByDescContains("samsung");
		products.forEach(product -> System.err.println(product));
	}

	@Test
	void findByPriceBetween() {
		List<Product> products = productRepository.findByPriceBetween(2000, 9000);
		products.forEach(product -> System.err.println(product));
	}

	@Test
	void findByDescLike() {
		List<Product> products = productRepository.findByDescLike("%bile");
		products.forEach(product -> System.err.println(product));
	}

	@Test
	void findByNameIn() {
		List<String> names = List.of("vivo", "iphone", "tv");
		List<Product> products = productRepository.findByNameIn(names);
		products.forEach(product -> System.err.println(product));
	}

	@Test
	void findAllWithPaging() {
		Pageable pageable = PageRequest.of(0, 3);
		Page<Product> page = productRepository.findAll(pageable);
		page.get().forEach(System.out::println);
	}

	@Test
	void findAllWithSorting() {
		Sort sort = Sort.by(Direction.DESC, "name", "price");
		Iterable<Product> page = productRepository.findAll(sort);
		page.forEach(System.err::println);
	}

	@Test
	void findAllWithSortingWithMultipeOrders() {
		Sort sort = Sort.by("name").descending().and(Sort.by("price").descending());
		Iterable<Product> page = productRepository.findAll(sort);
		page.forEach(System.err::println);
	}

	@Test
	void findAllWithPagingAndSorting() {
		Sort sort = Sort.by("name").descending().and(Sort.by("price").descending());
		Pageable pageable = PageRequest.of(0, 5, sort);
		Iterable<Product> page = productRepository.findAll(pageable);
		page.forEach(System.err::println);
	}

	@Test
	void findByNameInWithPagingAndSorting() {
		List<String> names = List.of("vivo", "iphone", "tv", "acer", "fridge");
		Sort sort = Sort.by("name").descending().and(Sort.by("price").descending());
		Pageable pageable = PageRequest.of(0, 4, sort);
		List<Product> products = productRepository.findByNameIn(names, pageable);
		products.forEach(product -> System.err.println(product));
	}

	@Test
	@Transactional
	void testFirstLevelHibernateCaching() {
		productRepository.findById(1);
		productRepository.findById(1);
		productRepository.findById(1);
	}

	@Test
	@Transactional
	void testEvictFirstLevelHibernateCaching() {
		Session session = entityManager.unwrap(Session.class);

		Optional<Product> productOp = productRepository.findById(1);
		productRepository.findById(1);

		session.evict(productOp.get());
		productRepository.findById(1);
	}
}
