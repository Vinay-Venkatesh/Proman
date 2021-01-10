package com.mycompany.proman.api;

import com.mycompany.proman.service.ServiceConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ServiceConfiguration.class)
public class PromanApiApplication {
    public static void main(String[] args){
        SpringApplication.run(PromanApiApplication.class,args);
    }
}
