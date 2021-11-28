package com.nikk.mavenprojectolympics;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
Circle c1 = new Circle(200,200,90);
        c1.setFill(Color.TRANSPARENT);
        c1.setStrokeWidth(15);
        c1.setStroke(Color.CORNFLOWERBLUE);
        Circle c2 = new Circle(300,300,90);
        c2.setFill(Color.TRANSPARENT);
        c2.setStrokeWidth(15);
        c2.setStroke(Color.GOLD);
        Circle c3 = new Circle(400,200,90);
        c3.setFill(Color.TRANSPARENT);
        c3.setStrokeWidth(15);
        c3.setStroke(Color.BLACK);
        Circle c4 = new Circle(500,300,90);
        c4.setFill(Color.TRANSPARENT);
        c4.setStrokeWidth(15);
        c4.setStroke(Color.GREEN);
        Circle c5 = new Circle(600,200,90);
        c5.setFill(Color.TRANSPARENT);
        c5.setStrokeWidth(15);
        c5.setStroke(Color.RED);
        Group g = new Group(c1,c2,c3,c4,c5);
        Scene scene = new Scene(g,800,600);
        primaryStage.setTitle("Olympics Logo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
