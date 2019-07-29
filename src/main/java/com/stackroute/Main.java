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
        Movie movie =context.getBean(Movie.class);
        Actor actor=context.getBean(Actor.class);
        System.out.println(actor.toString());
        System.out.println(movie.toString());
    }
}