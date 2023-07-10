package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import java.io.IOException;
/*繪圖練習*/
public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 400, 400);

        Ellipse e1 = new Ellipse(100, 50, 50, 20);
        e1.setFill(Color.RED);
        e1.setStroke(Color.GREEN);
        root.getChildren().add(e1);

        Ellipse e2 = new Ellipse(300, 50, 50, 20);
        e2.setFill(Color.RED);
        e2.setStroke(Color.GREEN);
        root.getChildren().add(e2);

        Circle circle = new Circle(200, 200, 100);
        circle.setFill(Color.RED);
        circle.setStroke(Color.GREEN);
        //circle.setFill(Color.TRANSPARENT); // 透明
        root.getChildren().add(circle);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}