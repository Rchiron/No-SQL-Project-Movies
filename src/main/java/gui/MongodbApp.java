package gui;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.ConnectionMongoDB;

import java.awt.*;
import java.io.IOException;

public class MongodbApp extends Application {
    MainController mainController;
    ConnectionMongoDB connectionMongoDB;

    @FXML
    private TextField textDirectors;
    @FXML
    private TextField textTitle;
    @FXML
    private TextField textGenres;
    @FXML
    private TextField textActors;
    @FXML
    private TextField textYear;
    @FXML
    private TextField textRating;
    @FXML
    private TextField textResult;

    @Override
    public void start(Stage primaryStage) throws IOException {
        connectionMongoDB = new ConnectionMongoDB();
        mainController = new MainController();
        Pane mainPane = FXMLLoader.load(getClass().getResource("MongodbApp.fxml"));
        Scene scene = new Scene(mainPane);

        primaryStage.setTitle("Movies DataBase");
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }
}
