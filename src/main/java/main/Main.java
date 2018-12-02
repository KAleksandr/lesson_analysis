package main;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import word.template.WordTemplate;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {
//    public static void disableWarning() {
//        System.err.close();
//        System.setErr(System.out);
//    }
//    public static void main(String[] args) throws IOException {
//        disableWarning();
//        String file = "src/main/resources/template.docx";
//        LocalDate localDate = LocalDate.now();
//
//
//        FileInputStream inputStream = new FileInputStream(file);
//
//
//        WordTemplate template = new WordTemplate();
//        Map<String, String> properties = new HashMap<>();
//        properties.put("#{year1}", localDate.getYear() + "");
//        properties.put("#{month1}", localDate.getMonthValue() + "");
//        properties.put("#{day1}", localDate.getDayOfMonth() + "");
//        properties.put("#{fullname}","FIO");
//        for (int i=1; i<=8; i++){
//
//            properties.put("#{n"+i+"}", ""+i);
//        }
//
//        properties.put("#{text1}", "Відповідно до дидактичної мети та завдань уроку, обсягу " +
//                "та складності матеріалу вчителем обрано такий тип уроку як урок закріплення знань.");
//        properties.put("#{author}", "Create by Oleksandr Kuzmenko");
//
//
//        XWPFDocument document = template.extractTemplate(inputStream, properties);
//
////        FileOutputStream outputStream = new FileOutputStream("src/main/resources/analysisLesson.docx");
//        Path path = Paths.get("lesson");
//
//        if (!Files.exists(path)) {
//
//
//            new File("lesson").mkdirs();
//        }
//        String out = new SimpleDateFormat( "yyyy-MM-dd hh-mm-ss'.docx'").format(new Date());
//        FileOutputStream outputStream = new FileOutputStream("lesson/analysisLesson" + out);
//
//        document.write(outputStream);
//        java.util.logging.Logger.getGlobal().info("Created full template. Successful.");
//
//    }
}
