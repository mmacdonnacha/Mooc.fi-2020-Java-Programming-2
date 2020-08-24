package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        TextArea textArea = new TextArea();
        Label letterCount = new Label("Letters: 0");
        Label wordCount = new Label("Words: 0");
        Label longestWord = new Label("The longest word is:");

        HBox hbox = new HBox();
        hbox.setSpacing(10);
        hbox.getChildren().add(letterCount);
        hbox.getChildren().add(wordCount);
        hbox.getChildren().add(longestWord);

        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            // set values of text elements
            String letterText = letterCount.getText().split(" ")[0] + " " + characters;
            letterCount.setText(letterText);
            
            String wordText = wordCount.getText().split(" ")[0] + " " + words;
            wordCount.setText(wordText);
            
            String longestText = longestWord.getText().split(":")[0] + ": " + longest;
            longestWord.setText(longestText);
            
        });

        layout.setCenter(textArea);
        layout.setBottom(hbox);

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
