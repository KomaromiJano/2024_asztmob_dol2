/*
 * File: TrapterApplication.java
 * Author: Komáromi János
 * Copyright: 2024, Komáromi János
 * Group: Szoft II/1/N
 * Date: 2024-11-12
 * Github: https://github.com/komacraft12/
 * Licenc: GNU GPL
 */

package eu.komaweb.trapter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TrapterApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TrapterApplication.class.getResource("trapter-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 340);
        stage.setTitle("Trapéz Terület");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}