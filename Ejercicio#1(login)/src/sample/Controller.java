package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller {
    @FXML
    private PasswordField password;

    @FXML
    private Button login;

    @FXML
    private TextField user;

    @FXML
    private Text lblMessage;


    @FXML
    void loginAction(ActionEvent event) throws IOException {
        if (user.getText().equals("admin")&&password.getText().equals("123456")) {
            ((Node)(event.getSource())).getScene().getWindow().hide();
            Parent parent = FXMLLoader.load(getClass().getResource("Home.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.setTitle("HOME");
            stage.show();
        }else{
            login.disabledProperty();
            lblMessage.setText("Usuario o Password Invalido!!!");

        }

    }

}
