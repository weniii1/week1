package com.example.demo2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.io.IOException;
/*class與動畫練習*/
public class HelloApplication extends Application {
    private final Group root = new Group();
    private final Canvas canvas = new Canvas(400, 400);//生成畫布
    private final GraphicsContext gc = canvas.getGraphicsContext2D();//畫布內容，畫布的實際操作
    private List<Ball> balls = new ArrayList<>();
    private double n = 0;
    private final AnimationTimer timer = new AnimationTimer() {
        @Override
        public void handle(long now) {
            gc.clearRect(0, 0, 400, 400);//清除畫布
            for (Ball ball : balls) {
                n = ball.move(n);
                ball.draw(gc);
            }
        }
    };

    @Override
    public void start(Stage stage) {
        root.getChildren().add(canvas);
        Scene scene = new Scene(root, 400, 400);
        scene.setOnMouseClicked(event -> {
            if (event.getButton() == MouseButton.PRIMARY) { // 检查鼠标按钮是否为左键
                System.out.println("Left mouse button clicked!");
                createBall();
            }
        });
        timer.start();

        stage.setScene(scene);
        stage.show();
    }

    private void createBall() {
        double initialX = Math.random()*380;
        double initialY = Math.random()*0;
        double high = 400;
        double speed2 = (int)(Math.random()*3)+1;
        int size = (int)(Math.random()*40)+10;
        Color color = Color.rgb((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));

        Ball newBall = new Ball(initialX, initialY, high, speed2, size, color);
        balls.add(newBall);
    }

    private class Ball {
        private double x;
        private double y;
        private double high;
        private double speed2;
        private int size;
        private Color color;

        public Ball(double x, double y, double high, double speed2, int size, Color color) {
            this.x = x;
            this.y = y;
            this.high = high;
            this.speed2 = speed2;
            this.size = size;
            this.color = color;
        }
        public double move(double n) {
            /*if(high <= 30){
                return 0;
            }*/
            if (y > 370) {
                speed2 = speed2*(-1);
                //high = high*(Math.pow(0.99, n));
            }else if (y < (400-high)) {
                speed2 = speed2*(-1);
            }
            if(speed2 > 0){
                speed2 = speed2/0.98;
            }else{
                speed2 = speed2*0.98;
            }
            //x += speed1;
            y += speed2;
            return n+1;
        }

        public void draw(GraphicsContext gc) {
            gc.setFill(color);
            gc.fillOval(x, y, size, size);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}