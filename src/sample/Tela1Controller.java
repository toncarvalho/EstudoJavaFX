package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Created by Ton on 13/11/2014.
 */
public class Tela1Controller  extends Application {

    @FXML
    private TextField edtEmail;

    @FXML
    private Label lblEmail;

    @FXML
    private Label lblNome;

    @FXML
    private TextField edtNome;

    @Override
    public void start(Stage palco) throws Exception {
        Parent tela = FXMLLoader.load(getClass().getResource("tela1.fxml"));
        palco.setTitle("Tela 1");
        palco.setScene(new Scene(tela, 800, 600));
        palco.show();

        //controller --> bussines --> dao --> banco
        //retorno
        //dao --> bussiness --> controller ( manipula a tela )

    }
}
