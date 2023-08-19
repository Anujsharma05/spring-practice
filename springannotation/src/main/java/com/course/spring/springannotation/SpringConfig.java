package com.course.spring.springannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.course.spring.springannotation.service.Service;

@Configuration
@Import(DaoConfig.class)
//@ComponentScan("com.course.spring.springannotation")
public class SpringConfig {

	@Bean({"sparta"})
	public Service service() {
		return new Service();
	}
}
