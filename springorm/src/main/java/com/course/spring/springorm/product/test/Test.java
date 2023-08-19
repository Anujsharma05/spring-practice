package com.course.spring.springorm.product.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.course.spring.springorm.product.dao.ProductDao;
import com.course.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/course/spring/springorm/product/test/config.xml");
		ProductDao productDao = (ProductDao) ctx.getBean("productDao");
		
//		Product p = new Product();
//		p.setId(2);
//		p.setName("laptop");
//		p.setDescription("latest gen tech");
//		p.setPrice(90000);
//		
//		productDao.create(p);
		
		System.out.println(productDao.findAll());
	}

}
