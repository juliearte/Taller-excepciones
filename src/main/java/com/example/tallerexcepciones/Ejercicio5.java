package com.example.tallerexcepciones;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Ejercicio5 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try {
            // Intentar cargar el archivo FXML
            FXMLLoader fxmlLoader = new FXMLLoader(Ejercicio5.class.getResource("index.fxml"));

            // Si el archivo no se encuentra, lanzar una excepción personalizada
            if (fxmlLoader == null) {
                throw new FXMLNotFoundException("No se encontró el archivo");
            }

            // Si el archivo se carga correctamente, crear la escena y mostrarla
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root, 320, 320);
            stage.setTitle("Titulo");
            stage.setScene(scene);
            stage.show();
        } catch (FXMLNotFoundException e) {
            // Manejar la excepción personalizada
            System.out.println(e.getMessage());
        }
    }
}

