package dad.login.ui;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class LoginModel {

    private StringProperty user = new SimpleStringProperty();
    private StringProperty pass = new SimpleStringProperty();
    private BooleanProperty useLdap = new SimpleBooleanProperty();

    public String getUser() {
        return user.get();
    }

    public StringProperty userProperty() {
        return user;
    }

    public void setUser(String user) {
        this.user.set(user);
    }

    public String getPass() {
        return pass.get();
    }

    public StringProperty passProperty() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass.set(pass);
    }

    public boolean isUseLdap() {
        return useLdap.get();
    }

    public BooleanProperty useLdapProperty() {
        return useLdap;
    }

    public void setUseLdap(boolean useLdap) {
        this.useLdap.set(useLdap);
    }
}
