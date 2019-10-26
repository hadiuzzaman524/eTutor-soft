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
public class ClassfourbooksController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void english(ActionEvent event) throws IOException {
        link = "https://drive.google.com/file/d/1Rhok8BR2vc2cilo9GwqIj1TiTGZ7ZlKj/view";
        Parent root = FXMLLoader.load(getClass().getResource("OpenPdf.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void bangla(ActionEvent event) throws IOException {
        link = "https://drive.google.com/file/d/1sz2QQfcwEMsgirqFPCfqg0JtkWVDsvdl/view";
        Parent root = FXMLLoader.load(getClass().getResource("OpenPdf.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void math(ActionEvent event) throws IOException {
        link = "https://drive.google.com/file/d/1yaqsP088ebzFlahzx8KV5qVQnso34g-Q/view";
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
        link = "https://drive.google.com/file/d/11vRq4p_nL2VA5KnnE4TU8b9fOO4CgwMk/view";
        Parent root = FXMLLoader.load(getClass().getResource("OpenPdf.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void biggan(ActionEvent event) throws IOException {
        link = "https://drive.google.com/file/d/1flCVO1GLy49bjuT8KabGVk_0tJSIhiSW/view";
        Parent root = FXMLLoader.load(getClass().getResource("OpenPdf.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void dhormo(ActionEvent event) throws IOException {
        link = "https://drive.google.com/file/d/1_gbMhZlPmnTHCI9fd3XbjmQA9CZ1Mjsy/view";
        Parent root = FXMLLoader.load(getClass().getResource("OpenPdf.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

}
