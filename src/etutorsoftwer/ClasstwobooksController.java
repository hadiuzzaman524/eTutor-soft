/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etutorsoftwer;

import static etutorsoftwer.NotebooksController.link;
import static etutorsoftwer.NotebooksController.stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class ClasstwobooksController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void english(ActionEvent event) throws IOException {
        link = "https://drive.google.com/file/d/1kapx1BSE8MIkcgxWVqssGgYXIZpV-bPx/view";
        Parent root = FXMLLoader.load(getClass().getResource("OpenPdf.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void bangla(ActionEvent event) throws IOException {
        link = "https://drive.google.com/file/d/1DmBbMQcXluDX6yZeD-NJAYpoJ4yYeR1U/view";
        Parent root = FXMLLoader.load(getClass().getResource("OpenPdf.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void math(ActionEvent event) throws IOException {
        link = "https://drive.google.com/file/d/1t5sybipBh3Vn05dPce-9XzphqlvhL1n3/view";
        Parent root = FXMLLoader.load(getClass().getResource("OpenPdf.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void backbutton(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Notebooks.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage2.setScene(scene);
        stage2.show();
    }

}
