package com.mycompany.proman.service;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.mycompany.proman.service")
@EntityScan("com.mycompany.proman.service.entity")
public class ServiceConfiguration {
}
