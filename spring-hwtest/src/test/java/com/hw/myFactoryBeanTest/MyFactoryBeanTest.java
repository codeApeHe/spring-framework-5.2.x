package com.hw.myFactoryBeanTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author hewei
 * @date 2021/7/24 15:48
 */
public class MyFactoryBeanTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext("com.hw.factoryBeanTest");
		// User
		System.out.println(ac.getBean("myFactoryBean"));
		// MyFactoryBean
		System.out.println(ac.getBean("&myFactoryBean"));
	}
}
