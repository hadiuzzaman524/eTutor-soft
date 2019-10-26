
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


public class ClassfivebookController implements Initializable {

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    

    @FXML
    private void english(ActionEvent event) throws IOException {
            link = "https://drive.google.com/file/d/1CDZMpAglzLORNKJ3y4Ogv9v7qwAZP9az/view";
        Parent root = FXMLLoader.load(getClass().getResource("OpenPdf.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void bangla(ActionEvent event) throws IOException {
              link = "https://drive.google.com/file/d/1313kLdsas6xEd0cv6lJhhfFIlFTa4XTG/view";
        Parent root = FXMLLoader.load(getClass().getResource("OpenPdf.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void math(ActionEvent event) throws IOException {
                link = "https://drive.google.com/file/d/15lujxWjfSEB2mB7mCqjgqg8ATLTmGjL7/view";
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
            link = "https://drive.google.com/file/d/161XJbCMQKXrpdVu5DtSui4CSX9fpEHJi/view";
        Parent root = FXMLLoader.load(getClass().getResource("OpenPdf.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void biggan(ActionEvent event) throws IOException {
                 link = "https://drive.google.com/file/d/1rJI4nEKeoTXjiP6r49kGvLQGNJ5bdnXa/view";
        Parent root = FXMLLoader.load(getClass().getResource("OpenPdf.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void dhormo(ActionEvent event) throws IOException {
                 link = "https://drive.google.com/file/d/1v1kyKo3sUvHqPSqZSyiCSt9F-aXEZdYb/view";
        Parent root = FXMLLoader.load(getClass().getResource("OpenPdf.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }
    
}
