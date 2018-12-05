
package word.template;

import org.apache.poi.xwpf.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * @author O.Kuzmenko
 *         Опис програми і ліцензія: https://github.com/KAleksandr/lesson_analysis
 */
class WordTemplate {

    private InputStream load(String path){
        InputStream stream;
        //Find out-of-package configuration
        try{
            stream = new FileInputStream(System.getProperty("user.dir") + System.getProperty("file.separator") + path);
        }catch (FileNotFoundException e){
            //Looking for in-package configuration
            stream = getClass().getClassLoader().getResourceAsStream(path);

        }
        return stream;
    }

    /**
     * Extract the word template
     * @param stream inputstream to word
     * @return XWPFDocument
     *
     */
    XWPFDocument extractTemplate(InputStream stream, Map<String, String> properties) throws IOException{
        XWPFDocument doc = new XWPFDocument(stream);
        replaceParagraphs(doc.getParagraphs(), properties);
        replaceTable(doc.getTablesIterator(), properties);
        return  doc;
    }


    /**
     * Configure settings paragraph.
     * @param paragraphs paragraph
     * @param properties properties
     */
    private void replaceParagraphs(List<XWPFParagraph> paragraphs, Map<String,String> properties){
        for (XWPFParagraph paragraph : paragraphs){
            replaceInParagraph(paragraph, properties);
        }
    }

    private void replaceInParagraph(XWPFParagraph paragraph, Map<String, String> properties){
        int begin = -1;
        String text = "";

        if(matcher(paragraph.getParagraphText()).find()){
            List<XWPFRun> runs = paragraph.getRuns();
            for (int i=0; i < runs.size(); i++){
                String runText = runs.get(i).toString();
                if (runText.startsWith("#")) begin = i;
                if (begin != -1) text +=runText;
                if (runText.endsWith("}") && begin != -1){
                    for (int j = 0; j < i - begin; j++){
                        paragraph.removeRun(begin + 1);
                    }
                    for (Entry<String, String> entry : properties.entrySet()){
                        if (text.equals(entry.getKey())) {
                            runs.get(begin).setText(properties.get(entry.getKey()),0);
                            break;
                        }
                    }
                    break;
                }

                }
                replaceInParagraph(paragraph, properties);
            }

    }

    /**
     * Configure settings table.
     * @param tableIterator Iterator
     * @param properties properties
     */
    private void replaceTable(Iterator<XWPFTable> tableIterator, Map<String, String> properties){
        while (tableIterator.hasNext()){
            XWPFTable table = tableIterator.next();
            extractTableLines(properties, table);
        }
    }
    /**
     * Configure settings table line.
     * @param table table
     * @param properties properties
     */
    private void extractTableLines(Map<String, String> properties, XWPFTable table){
        List<XWPFTableCell> cells;
        List<XWPFTableRow> rows = table.getRows();

        for (XWPFTableRow row : rows){
            cells = row.getTableCells();
            for (XWPFTableCell cell : cells){
                replaceParagraphs(cell.getParagraphs(), properties);
            }
        }
    }

    private Matcher matcher(String text){
        Pattern pattern = Pattern.compile("#\\{.+?\\}", Pattern.CASE_INSENSITIVE);
        return pattern.matcher(text);
    }
}
