package com.stackroute;
import com.stackroute.domain.Actor;
import com.stackroute.domain.ConfigFile;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.jar.JarOutputStream;
public class Main
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConfigFile.class);
        Movie movie1 =context.getBean("movie1",Movie.class);
        Movie movie2 =context.getBean("movie2",Movie.class);
        Actor actor1=context.getBean("actor1",Actor.class);
        Actor actor2=context.getBean("actor2",Actor.class);
        Actor actor3=context.getBean("actor3",Actor.class);
        System.out.println(actor1.toString());
        System.out.println(actor2.toString());
        System.out.println(actor3.toString());
        System.out.println(movie1.toString());
        System.out.println(movie2.toString());
    }
}