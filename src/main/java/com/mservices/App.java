package com.mservices;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

    

    @Override
    public void start(Stage stage) throws Exception {
        
        final Scene scene;
        scene = new Scene(loadFXML("design"));
        scene.getStylesheets().add(App.class.getResource("design.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("wizzy calculator");
        stage.show();
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }   
}