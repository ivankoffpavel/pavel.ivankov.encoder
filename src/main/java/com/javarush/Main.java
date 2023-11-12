package com.javarush;

import com.javarush.cesarcipher.CesarCipher;
import com.javarush.io.FileService;

public class Main {
    public static void main(String[] args) {
        if(args.length == 2 || args.length == 3){
            String command = args[0];
            String filePath = args[1];
            int key = Integer.parseInt(args[3]);
        }else {

        }
        String text = "HI mon I am fine*";
        int key = 5;
        FileService fileService = new FileService("C:/Java/Greeting");
        String str = fileService.readFile();
        System.out.println(str);
        fileService.writeFile(text);
        CesarCipher cesarCipher = new CesarCipher();
        System.out.println(cesarCipher.CesarEncryptorEnglish(text,key));
        String Encrypted = cesarCipher.CesarEncryptorEnglish(text,key).toString();
        System.out.println(cesarCipher.CesarDecryptorEnglish(Encrypted,key));


    }
}