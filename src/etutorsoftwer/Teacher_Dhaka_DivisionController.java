/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etutorsoftwer;

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
public class Teacher_Dhaka_DivisionController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void TangailButton(ActionEvent event) {
    }

    @FXML
    private void KishorganjButton(ActionEvent event) {
    }

    @FXML
    private void Backbutton(ActionEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("Teacher_Select_Division.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage2.setScene(scene);
        stage2.show();
    }

    @FXML
    private void GazipurButton(ActionEvent event) {
    }

    @FXML
    private void DhakaButton(ActionEvent event) {
    }

    @FXML
    private void NorsingdiButton(ActionEvent event) {
    }

    @FXML
    private void RajbariButton(ActionEvent event) {
    }

    @FXML
    private void ManikGanjButton(ActionEvent event) {
    }

    @FXML
    private void NaranganjButton(ActionEvent event) {
    }

    @FXML
    private void MunshiganjButton(ActionEvent event) {
    }

    @FXML
    private void FaridpurButton(ActionEvent event) {
    }

    @FXML
    private void Madaripurbutton(ActionEvent event) {
    }

    @FXML
    private void GopalganjButton(ActionEvent event) {
    }
    
}
