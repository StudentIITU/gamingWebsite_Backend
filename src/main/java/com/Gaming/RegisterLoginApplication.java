package com.Gaming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.Gaming.entities") // Package containing entity classes
public class RegisterLoginApplication {

        public static void main(String[] args) {
            SpringApplication.run(RegisterLoginApplication.class, args);
        }

}
