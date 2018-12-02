package word.template;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WordValidator {

    private WordGenerate wordGenerate;

    {
        try {
            wordGenerate = new WordGenerate("src/main/resources/data/data.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String serviceWord(String numbersStr, int id){


        String[] numberStrArr = numbersStr.split("\\s+");

        // Converting a numeric code to a list of numbers
        List<Integer> numbers = new ArrayList<>();
        for (String numStr : numberStrArr) {
            try {
                int num = Integer.parseInt(numStr);
                int validNumber = 0;
                switch (id){
                    case 1 : if(num >= 1 && num <= 13) validNumber = num;
                    case 2 : if(num >= 14 && num <= 39) validNumber = num;
                    case 3 : if(num >= 40 && num <= 65) validNumber = num;
                    case 4 : if(num >= 66 && num <= 72) validNumber = num;
                    case 5 : if(num >= 73 && num <= 107) validNumber = num;
                    case 6 : if(num >= 108 && num <= 129) validNumber = num;
                    case 7 : if(num >= 130 && num <= 140) validNumber = num;
                    case 8 : if(num >= 141 && num <= 239) validNumber = num;
                    case 9 : if(num >= 241 && num <= 285) validNumber = num;
                    case 10 : if(num >= 287 && num <= 320) validNumber = num;
                    default: validNumber = 0;
                }
                numbers.add(Integer.valueOf(validNumber));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        final String sentence = wordGenerate.generateSentence(numbers);
        return sentence;
    }
}
