package dad.login;

import dad.login.ui.LoginController;
import dad.login.ui.LoginView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    private LoginController controller;

    @Override
    public void start(Stage stage) throws Exception {
        controller = new LoginController();

        Scene scene = new Scene(controller.getView(), 320, 200);

        stage.setTitle("Login.fxml");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
