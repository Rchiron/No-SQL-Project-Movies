package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class MongodbApp extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Pane mainPane = FXMLLoader.load(getClass().getResource("MongodbApp.fxml"));
        Scene scene = new Scene(mainPane);

        primaryStage.setTitle("Currency Converter");
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }
}
