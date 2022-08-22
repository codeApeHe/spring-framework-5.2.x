package com.hw.beanfactorypostprocessortest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

/**
 * @author hw
 * @date 2022/8/21
 */

public class MyOrderedBeanFactoryPostProcessor implements BeanFactoryPostProcessor, Ordered {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("=============Ordered BeanFactoryPostProcessor ==================");
	}

	@Override
	public int getOrder() {
		return 1;
	}
}
