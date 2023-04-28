package org.in5bm.carlosdiaz.system;
import org.in5bm.carlosdiaz.bean.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import org.in5bm.carlosdiaz.controller.FXMLCalculadoraController;

/**
 *
 * @author carlos diaz
 * @date 25/03/2022
 * carne: 2018312
 * codigo tecnico: IN5BM
 * grupo: 1
 * 
 */
public class Principal extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage)throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../view/FXMLCalculadoraView.fxml"));
        
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
                
    }
}
        
