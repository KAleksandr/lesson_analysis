package application;

import entity.Componens;
import entity.Lesson;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import word.template.TemplateComplete;
import word.template.WordTransformer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Controller {
    //    private  static final Logger log = LoggerFactory.getLogger(LessonApp.class);
    private ExecutorService exector = Executors.newSingleThreadExecutor();
    private Lesson lesson;
    private WordTransformer wordTransformer;

    @FXML
    private DatePicker date;
    @FXML
    private TextField group;
    @FXML
    private TextField subject;
    @FXML
    private TextField fullName;
    @FXML
    private TextField themeOfTheLesson;
    @FXML
    private TextField purposeOfTheLesson;
    @FXML
    private TextField nameControl;

    @FXML
    private TextField typeLesson;
    @FXML
    private TextField organizationLesson;
    @FXML
    private TextField educationActivity;
    @FXML
    private TextField educationProcess;
    @FXML
    private TextField methodsLearning;
    @FXML
    private TextField principlesOfLearning;
    @FXML
    private TextField toolsLearning;
    @FXML
    private TextField typicalDisadvantages;
    @FXML
    private TextField conclusion;
    @FXML
    private TextField recommendations;
    @FXML
    private Button create;


    public void fillComponent()  {


        // if date = null fill LocaleDate.now
        if (date.getValue() == null) {
            date.setValue(LocalDate.now());
        }

        wordTransformer = new WordTransformer();

        //Fiil componens
        Componens componens = new Componens();
        componens.setTypeLesson(wordTransformer.changeTheNumbersToText(typeLesson.getText(), 1));
        componens.setOrganizagionLesson(wordTransformer.changeTheNumbersToText(organizationLesson.getText(), 2));
        componens.setEducationActivity(wordTransformer.changeTheNumbersToText(educationActivity.getText(), 3));
        componens.setEducationProcess(wordTransformer.changeTheNumbersToText(educationProcess.getText(), 4));
        componens.setMethodsLearning(wordTransformer.changeTheNumbersToText(methodsLearning.getText(), 5));
        componens.setPrinciplesOfLearning(wordTransformer.changeTheNumbersToText(principlesOfLearning.getText(), 6));
        componens.setToolsLearning(wordTransformer.changeTheNumbersToText(toolsLearning.getText(), 7));
        componens.setTypicalDisadvantages(wordTransformer.changeTheNumbersToText(typicalDisadvantages.getText(), 8));
        componens.setConclusion(wordTransformer.changeTheNumbersToText(conclusion.getText(), 9));
        componens.setRecommendations(wordTransformer.changeTheNumbersToText(recommendations.getText(), 10));

        lesson = new Lesson(date.getValue().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                group.getText(),
                subject.getText(),
                fullName.getText(),
                themeOfTheLesson.getText(),
                wordTransformer.changeTheNumbersToText(purposeOfTheLesson.getText(), 0),
                nameControl.getText(),
                componens);

        create.setText("Створено!");

        exector.submit(() -> {
            try {
                TemplateComplete.fillTemplateText(lesson);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        alert.initOwner(dialogStage);
        alert.setTitle("Аналіз уроку");


        alert.setHeaderText("Файл збережено в папці lesson.");
        alert.showAndWait();
        create.setText("Створити");
//        log.info(lesson.toString());
//        java.util.logging.Logger.getGlobal().info("Fill class");
//        java.util.logging.Logger.getGlobal().info(lesson.toString());
        java.util.logging.Logger.getGlobal().info("Successful! Template Complete.");
    }

    public void clearData() {

        group.setText("");
        subject.setText("");
        fullName.setText("");
        themeOfTheLesson.setText("");
        purposeOfTheLesson.setText("");
        nameControl.setText("");

        typeLesson.setText("");
        organizationLesson.setText("");
        educationActivity.setText("");
        educationProcess.setText("");
        methodsLearning.setText("");
        principlesOfLearning.setText("");
        toolsLearning.setText("");
        typicalDisadvantages.setText("");
        conclusion.setText("");
        recommendations.setText("");
    }



}
