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
public class ClasstenbooksController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void bangla(ActionEvent event) throws IOException {
        link = "https://drive.google.com/file/d/11BcRcxc9_QHWpavIjG3sOIB-hFx8j2W4/view";
        Parent root = FXMLLoader.load(getClass().getResource("OpenPdf.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void english(ActionEvent event) throws IOException {
        link = "https://drive.google.com/file/d/1F61zD9ADE7Ja6jxL-MUvqwnUhbEyj5CI/view";
        Parent root = FXMLLoader.load(getClass().getResource("OpenPdf.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void math(ActionEvent event) throws IOException {
        link = "https://drive.google.com/file/d/12xXzlNW5Ic_7i7mq__IGan6-ut8B7mN3/view";
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
    private void jibbiggan(ActionEvent event) throws IOException {
        link = "https://drive.google.com/file/d/1BH31zG8awjv2DPUvRLRHsIyw9RnnAQn1/view";
        Parent root = FXMLLoader.load(getClass().getResource("OpenPdf.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void physics(ActionEvent event) throws IOException {
        link = "https://drive.google.com/file/d/1QoaQUJC9cEdMafBGjTbbIDQlhGKOaTI4/view";
        Parent root = FXMLLoader.load(getClass().getResource("OpenPdf.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void chemistry(ActionEvent event) throws IOException {
        link = "https://drive.google.com/file/d/1J3LHRnfsBSQ-R4p0Q-jGZ9vCVRfjtf46/view";
        Parent root = FXMLLoader.load(getClass().getResource("OpenPdf.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void ict(ActionEvent event) throws IOException {
        link = "https://drive.google.com/file/d/1Duu1rbLxRrYz63SHHwxXG6X4Lg9pEx-T/view";
        Parent root = FXMLLoader.load(getClass().getResource("OpenPdf.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void highermath(ActionEvent event) throws IOException {
        link = "https://drive.google.com/file/d/1hNkgvx_naHivYkrf1F5Ta3owLczP6CH9/view";
        Parent root = FXMLLoader.load(getClass().getResource("OpenPdf.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

    @FXML
    private void somaj(ActionEvent event) throws IOException {
        link = "https://drive.google.com/file/d/16R5C7aLib7tRteMlcai5MwlV6sr2iFph/view";
        Parent root = FXMLLoader.load(getClass().getResource("OpenPdf.fxml"));

        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        stage2.show();
        stage = stage2;
    }

}
