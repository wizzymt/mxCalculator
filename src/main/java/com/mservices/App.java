package com.mservices;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = new Scene(loadFXML("design"));
        scene.getStylesheets().add(resourceUrl("design.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("wizzy calculator");
        stage.show();
    }

    private Parent loadFXML(String name) throws IOException {
        FXMLLoader loader = new FXMLLoader(resourceUrl(name + ".fxml"));
        return loader.load();
    }

    private URL resourceUrl(String name) {
        return Objects.requireNonNull(App.class.getResource(name), "Missing resource: " + name);
    }

    public static void main(String[] args) {
        launch(args);
    }
}