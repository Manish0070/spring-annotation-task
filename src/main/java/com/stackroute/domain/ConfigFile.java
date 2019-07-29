package com.stackroute.domain;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ConfigFile {
    @Bean(name="actor")
    public Actor actor(){
    Actor actor=new Actor("Manish","Male",22);
        return actor;
    }


    @Bean(name="movie")
    public Movie movie(){
        Movie movie=new Movie();
        return movie;
    }
}
