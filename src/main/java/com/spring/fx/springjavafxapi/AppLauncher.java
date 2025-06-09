package com.spring.fx.springjavafxapi;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppLauncher {
    public static void main(String[] args) {
        // Lanza la app JavaFX y Spring Boot simultáneamente
        PruebaApplication.launch(PruebaApplication.class, args);
    }
}
