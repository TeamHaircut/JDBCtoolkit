package drivers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SimpleDriver extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {

    	Node simple = FXMLLoader.load(getClass().getResource("/simple.fxml"));
		
        StackPane root = new StackPane();
        root.getChildren().add(simple);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("SimpleDriver.java");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 public static void main(String[] args) {
        launch(args);
    }

}
