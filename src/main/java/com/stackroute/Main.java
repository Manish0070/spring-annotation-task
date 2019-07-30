package com.stackroute;

import com.stackroute.demo.BeanPostProcessorDemoBean;
import com.stackroute.domain.ConfigFile;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(ConfigFile.class);
        BeanPostProcessorDemoBean beanPostProcessorDemoBean = context.getBean("demobean",BeanPostProcessorDemoBean.class);
        beanPostProcessorDemoBean.postProcessBeforeInitialization("demobean","manish");
        beanPostProcessorDemoBean.postProcessAfterInitialization("demobean","Manish");
        context.close();
    }
}