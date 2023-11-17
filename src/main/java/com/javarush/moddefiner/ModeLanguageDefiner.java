package com.javarush.moddefiner;

import com.javarush.constants.AlphabetSamples;

public class ModeLanguageDefiner {
    public String LanguageDefiner(String text) {
        String language;
        char[] stringToChar = text.toCharArray();
        int totalLetters = 0;
        for (char letter : stringToChar) {
            if (Character.isLetter(letter)) {
                totalLetters++;
            }
        }
        int counterEngLetters = 0;
        int counterUkrLetters = 0;
        for (int i = 0; i < stringToChar.length; i++) {
            if (Character.isLetter(stringToChar[i])) {
                if (AlphabetSamples.EN_ALPHABET.contains(stringToChar[i])) {
                    counterEngLetters++;
                } else {
                    counterUkrLetters++;
                }
            }
        }
        return  language = counterEngLetters == totalLetters?"eng":"ukr";
    }
}
