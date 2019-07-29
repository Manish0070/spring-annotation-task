package com.stackroute;
import com.stackroute.domain.Actor;
import com.stackroute.domain.ConfigFile;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);
        Actor actor =  context.getBean(Actor.class);

        System.out.println(actor.toString());


        Movie movie = context.getBean(Movie.class);
       System.out.println(movie.toString());


    }
}
