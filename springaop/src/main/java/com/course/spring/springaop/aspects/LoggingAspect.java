package com.course.spring.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import com.course.spring.springaop.service.ProductServiceImpl;

@Aspect
public class LoggingAspect {

	@Before("execution(* com.course.spring.springaop.service.ProductServiceImpl.multiply(..))")
	public void logBefore(JoinPoint joinPoint) {
		ProductServiceImpl impl = (ProductServiceImpl) joinPoint.getTarget();
		System.out.println(impl.getClass());
		System.out.println("Before calling the method");
	}

	@After("execution(* com.course.spring.springaop.service.ProductServiceImpl.multiply(..))")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("After method invocation. will be called regardless of method execution");
	}
}
