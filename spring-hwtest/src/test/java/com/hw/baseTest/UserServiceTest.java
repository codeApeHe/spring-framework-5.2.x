package com.hw.baseTest;

import com.hw.baseTest.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hewei
 * @date 2020/8/29 18:14
 */
public class UserServiceTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-hewei.xml");
		User user = ac.getBean("user", User.class);
		User bean = ac.getBean(User.class);
	}
}
