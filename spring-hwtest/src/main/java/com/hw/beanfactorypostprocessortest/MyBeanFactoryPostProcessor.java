package com.hw.beanfactorypostprocessortest;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.util.Date;

/**
 * @author hewei
 * @date 2021/7/24 17:55
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("user");
		MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
		propertyValues.add("birthday",new Date());
		System.out.println("=============== BeanFactoryPostProcessor =====================");
	}
}
