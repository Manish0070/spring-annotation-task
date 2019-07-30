package com.stackroute.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanPostProcessorDemoBean implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        System.out.println("Inside post process after initialization: "+beanName);
        return bean;
    }
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        System.out.println("Inside post process before initialization: "+beanName);
        return bean;
    }
    @PostConstruct
    public void afterInit(){
        System.out.println("After construct");
    }
    @PreDestroy
    public void beforeDestroy(){
        System.out.println("Before Destroy");
    }
}
