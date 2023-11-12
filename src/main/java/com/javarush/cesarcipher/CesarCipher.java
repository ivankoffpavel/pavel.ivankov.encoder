package com.javarush.cesarcipher;

import com.javarush.constants.AlphabetSamples;

public class CesarCipher {

    public StringBuilder CesarEncryptorEnglish(String inputText, int key) {
        char[] inputTextCharArray = inputText.toCharArray();
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < inputTextCharArray.length; i++) {
            if (AlphabetSamples.EN_ALPHABET.contains(inputTextCharArray[i])) {
                int currentIndexChar = AlphabetSamples.EN_ALPHABET.indexOf(inputTextCharArray[i]);
                encryptedText.append(AlphabetSamples.EN_ALPHABET.get((currentIndexChar + key) % AlphabetSamples.EN_ALPHABET.size()));
            } else {
                encryptedText.append(inputTextCharArray[i]);
            }
        }
        return encryptedText;
    }

    public StringBuilder CesarDecryptorEnglish(String inputText, int key) {
        char[] inputTextCharArrayArray = inputText.toCharArray();
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < inputTextCharArrayArray.length; i++) {
            if (AlphabetSamples.EN_ALPHABET.contains(inputTextCharArrayArray[i])) {
                int currentIndexChar = AlphabetSamples.EN_ALPHABET.indexOf(inputTextCharArrayArray[i]);
                int currentIndexCharMinusKey = currentIndexChar > key ? currentIndexChar - key : AlphabetSamples.EN_ALPHABET.size() - (key - currentIndexChar);
                decryptedText.append(AlphabetSamples.EN_ALPHABET.get(currentIndexCharMinusKey));
            } else {
                decryptedText.append(inputTextCharArrayArray[i]);
            }
        }
        return decryptedText;
    }

    public StringBuilder CesarEncryptorUkrainian(String inputText, int key) {
        char[] inputTextCharArray = inputText.toCharArray();
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < inputTextCharArray.length; i++) {
            if (AlphabetSamples.UA_ALPHABET.contains(inputTextCharArray[i])) {
                int currentIndexChar = AlphabetSamples.UA_ALPHABET.indexOf(inputTextCharArray[i]);
                encryptedText.append(AlphabetSamples.UA_ALPHABET.get((currentIndexChar + key) % AlphabetSamples.EN_ALPHABET.size()));
            } else {
                encryptedText.append(inputTextCharArray[i]);
            }
        }
        return encryptedText;
    }

    public StringBuilder CesarDecryptorUkrainian(String inputText, int key) {
        char[] inputTextCharArrayArray = inputText.toCharArray();
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < inputTextCharArrayArray.length; i++) {
            if (AlphabetSamples.UA_ALPHABET.contains(inputTextCharArrayArray[i])) {
                int currentIndexChar = AlphabetSamples.UA_ALPHABET.indexOf(inputTextCharArrayArray[i]);
                int currentIndexCharMinusKey = currentIndexChar > key ? currentIndexChar - key : AlphabetSamples.EN_ALPHABET.size() - (key - currentIndexChar);
                decryptedText.append(AlphabetSamples.UA_ALPHABET.get(currentIndexCharMinusKey));
            } else {
                decryptedText.append(inputTextCharArrayArray[i]);
            }
        }
        return decryptedText;
    }
}
