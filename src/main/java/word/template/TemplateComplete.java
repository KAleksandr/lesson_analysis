package word.template;


import entity.Lesson;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TemplateComplete {
    private static final String FILE = "/template/template.docx";

    private static void disableWarning() {
        System.err.close();
        System.setErr(System.out);
    }
    public static void fillTemplateText(Lesson lesson) throws IOException {
        disableWarning();


        InputStream inputStream = TemplateComplete.class.getResourceAsStream(FILE);

        WordTemplate template = new WordTemplate();
        Map<String, String> properties = new HashMap<>();

        properties.put("#{date}",lesson.getData());
        properties.put("#{group}", lesson.getGroup());
        properties.put("#{subject}", lesson.getSubject());
        properties.put("#{fullName}", lesson.getFullName());
        properties.put("#{themeOfTheLesson}", lesson.getThemeOfTheLesson());
        properties.put("#{purposeOfTheLesson}", lesson.getPurposeOfTheLesson());
        properties.put("#{nameControl}", lesson.getNameControl());
        properties.put("#{typeLesson}", lesson.getComponens().getTypeLesson());
        properties.put("#{organizationLesson}", lesson.getComponens().getOrganizationLesson());
        properties.put("#{educationActivity}", lesson.getComponens().getEducationActivity());
        properties.put("#{educationProcess}", lesson.getComponens().getEducationProcess());
        properties.put("#{methodsLearning}", lesson.getComponens().getMethodsLearning());
        properties.put("#{principlesOfLearning}",lesson.getComponens().getPrinciplesOfLearning());
        properties.put("#{toolsLearning}", lesson.getComponens().getToolsLearning());
        properties.put("#{typicalDisadvantages}", lesson.getComponens().getTypicalDisadvantages());
        properties.put("#{conclusion}", lesson.getComponens().getConclusion());
        properties.put("#{recommendations}", lesson.getComponens().getRecommendations());



        properties.put("#{author}", "Create by Oleksandr Kuzmenko");


        XWPFDocument document = template.extractTemplate(inputStream, properties);

        //Create a folder if it is not
        Path path = Paths.get("lesson");
        if (!Files.exists(path)) {
            new File("lesson").mkdirs();
        }
        String out = new SimpleDateFormat( "yyyy-MM-dd hh-mm-ss'.docx'").format(new Date());
        FileOutputStream outputStream = new FileOutputStream("lesson/analysisLesson" + out);

        document.write(outputStream);
        java.util.logging.Logger.getGlobal().info("Successful! Template Complete. ");

    }
}
