package com.codegym;

import com.codegym.service.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public Calculator calculator() {
        return new Calculator();
    }
}
