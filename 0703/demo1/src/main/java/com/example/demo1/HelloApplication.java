package com.example.demo1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/*動畫練習*/
public class HelloApplication extends Application {
    private final Group root = new Group();
    private final Canvas canvas = new Canvas(400, 400);//生成畫布
    private final GraphicsContext gc = canvas.getGraphicsContext2D();//畫布內容，畫布的實際操作

    private double circleX = 0;
    private double circleX2 = 0;

    private final AnimationTimer timer = new AnimationTimer() {
        @Override
        public void handle(long now) {
            gc.clearRect(0, 0, 400, 400);//清除畫布
            gc.setFill(Color.GOLD);
            gc.fillOval(circleX, 200, 30, 30);

            gc.setFill(Color.GRAY);
            gc.fillOval(circleX2, 100, 30, 30);

            circleX += 3;
            circleX2 += 2;
            if (circleX > 400) {
                circleX = 0;
            }
            if (circleX2 > 400) {
                circleX2 = 0;
            }
        }
    };

    @Override
    public void start(Stage stage) {
        root.getChildren().add(canvas);
        Scene scene = new Scene(root, 400, 400);
        stage.setScene(scene);
        stage.show();

        timer.start();
    }

    public static void main(String[] args) {
        launch(args);
    }
}