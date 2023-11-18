package com.javarush.brute_force;

import com.javarush.constants.AlphabetSamples;
import com.javarush.io.FileWriter;

public class BruteForce {
    String text;
    String filePath;

    public BruteForce(String text, String filePath) {
        this.text = text;
        this.filePath = filePath;
    }

    public void brutForce() {

        int currentIndex;
        int index;
        int originalKey = 0;
        char[] textToCharArray = text.toCharArray();
        boolean keyIsNotFound = true;
        int key = 0;
        while (keyIsNotFound) {
            StringBuilder stringBuilder = new StringBuilder();
            for (char symbol : textToCharArray) {
                if (AlphabetSamples.EN_ALPHABET.contains(symbol)) {
                    currentIndex = AlphabetSamples.EN_ALPHABET.indexOf(symbol);
                    index = currentIndex - key > 0 ? currentIndex - key : (AlphabetSamples.EN_ALPHABET.size() - 1) + (currentIndex - key);
                    stringBuilder.append(AlphabetSamples.EN_ALPHABET.get(index));
                } else {
                    stringBuilder.append(symbol);
                }
            }
            for (int i = 0; i < AlphabetSamples.SIMPLE_WORDS.size(); i++) {
                if (stringBuilder.toString().contains(AlphabetSamples.SIMPLE_WORDS.get(i))) {
                    keyIsNotFound = false;
                    originalKey = key;
                    FileWriter fw = new FileWriter(filePath,originalKey,stringBuilder.toString());
                    fw.writeBfFile();
                    break;


                }
            }
            key++;
        }
    }
}





