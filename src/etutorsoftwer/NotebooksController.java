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
import javafx.scene.web.WebEngine;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class NotebooksController implements Initializable {

    private WebEngine engine;
    public static String link = "";
    public static Stage stage;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void one(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("ClassOnebookList.fxml"));

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void two(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Classtwobooks.fxml"));

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void three(ActionEvent event) throws IOException {

       Parent root = FXMLLoader.load(getClass().getResource("Classthreebooks.fxml"));

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void four(ActionEvent event) throws IOException {

      Parent root = FXMLLoader.load(getClass().getResource("Classfourbooks.fxml"));

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void five(ActionEvent event) throws IOException {
          Parent root = FXMLLoader.load(getClass().getResource("Classfivebook.fxml"));

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void six(ActionEvent event) throws IOException {

   
        Parent root = FXMLLoader.load(getClass().getResource("Classsixbooks.fxml"));

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void ssc(ActionEvent event) throws IOException {

       Parent root = FXMLLoader.load(getClass().getResource("Classtenbooks.fxml"));

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void eight(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Classeightbooks.fxml"));

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void hsc(ActionEvent event) throws IOException {
       Parent root = FXMLLoader.load(getClass().getResource("Hscbooks.fxml"));

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void seven(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Classsevenbooks.fxml"));

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Student_dashboard.fxml"));

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void google(ActionEvent event) throws IOException {
        link = "https://www.google.com";
        // link="https://drive.google.com/drive/folders/1-LTgRcZ85XBLXvk13JZGB-Wj2b_KOrFg?usp=sharing";

        Parent root = FXMLLoader.load(getClass().getResource("OpenPdf.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;

    }

}
