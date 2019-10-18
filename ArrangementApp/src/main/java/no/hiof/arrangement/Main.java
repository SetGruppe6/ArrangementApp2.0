package no.hiof.arrangement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {

        this.primaryStage = primaryStage;

        FXMLLoader fxmlinnlaster = new FXMLLoader();

        fxmlinnlaster.setLocation(getClass().getResource("startside.fxml"));
        Parent rootnode = fxmlinnlaster.load();

        primaryStage.setTitle("startside");
        primaryStage.setScene(new Scene(rootnode));
        primaryStage.show();

    }
}
