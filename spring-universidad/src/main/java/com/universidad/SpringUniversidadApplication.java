package com.universidad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringUniversidadApplication {

    public static void main(String[] args) {
        String[] beanDefinitionNames = SpringApplication.run(SpringUniversidadApplication.class, args).getBeanDefinitionNames();
        for (String  str: beanDefinitionNames){
            System.out.println(str);
        }
    }

}
