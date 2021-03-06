/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

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
 * FXML Controller class for the game help page.
 *
 * @author Tauseef
 */
public class HowToPlayController implements Initializable
{
    
    /**
     * Sets the previous scene when the back button is pressed.
     * @param event Mouse click
     * @throws Exception when files are not loaded correctly.
     * @author Tauseef
     */
    @FXML
    private void clickback(ActionEvent event) throws Exception
    {
        Parent puzzlesParent = FXMLLoader.load(getClass().getResource("Welcome.fxml"));
        Scene puzzlesScene = new Scene(puzzlesParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(puzzlesScene);
        window.show();
    }

    /**
     * Initializes the controller class.
     * @author Tauseef
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    
    
}
