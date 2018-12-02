package main;

import word.template.WordValidator;

public class Test {
    public static void main(String[] args) {
        WordValidator wordValidator = new WordValidator();

        String text = wordValidator.converterWord("2 4", 2);
        System.out.println(text);
    }
}
