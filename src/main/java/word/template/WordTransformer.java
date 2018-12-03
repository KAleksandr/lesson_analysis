package word.template;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WordTransformer {
    private static final String FILE_PATH ="/data/data.txt";
    //no data to convert
    private static final int NODATE = 0;
    private WordGenerate wordGenerate;

    {
        try {
            wordGenerate = new WordGenerate(FILE_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String changeTheNumbersToText(String numbersStr, int id){

        if(numbersStr.isEmpty()){
            return "";
        }

        String[] numberStrArr = numbersStr.split("\\s+");

        // Converting a numeric code to a list of numbers
        List<Integer> numbers = new ArrayList<>();
        for (String numStr : numberStrArr) {
            try {
                int num = Integer.parseInt(numStr);
                int validNumber = NODATE;
                switch (id){
                    case 0: if(num >=1 && num <= 93) validNumber = num;
                        break;
                    case 1 : if(num >= 94 && num <= 106) validNumber = num;
                        break;
                    case 2 : if(num >= 107 && num <= 132) validNumber = num;
                        break;
                    case 3 : if(num >= 133 && num <= 158) validNumber = num;
                        break;
                    case 4 : if(num >= 159 && num <= 165) validNumber = num;
                        break;
                    case 5 : if(num >= 166 && num <= 200) validNumber = num;
                        break;
                    case 6 : if(num >= 201 && num <= 222) validNumber = num;
                        break;
                    case 7 : if(num >= 223 && num <= 233) validNumber = num;
                        break;
                    case 8 : if(num >= 234 && num <= 332) validNumber = num;
                        break;
                    case 9 : if(num >= 333 && num <= 377) validNumber = num;
                        break;
                    case 10 : if(num >= 378 && num <= 411) validNumber = num;
                        break;
                    default: validNumber = NODATE; break;
                }
                numbers.add(validNumber);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return wordGenerate.generateSentence(numbers);
    }
}
