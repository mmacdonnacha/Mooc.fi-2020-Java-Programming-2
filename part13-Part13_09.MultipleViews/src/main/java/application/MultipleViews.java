package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage window) throws Exception {
//        The layout of the first view is done with the help of the BorderPane class. 
//        At the top there is the text "First view!". 
//        The center of the view contains a button with the text "To the second view!". 
//        By pressing that button the application swithces to the second view.

        BorderPane borderPane = new BorderPane();
        Label firstLabel = new Label("First view!");
        Button firstButton = new Button("To the second view!");
        borderPane.setTop(firstLabel);
        borderPane.setCenter(firstButton);
        
        Scene firstScene = new Scene(borderPane);
        

        
//        The layout of the second view is done with the help of the VBox class. 
//        The first element in the layout is a button with the text "To the third view!" 
//        in it - by pressing the button the application switches to the third view. 
//        The button is followed by the text "Second view!".
        VBox verticalBox = new VBox();
        Button secondButton = new Button("To the third view!");
        Label secondLabel = new Label("Second view!");
        verticalBox.getChildren().addAll(secondButton, secondLabel);
        
        Scene secondScene = new Scene(verticalBox);
        
        
        
//        The third view uses the GridPane class for its layout.
//        At the coordinates (0, 0) there is a text that reads "Third view!". 
//        At coordinates (1, 1) there is a button with the text "To the first view!". 
//        Pressing this button brings back the first view.
        GridPane gridPane = new GridPane();
        Label thirdLabel = new Label("Third view!");
        Button thirdButton = new Button("To the first view!");
        gridPane.add(thirdLabel, 0, 0);
        gridPane.add(thirdButton, 1, 1);
           
        Scene thirdScene = new Scene(gridPane);
        
   
        firstButton.setOnAction( event -> {
            window.setScene(secondScene);
        });
        
        secondButton.setOnAction( event -> {
            window.setScene(thirdScene);
        });
        
        thirdButton.setOnAction( event -> {
            window.setScene(firstScene);
        });
        

                 
        window.setScene(firstScene);
        window.show();
        
    }

}
