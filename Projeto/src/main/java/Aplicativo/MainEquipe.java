package Aplicativo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainEquipe extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainEquipe.class.getResource("Victor.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 600);
        stage.setTitle("Cadastro Equipe");
        stage.setScene(scene);
        stage.show();
         MainEquipe main = new MainEquipe();
    }

    public static void main(String[] args) {
        launch();
    }
}