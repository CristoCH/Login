package dad.login;

import dad.login.ui.LoginView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    private LoginView loginView;

    @Override
    public void start(Stage stage) throws Exception {

        loginView = new LoginView();

        Scene loginScene = new Scene(loginView, 320, 200);
        Stage loginStage = new Stage();
        loginStage.setTitle("Login.fxml");
        loginStage.setScene(loginScene);
        loginStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
