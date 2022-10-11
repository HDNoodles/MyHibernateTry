package com.example.hibernateworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class HibernateWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateWorldApplication.class, args);
    }

}
