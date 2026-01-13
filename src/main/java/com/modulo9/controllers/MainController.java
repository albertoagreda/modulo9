package com.modulo9.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

public class MainController {

    @FXML private Label statusLabel;
    private boolean darkMode = false;

    @FXML
    private void onTest() {
        statusLabel.setText("✅ Modulo9 funcionando correctamente.");
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Prueba");
        a.setHeaderText("Modulo9 - JavaFX");
        a.setContentText("Si ves esto, tu app funciona y podrás empaquetarla en JAR, EXE e instalador.");
        a.showAndWait();
    }

    @FXML
    private void onToggleTheme() {
        darkMode = !darkMode;
        statusLabel.getScene().getRoot().setStyle(darkMode
                ? "-fx-base: #1e1e1e; -fx-background-color: #1e1e1e; -fx-text-fill: white;"
                : "");
        statusLabel.setText(darkMode ? "🌙 Tema oscuro activado" : "☀️ Tema claro activado");
    }

    @FXML
    private void onAbout() {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Acerca de");
        a.setHeaderText("Modulo9 - Distribución de software");
        a.setContentText("Autor: TU NOMBRE\nVersión: 1.0.0\n\nIncluye: JAR ejecutable, EXE y instalador Windows.");
        a.showAndWait();
    }
}
