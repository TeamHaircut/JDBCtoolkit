package drivers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ARLVDriver extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {

    	Node simple = FXMLLoader.load(getClass().getResource("/arlv.fxml"));
		
        StackPane root = new StackPane();
        root.getChildren().add(simple);
        
        Scene scene = new Scene(root, 500, 200);
        
        primaryStage.setTitle("ARLVDriver.java");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 public static void main(String[] args) {
        launch(args);
    }

}
