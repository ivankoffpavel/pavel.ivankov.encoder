package com.javarush;

import com.javarush.cesarcipher.CesarCipher;

public class Main {
    public static void main(String[] args) {
        String text = "HI mon I am fine!";
        int key = 5;
        CesarCipher cesarCipher = new CesarCipher();
        System.out.println(cesarCipher.CesarEncryptor(text,key));
        String Encrypted = cesarCipher.CesarEncryptor(text,key).toString();
        System.out.println(cesarCipher.CesarDecryptor(Encrypted,key));


    }
}