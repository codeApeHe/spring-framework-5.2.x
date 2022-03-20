package com.hw.baseTest;

import com.hw.baseTest.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hewei
 * @date 2020/8/29 18:14
 */
public class UserServiceTest {

	public static void main(String[] args) {
		/**
		 * 1.new ClassPathXmlApplicationContext()
		 * 	ClassPathXmlApplicationContext 构造器
		 * 		1.1 super(parent);
		 * 		1.2 设置xml配置路径：setConfigLocations(configLocations);
		 * 			设置context路径，若路径中有占位符，则替换路径中转为占位符
		 * 				org.springframework.context.support.AbstractRefreshableConfigApplicationContext#resolvePath(java.lang.String)）
		 * 		1.3 刷新容器 (是否刷新容器通过refresh控制)
		 * 			refresh 实际调用 org.springframework.context.support.AbstractApplicationContext#refresh()，共有经典13步：
		 * 			【1】prepareRefresh()：
		 *
		 *
		 *
		 */
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-hw.xml");
		User user = ac.getBean("user", User.class);
	}
}
