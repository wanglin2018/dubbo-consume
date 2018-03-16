package com.cdb.dubboconsume;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@Configurable
@ComponentScan
@EnableAutoConfiguration
@ImportResource(locations={"classpath:applicationContext.xml"})
public class App {



    public static void main(String[] args){
        SpringApplication.run(App.class,args);
    }

}
