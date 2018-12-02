package application;

import entity.Componens;
import entity.Lesson;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import word.template.TemplateComplete;
import word.template.WordTransformer;

import java.io.IOException;
import java.time.LocalDate;

public class Controller {
//    private  static final Logger log = LoggerFactory.getLogger(LessonApp.class);
    private Lesson lesson;
    private WordTransformer wordTransformer;

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

        wordTransformer = new WordTransformer();

        //Fiil componens
        Componens componens = new Componens();
        componens.setTypeLesson(wordTransformer.changeTheNumbersToText(typeLesson.getText(), 1));
        componens.setOrganizagionLesson(wordTransformer.changeTheNumbersToText(organizationLesson.getText(), 2));
        componens.setEducationActivity(wordTransformer.changeTheNumbersToText(educationActivity.getText(), 3));
        componens.setEducationProcess(wordTransformer.changeTheNumbersToText(educationProcess.getText(), 4));
        componens.setMethodsLearning(wordTransformer.changeTheNumbersToText(methodsLearning.getText(),5));
        componens.setPrinciplesOfLearning(wordTransformer.changeTheNumbersToText(principlesOfLearning.getText(),6));
        componens.setToolsLearning(wordTransformer.changeTheNumbersToText(toolsLearning.getText(), 7));
        componens.setTypicalDisadvantages(wordTransformer.changeTheNumbersToText(typicalDisadvantages.getText(),8));
        componens.setConclusion(wordTransformer.changeTheNumbersToText(conclusion.getText(), 9));
        componens.setRecommendations(wordTransformer.changeTheNumbersToText(recommendations.getText(), 10));

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
