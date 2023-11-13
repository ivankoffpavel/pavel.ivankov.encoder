package com.javarush;

import com.javarush.cesarcipher.CesarCipher;
import com.javarush.cli.CLI;
import com.javarush.io.FileReader;
import com.javarush.io.FileWriter;

public class Main {

    public static void main(String[] args) {
        CLI cli = new CLI();
        if (args.length == 2 || args.length == 3) {
            String command = args[0];
            String filePath = args[1];
            int key = Integer.parseInt(args[2]);
            System.out.println(command);
            System.out.println(filePath);

        } else {
            cli.InputUser();
        }
        switch (cli.getCommand().toLowerCase()) {
            case "encrypt":
                FileReader fileReader = new FileReader(cli.getFilePath());
                CesarCipher cesarCipher = new CesarCipher();
                String cesarCipherMethodResult = cesarCipher.CesarDecryptorEnglish(fileReader.readFile(), cli.getKey()).toString();
                FileWriter fileWriter = new FileWriter(cli.getFilePath());
                fileWriter.writeFile(cesarCipherMethodResult);
                break;
            case "decrypt":
                System.out.println("DecryptMethod is working...");
                break;
            case "brute_force":
                System.out.println("Brute force is working...");
            default:
                System.out.println("Your command was entered incorrect!");
                System.out.println("Pay attention and try again...");
        }
    }
}
