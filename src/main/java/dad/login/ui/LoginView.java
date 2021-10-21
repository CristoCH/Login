package dad.login.ui;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class LoginView extends VBox {

    private TextField userText;
    private PasswordField passText;
    private Label userLabel;
    private Label passLabel;
    private CheckBox usarCb;
    private Button accederButton;
    private Button cancelarButton;

    public LoginView(){
        super();

        userText = new TextField();
        userText.setPrefColumnCount(12);
        userText.setPromptText("Nombre de usuario");
        passText = new PasswordField();
        passText.setPrefColumnCount(12);
        passText.setPromptText("Contraseña del usuario");

        userLabel = new Label("Usuario: ");
        //userLabel.setPrefWidth(70);
        passLabel = new Label("Contraseña: ");
        //passLabel.setPrefWidth(70);
        usarCb = new CheckBox("Usar LDAP");

        accederButton = new Button("Acceder");
        cancelarButton = new Button("Cancelar");

        GridPane root = new GridPane();
        root.setGridLinesVisible(false);
        root.setVgap(5);
        root.setHgap(5);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(5));
        root.addRow(0, userLabel, userText);
        root.setPadding(new Insets(5));
        root.addRow(1, passLabel, passText);
        root.addRow(2, accederButton, cancelarButton);

        ColumnConstraints[] constraintView = {new ColumnConstraints(), new ColumnConstraints()};
        constraintView[0].setHalignment(HPos.CENTER);
        constraintView[1].setFillWidth(false);
        constraintView[1].setHgrow(Priority.NEVER);

        root.getColumnConstraints().setAll(constraintView);

        Scene scene = new Scene(root, 320, 200);

        Stage loginStage = new Stage();
        loginStage.setTitle("Login.fxml");
        loginStage.setScene(scene);
        loginStage.show();

        /*HBox userBox = new HBox(5, userLabel, userText);
        userBox.setSpacing(5);
        HBox passBox = new HBox(5, passLabel, passText);
        passBox.setSpacing(5);
        HBox buttonBox = new HBox(5, accederButton, cancelarButton);

        setSpacing(5);
        setFillWidth(false);
        setAlignment(Pos.CENTER);

        getChildren().addAll(userBox,passBox, usarCb, buttonBox);*/



    }

    public TextField getUserText() {
        return userText;
    }

    public TextField getPassText() {
        return passText;
    }

    public Label getUserLabel() {
        return userLabel;
    }

    public Label getPassLabel() {
        return passLabel;
    }

    public CheckBox getUsarCb() {
        return usarCb;
    }

    public Button getAccederButton() {
        return accederButton;
    }

    public Button getCancelarButton() {
        return cancelarButton;
    }
}
