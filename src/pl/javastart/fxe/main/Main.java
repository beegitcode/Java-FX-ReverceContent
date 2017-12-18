package pl.javastart.fxe.main;
 
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class Main extends Application {
 
    @Override
    public void start(Stage stage) throws Exception {
        Parent parent = (Parent)FXMLLoader.load(getClass().
        		
        		getResource("/pl/javastart/fxe/view/ContentPane.fxml"));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Text Converter");
        stage.show();
    }
     
    public static void main(String[] args) {
        launch(args);
    }
}