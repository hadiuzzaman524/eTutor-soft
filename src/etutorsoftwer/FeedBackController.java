/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etutorsoftwer;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class FeedBackController implements Initializable {

    @FXML
    private TextField comment;
    @FXML
    private Label label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void Post(ActionEvent event) throws SQLException {
        String comm = comment.getText();
        String name = Student_loginController.nam;
        AllcommentGeter obj = new AllcommentGeter(name, comm);
        Commentstoredatabase obj2 = new Commentstoredatabase();
        String queary = "insert into information values('" + obj.getName() + "','" + obj.getComment() + "')";
        boolean m = false;
        if (comm.equals("")) {
            label.setText("Empty comment.Please write somthing");
        } else {
            m = obj2.addcomment(queary);
            if (m == true) {
                label.setText("comment is added !");
            } else {
                label.setText("comment is not added please try again");
            }

        }

    }

    @FXML
    private void Otherscomment(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FeedbackOthercommentsshow.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage2.setScene(scene);
        stage2.show();

    }

    @FXML
    private void close(ActionEvent event) {
        Student_dashboardController.stage.close();
    }

}
