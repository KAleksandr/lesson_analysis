package application;

import entity.Componens;
import entity.Lesson;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import word.template.TemplateComplete;
import word.template.WordValidator;

import java.io.IOException;
import java.time.LocalDate;

public class Controller {
    private  static final Logger log = LoggerFactory.getLogger(LessonApp.class);
    private Lesson lesson;
    private WordValidator wordValidator;

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




    public void fillComponent() throws IOException {
        // if date = null fill LocaleDate.now
        if (date.getValue() == null){
            date.setValue(LocalDate.now());
        }

        wordValidator = new WordValidator();

        //Fiil componens
        Componens componens = new Componens();
        componens.setTypeLesson(wordValidator.converterWord(typeLesson.getText(), 1));
        componens.setOrganizagionLesson(wordValidator.converterWord(organizationLesson.getText(), 2));
        componens.setEducationActivity(wordValidator.converterWord(educationActivity.getText(), 3));
        componens.setEducationProcess(wordValidator.converterWord(educationProcess.getText(), 4));
        componens.setMethodsLearning(wordValidator.converterWord(methodsLearning.getText(),5));
        componens.setPrinciplesOfLearning(wordValidator.converterWord(principlesOfLearning.getText(),6));
        componens.setToolsLearning(wordValidator.converterWord(toolsLearning.getText(), 7));
        componens.setTypicalDisadvantages(wordValidator.converterWord(typicalDisadvantages.getText(),8));
        componens.setConclusion(wordValidator.converterWord(conclusion.getText(), 9));
        componens.setRecommendations(wordValidator.converterWord(recommendations.getText(), 10));

        lesson = new Lesson(date.getValue().toString(),
                group.getText(),
                subject.getText(),
                fullName.getText(),
                themeOfTheLesson.getText(),
                purposeOfTheLesson.getText(),
                componens);
//        log.info(lesson.toString());
//        java.util.logging.Logger.getGlobal().info("Fill class");
//        java.util.logging.Logger.getGlobal().info(lesson.toString());
        java.util.logging.Logger.getGlobal().info("Successful! Template Complete. ");
        TemplateComplete.fillTemplateText(lesson);

    }
}
