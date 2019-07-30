package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    public void myMethod(){
        System.out.println("This is my Method");
    }
    public void customInit(){
        System.out.println("After Bean Instantiation");
    }
    public void customDestroy(){
        System.out.println("Before Bean Destroying");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean going through property set method");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("Bean on Destroy");
    }
}