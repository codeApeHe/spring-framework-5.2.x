package com.hw.beanpostprocessortest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;

/**
 * @author hw
 * @date 2022/8/21
 */
public class MyBeanPostProcessor implements BeanPostProcessor, PriorityOrdered {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if ("user".equalsIgnoreCase(beanName)) {
			System.out.println("============ user postProcessBeforeInitialization ===========");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if ("user".equalsIgnoreCase(beanName)) {
			System.out.println("============ user postProcessAfterInitialization ===========");
		}
		return bean;
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
