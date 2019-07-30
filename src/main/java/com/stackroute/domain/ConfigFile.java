package com.stackroute.domain;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
//import jdk.nashorn.internal.objects.annotations.Constructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ConfigFile {
    Actor actor1, actor2, actor3;

    @Bean(name = "actor1")
    public Actor getActor1() {
        actor1 = new Actor("Manish", "male", 22);
        return actor1;
    }

    @Bean(name = "actor2")
    public Actor getActor2() {
        actor2 = new Actor("Krishna", "male", 22);
        return actor1;
    }

    @Bean(name = "actor3")
    public Actor getActor3() {
        actor3 = new Actor("Spiderman", "female", 30);
        return actor1;
    }

    @Bean(name = "movie1")
    public Movie getMovie1() {
        Movie movie1 = new Movie();
        movie1.setActor1(actor1);
        movie1.setActor2(actor2);
        movie1.setActor3(actor3);
        return movie1;
    }

    @Bean(name = "movie2")
    public Movie getMovie2() {
        Movie movie2 = new Movie();
        movie2.setActor1(actor1);
        movie2.setActor2(actor2);
        movie2.setActor3(actor3);
        return movie2;
    }
}