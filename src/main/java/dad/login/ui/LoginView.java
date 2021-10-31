package dad.login.ui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class LoginView extends VBox {

    private TextField userText;
    private PasswordField passText;
    private Label userLabel;
    private Label passLabel;
    private CheckBox usarCb;
    private Button accederButton;
    private Button cancelarButton;

    public LoginView() {
        super();

        userText = new TextField();
        userText.setPrefColumnCount(12);
        userText.setPromptText("Nombre de usuario");
        passText = new PasswordField();
        passText.setPrefColumnCount(12);
        passText.setPromptText("Contraseña del usuario");


        userLabel = new Label("Usuario: ");

        passLabel = new Label("Contraseña: ");

        usarCb = new CheckBox("Usar LDAP");

        accederButton = new Button("Acceder");
        cancelarButton = new Button("Cancelar");

        GridPane panel = new GridPane();
        panel.setPadding(new Insets(5));
        panel.setHgap(5);
        panel.setVgap(5);
        panel.addRow(0, userLabel, userText);
        panel.addRow(1, passLabel, passText);
        panel.addRow(2);
        panel.add(usarCb, 1, 2);

        ColumnConstraints[] constraintColumn = {new ColumnConstraints(), new ColumnConstraints()};
        panel.getColumnConstraints().setAll(constraintColumn);

        RowConstraints[] constraintRow = {new RowConstraints(), new RowConstraints()};
        panel.getRowConstraints().setAll(constraintRow);

        HBox buttonBox = new HBox(5, accederButton, cancelarButton);
        buttonBox.setSpacing(5);
        buttonBox.setFillHeight(false);
        buttonBox.setAlignment(Pos.CENTER);

        this.setSpacing(5);
        this.setFillWidth(false);
        this.setAlignment(Pos.CENTER);

        this.getChildren().addAll(panel, buttonBox);

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
