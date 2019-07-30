package com.stackroute.domain;
//import jdk.nashorn.internal.objects.annotations.Constructor;
import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ConfigFile {

    @Bean(name="demobean")
    public BeanLifecycleDemoBean etBeanLifeDemo(){
        BeanLifecycleDemoBean beanLifecycleDemoBean = new BeanLifecycleDemoBean();

        return beanLifecycleDemoBean;
    }


}