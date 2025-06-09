package com.spring.fx.springjavafxapi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class PruebaApplication extends Application {

    private ConfigurableApplicationContext springContext;

    @Override
    public void init(){
        // Arranca Spring Boot, guarda contexto
        springContext = new SpringApplicationBuilder(AppLauncher.class).run();
    }

    @Override
    public void start(Stage primaryStage) {
        // Ejemplo simple de UI sin FXML
        Label label = new Label("¡Hola desde JavaFX + Spring Boot!");

        Scene scene = new Scene(label, 400, 200);
        primaryStage.setTitle("Mi Aplicación JavaFX con Spring Boot");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        // Cierra contexto Spring al cerrar app
        springContext.close();
        super.stop();
    }
}
