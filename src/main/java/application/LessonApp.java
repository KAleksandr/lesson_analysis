package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class LessonApp extends Application {


//    private  static final  Logger log = LoggerFactory.getLogger(LessonApp.class);

    @Override
    public void start(Stage stage) throws Exception {


//        log.info("Starting lesson analysis application");
//        InputStream input = this.getClass().getResourceAsStream("/images/clear.png");
//
//        Image image = new Image(input);
//
//        ImageView clear = new ImageView(image);

        String fxmlFile = "/fxml/lesson.fxml";

        FXMLLoader loader = new FXMLLoader();

        Parent parent =  loader.load(getClass().getResourceAsStream(fxmlFile));
        Scene scene = new Scene(parent, 635,600);
        scene.getStylesheets().add("/styles/styles.css");


        stage.setTitle("Lesson analysis");
        stage.setResizable(false);
        stage.getIcons().add(
                new Image(this.getClass().getResourceAsStream("/images/lesson.png")));
        stage.setScene(scene);





        stage.show();
    }

}
