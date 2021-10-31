package dad.login.ui;

import dad.login.auth.AuthService;
import dad.login.auth.FileAuthService;
import dad.login.auth.LdapAuthService;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class LoginController {

    private LoginView view = new LoginView();
    private LoginModel model = new LoginModel();

    public LoginController(){

        view.getUserText().textProperty().bindBidirectional(model.userProperty());
        view.getPassText().textProperty().bindBidirectional(model.passProperty());
        view.getAccederButton().setOnAction(e->onAccessAction(e));
        view.getCancelarButton().setOnAction(e->onCancelAction(e));

    }

    public LoginView getView() {
        return view;
    }

    public LoginModel getModel() {
        return model;
    }


    private void onAccessAction(ActionEvent e) {

        AuthService ldap = model.isUseLdap() ? new LdapAuthService():new FileAuthService();

        try {
            if(ldap.login(model.getUser(), model.getPass())){
                Alert alertCorrecto = new Alert(Alert.AlertType.INFORMATION);
                alertCorrecto.setTitle("Iniciar Sesión");
                alertCorrecto.setHeaderText("Acceso permitido");
                alertCorrecto.setContentText("Las credenciales de acceso son válidas.");

                alertCorrecto.showAndWait();

            }else{
                Alert alertDenegado = new Alert(Alert.AlertType.ERROR);
                alertDenegado.setTitle("Iniciar Sesión");
                alertDenegado.setHeaderText("Acceso denegado");
                alertDenegado.setContentText("El usuario y/o la contraseña no son válidos.");

                alertDenegado.showAndWait();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private void onCancelAction(ActionEvent e) {
        Node source = (Node) e.getSource();
        Stage stage= (Stage) source.getScene().getWindow();
        stage.close();
    }

}
