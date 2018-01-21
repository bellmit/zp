package com.jk;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@ImportResource("classpath:spring-dubbo-provider.xml")
public class Application  {

    public static void main(String[] args) {
         SpringApplication.run(Application.class, args);
    }

  

}
