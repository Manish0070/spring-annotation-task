package com.stackroute.domain;
//import jdk.nashorn.internal.objects.annotations.Constructor;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ConfigFile {

    @Bean(name="demobean")
    public BeanPostProcessorDemoBean demoBean(){
        BeanPostProcessorDemoBean beanPostProcessorDemoBean=new BeanPostProcessorDemoBean();

    return beanPostProcessorDemoBean;
    }


}