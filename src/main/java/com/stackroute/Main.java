package com.stackroute;
import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.ConfigFile;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConfigFile.class);
        BeanLifecycleDemoBean demoBean=context.getBean("demobean",BeanLifecycleDemoBean.class);
        demoBean.customDestroy();
        demoBean.customInit();
        demoBean.myMethod();
        context.close();
    }
}