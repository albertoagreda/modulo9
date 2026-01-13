package com.modulo9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(App.class.getResource("/views/main.fxml"));
        Scene scene = new Scene(loader.load());
        scene.getStylesheets().add(App.class.getResource("/styles/app.css").toExternalForm());

        stage.setTitle("Modulo9 - JavaFX");
        stage.getIcons().add(new Image(App.class.getResourceAsStream("/icons/app.png")));
        stage.setScene(scene);
        stage.show();
    }
}
