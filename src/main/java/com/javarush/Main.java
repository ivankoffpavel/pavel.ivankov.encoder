package com.javarush;

import com.javarush.brute_force.BruteForce;
import com.javarush.cesarcipher.CesarCipher;
import com.javarush.cli.CLI;
import com.javarush.io.FileReader;
import com.javarush.io.FileWriter;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        final int threeArgs = 3;
        final int twoArgs = 2;
        CLI cli = new CLI();
        if (args.length == threeArgs) {
            String command = args[0];
            String filePath = args[1];
            int key = Integer.parseInt(args[2]);
            switch (command) {
                case "encrypt":
                    FileWriter fileWriter = new FileWriter(filePath);
                    FileReader fileReader = new FileReader(filePath);
                    CesarCipher cesarCipher = new CesarCipher();
                    fileWriter.writeFile(cesarCipher.сesarEncryptorEnglish(fileReader.readFile(), key).toString());
                    break;

                case "decrypt":
                    Path pathFile = Paths.get(filePath);
                    if (Files.exists(pathFile)) {
                        FileReader fileReader1 = new FileReader(filePath);
                        CesarCipher cesarCipher1 = new CesarCipher();
                        FileWriter fileWriter1 = new FileWriter(filePath);
                        fileWriter1.writeFile(cesarCipher1.сesarDecryptorEnglish(fileReader1.readFile(), key).toString());
                    } else {
                        System.out.println("Entered file doesn't exist!");
                    }
                    break;

                default:
                    System.out.println("Your command was entered incorrect!");
                    System.out.println("Pay attention and try again...");
            }
        } else if (args.length == twoArgs) {
            String command = args[0];
            String filePath = args[1];
            if (command.equalsIgnoreCase("brute_force")) {
                FileReader fileReader2 = new FileReader(filePath);
                String encryptedText = fileReader2.readFile();
                BruteForce bruteForce = new BruteForce(encryptedText, filePath);
                bruteForce.brutForce();


            } else {
                System.out.println("The first argument was entered incorrecrtly!");
            }

        } else {
            cli.InputUser();
            switch (cli.getCommand().toLowerCase()) {
                case "encrypt":
                    FileWriter fileWriter = new FileWriter(cli.getFilePath());
                    FileReader fileReader = new FileReader(cli.getFilePath());
                    CesarCipher cesarCipher = new CesarCipher();
                    fileWriter.writeFile(cesarCipher.сesarEncryptorEnglish(fileReader.readFile(), cli.getKey()).toString());
                    break;

                case "decrypt":
                    Path pathFile = Paths.get(cli.getFilePath());
                    if (Files.exists(pathFile)) {
                        FileReader fileReader1 = new FileReader(cli.getFilePath());
                        CesarCipher cesarCipher1 = new CesarCipher();
                        FileWriter fileWriter1 = new FileWriter(cli.getFilePath());
                        fileWriter1.writeFile(cesarCipher1.сesarDecryptorEnglish(fileReader1.readFile(), cli.getKey()).toString());
                    } else {
                        System.out.println("Entered file doesn't exist!");
                    }
                    break;

                case "brute_force":
                    FileReader fileReader2 = new FileReader(cli.getFilePath());
                    String encryptedText = fileReader2.readFile();
                    BruteForce bruteForce = new BruteForce(encryptedText, cli.getFilePath());
                    bruteForce.brutForce();
                    break;

                default:
                    System.out.println("Your command was entered incorrect!");
                    System.out.println("Pay attention and try again...");
            }
        }
    }
}
