package com.javarush;

public class CesarCipher {


    public StringBuilder сesarEncryptorEnglish(String inputText, int key) {
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

    public StringBuilder сesarDecryptorEnglish(String inputText, int key) {
        char[] inputTextCharArrayArray = inputText.toCharArray();
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < inputTextCharArrayArray.length; i++) {
            if (AlphabetSamples.EN_ALPHABET.contains(inputTextCharArrayArray[i])) {
                int currentIndexChar = AlphabetSamples.EN_ALPHABET.indexOf(inputTextCharArrayArray[i]);
                int currentIndexCharMinusKey = currentIndexChar - key >= 0 ? currentIndexChar - key : AlphabetSamples.EN_ALPHABET.size() + (currentIndexChar - key);
                decryptedText.append(AlphabetSamples.EN_ALPHABET.get(currentIndexCharMinusKey));
            } else {
                decryptedText.append(inputTextCharArrayArray[i]);
            }
        }

        return decryptedText;


    }
}
