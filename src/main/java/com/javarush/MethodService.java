package com.javarush;

import com.javarush.brute_force.BruteForce;
import com.javarush.cesarcipher.CesarCipher;
import com.javarush.io.FileReader;
import com.javarush.io.FileWriter;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MethodService {
    void twoArgsInputMethod(String filePath) {
        FileReader fileReader2 = new FileReader(filePath);
        String encryptedText = fileReader2.readFile();
        BruteForce bruteForce = new BruteForce(encryptedText,filePath);
        bruteForce.brutForce();

    }

    void threeArgsInputMethod(String command, String filePath, int key) {
        switch (command) {
            case "encrypt":
                FileWriter fileWriter = new FileWriter(filePath);
                FileReader fileReader = new FileReader(filePath);
                CesarCipher cesarCipher = new CesarCipher();
                Object cesarCipherEncryptObj = cesarCipher.сesarEncryptorEnglish(fileReader.readFile(), key);
                fileWriter.writeFile(cesarCipherEncryptObj.toString());
                break;

            case "decrypt":
                Path pathFile = Paths.get(filePath);
                if (Files.exists(pathFile)) {
                    FileReader fileReader1 = new FileReader(filePath);
                    CesarCipher cesarCipher1 = new CesarCipher();
                    FileWriter fileWriter1 = new FileWriter(filePath);
                    Object cesarCipherDecryptObj = cesarCipher1.сesarDecryptorEnglish(fileReader1.readFile(), key);
                    fileWriter1.writeFile(cesarCipherDecryptObj.toString());
                } else {
                    System.out.println("Entered file doesn't exist!");
                }
                break;

            case "brute_force":
                FileReader fileReader2 = new FileReader(filePath);
                String encryptedText = fileReader2.readFile();
                BruteForce bruteForce = new BruteForce(encryptedText, filePath);
                bruteForce.brutForce();
                break;

            default:
                System.out.println("Your command was entered incorrect!");
                System.out.println("Pay attention and try again...");
        }
    }
}




