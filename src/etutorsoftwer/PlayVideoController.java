/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etutorsoftwer;

import static etutorsoftwer.Tutorials_LinkController.link;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class PlayVideoController implements Initializable {

    @FXML
    private WebView wbview;
    private WebEngine engine;
    String Link = Tutorials_LinkController.link;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
          engine=wbview.getEngine();
         engine.load(Link);
     

    }

    @FXML
    private void close(ActionEvent event) {
        Tutorials_LinkController.stage.close();
    }

}
