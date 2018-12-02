package word.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordGenerate {
    private static final String SPREDER = " ";
    private static final String NUMBER_WITH_DOT = "\\d+\\..+";
    private static final String NUMBER = "(\\d+)\\.\\s+.+";
    private static final String SENTENCES ="\\d+\\.\\s+(.+)";

    private Map<Integer, String> numberToText = new HashMap<>();


    public WordGenerate(String fileWithData) throws IOException {

        InputStream inputStream = WordGenerate.class.getResourceAsStream(fileWithData);
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
//                new FileInputStream(fileWithData), "UTF-8"))){
                inputStream, "UTF-8"))){
            String line;
            while ((line = bufferedReader.readLine()) != null){
                if (line.matches(NUMBER_WITH_DOT)){
                    String numLine = line.replaceAll(NUMBER, "$1");
                    int number = Integer.parseInt(numLine);

                    //Reading sentences
                    String sentences = line.replaceAll(SENTENCES, "$1");
                    numberToText.put(number, sentences);
                }
            }
        }
    }
    public String generateSentence(List<Integer> numbers){
        StringBuilder stringBuilder = new StringBuilder();

        for (Integer numb : numbers){
            String sentence = numberToText.get(numb);
            if (sentence != null){
                stringBuilder.append(sentence).append(SPREDER);
            }
        }
        return  stringBuilder.toString();
    }


}
