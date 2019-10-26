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
public class ClassthreebooksController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void english(ActionEvent event) throws IOException {
                link = "https://drive.google.com/file/d/1H0b_2OjL2TXcr9CQbTY9zniOC0gS8Ghz/view";
        Parent root = FXMLLoader.load(getClass().getResource("OpenPdf.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void bangla(ActionEvent event) throws IOException {
                link = "https://drive.google.com/file/d/1GFauxnU4VZdRHT5SBrx2HtxxT_BpaBF7/view";
        Parent root = FXMLLoader.load(getClass().getResource("OpenPdf.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void math(ActionEvent event) throws IOException {
                link = "https://drive.google.com/file/d/1qj-g4MghU_tt6BaXlr9UVrjAaPFX1skh/view";
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

    @FXML
    private void somaj(ActionEvent event) throws IOException {
                link = "https://drive.google.com/file/d/1xAYpf-v_6bG0JnI2lQtHVUWzh-xGdkgw/view";
        Parent root = FXMLLoader.load(getClass().getResource("OpenPdf.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void biggan(ActionEvent event) throws IOException {
                link = "https://drive.google.com/file/d/1kPPXcS-6NEGx36Gj30DkyCLzK6G7BnVo/view";
        Parent root = FXMLLoader.load(getClass().getResource("OpenPdf.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void dhormo(ActionEvent event) throws IOException {
                link = "https://drive.google.com/file/d/1RTkBw4Bp_I2U9VKcMZXjX13jm5XWvs1C/view";
        Parent root = FXMLLoader.load(getClass().getResource("OpenPdf.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }
    
}
