package com.hw;

import com.hw.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author hewei
 * @date 2020/8/29 18:14
 */
public class UserServiceTest {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext("com.hw");
		UserService userService = ac.getBean(UserService.class);
		System.out.println(userService.getUser(1));
		String[] beanDefinitionNames = ac.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
	}
}
