package application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;


public class LessonApp extends Application {

    private  static final  Logger log = LoggerFactory.getLogger(LessonApp.class);

    @Override
    public void start(Stage stage) throws Exception {



        log.info("Starting lesson analysis application");


        String fxmlFile = "/fxml/lesson.fxml";

        FXMLLoader loader = new FXMLLoader();

        Parent parent = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));
        Scene scene = new Scene(parent, 641,540);
        scene.getStylesheets().add("/styles/styles.css");

        stage.setTitle("Lesson analysis");
        stage.setResizable(false);
        stage.getIcons().add(
                new Image(this.getClass().getResourceAsStream("/images/lesson.png")));
        stage.setScene(scene);

        stage.show();
    }
    public static void main(String[] args) {

        launch(args);
    }
}
