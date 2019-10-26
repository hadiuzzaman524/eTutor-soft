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
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class Tutorials_LinkController implements Initializable {

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

        link = "https://www.youtube.com/channel/UCnXmuphQV3fxs51znrr4eng/playlists?view=50&sort=dd&shelf_id=9";

        Parent root = FXMLLoader.load(getClass().getResource("PlayVideo.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void two(ActionEvent event) throws IOException {

        link = "https://www.youtube.com/channel/UCnXmuphQV3fxs51znrr4eng/playlists?view=50&sort=dd&shelf_id=10";
        Parent root = FXMLLoader.load(getClass().getResource("PlayVideo.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void three(ActionEvent event) throws IOException {

        link = "https://www.youtube.com/channel/UCnXmuphQV3fxs51znrr4eng/playlists?view=50&sort=dd&shelf_id=8";
        Parent root = FXMLLoader.load(getClass().getResource("PlayVideo.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void four(ActionEvent event) throws IOException {

        link = "https://www.youtube.com/channel/UCnXmuphQV3fxs51znrr4eng/playlists?view=50&sort=dd&shelf_id=7";
        Parent root = FXMLLoader.load(getClass().getResource("PlayVideo.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void five(ActionEvent event) throws IOException {
        link = "https://www.youtube.com/channel/UCnXmuphQV3fxs51znrr4eng/playlists?view=50&sort=dd&shelf_id=6";
        Parent root = FXMLLoader.load(getClass().getResource("PlayVideo.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void six(ActionEvent event) throws IOException {

        link = "https://www.youtube.com/channel/UCnXmuphQV3fxs51znrr4eng/playlists?view=50&sort=dd&shelf_id=5";
        Parent root = FXMLLoader.load(getClass().getResource("PlayVideo.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void ssc(ActionEvent event) throws IOException {

        link = "https://www.youtube.com/channel/UCnXmuphQV3fxs51znrr4eng/playlists?view=50&sort=dd&shelf_id=1";
        Parent root = FXMLLoader.load(getClass().getResource("PlayVideo.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void eight(ActionEvent event) throws IOException {

        link = "https://www.youtube.com/channel/UCnXmuphQV3fxs51znrr4eng/playlists?view=50&sort=dd&shelf_id=3";
        Parent root = FXMLLoader.load(getClass().getResource("PlayVideo.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void hsc(ActionEvent event) throws IOException {
        link = "https://www.youtube.com/user/OnnorokomPathshala/playlists";
        Parent root = FXMLLoader.load(getClass().getResource("PlayVideo.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void seven(ActionEvent event) throws IOException {

        link = "https://www.youtube.com/channel/UCnXmuphQV3fxs51znrr4eng/playlists?view=50&sort=dd&shelf_id=4";
        Parent root = FXMLLoader.load(getClass().getResource("PlayVideo.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
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
      //  link = "https://www.google.com";
      link="https://helpfulhub.com/blog/class-9-10-ssc-2019-all-pdf-textbooks-of-bangladesh-free-download/";
        Parent root = FXMLLoader.load(getClass().getResource("PlayVideo.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;

    }

}
