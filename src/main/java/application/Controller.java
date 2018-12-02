package application;

import entity.Componens;
import entity.Lesson;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;

public class Controller {
    private  static final Logger log = LoggerFactory.getLogger(LessonApp.class);
    private Lesson lesson;

    @FXML private DatePicker date;
    @FXML private TextField group;
    @FXML private TextField subject;
    @FXML private TextField fullName;
    @FXML private TextField themeOfTheLesson;
    @FXML private TextField purposeOfTheLesson;

    @FXML private TextField typeLesson;
    @FXML private TextField organizationLesson;
    @FXML private TextField educationActivity;
    @FXML private TextField educationProcess;
    @FXML private TextField methodsLearning;
    @FXML private TextField principlesOfLearning;
    @FXML private TextField toolsLearning;
    @FXML private TextField typicalDisadvantages;
    @FXML private TextField conclusion;
    @FXML private TextField recommendations;




    public void fillComponent(){

        if (date.getValue() == null){
            date.setValue(LocalDate.now());
        }

        Componens componens = new Componens(typeLesson.getText(), organizationLesson.getText(),
                educationActivity.getText(), educationProcess.getText(),methodsLearning.getText(),
                principlesOfLearning.getText(), toolsLearning.getText(), typicalDisadvantages.getText(),
                conclusion.getText(), recommendations.getText());
        lesson = new Lesson(date.getValue().toString(),
                group.getText(),
                subject.getText(),
                fullName.getText(),
                themeOfTheLesson.getText(),
                purposeOfTheLesson.getText(),
                componens);
        log.info(lesson.toString());
        java.util.logging.Logger.getGlobal().info("Fill class");
        java.util.logging.Logger.getGlobal().info(lesson.toString());
    }
}
