package com.javarush;

import java.util.Scanner;

public class Cli {
    private String command;
    private String filePath;
    private int key;

    public void InputUser() {

        System.out.println("Any arguments were entered from keyboard...");
        System.out.println("Please enter a command [ENCRYPT]/[DECRYPT]/[BRUTE_FORCE]:");
        Scanner scanner = new Scanner(System.in);
        command = scanner.nextLine();
        System.out.println("Please enter a source/dest filepath e.g \"C:/Java/test.txt\": ");
        filePath = scanner.nextLine();
        if (!command.equalsIgnoreCase("brute_force")) {
            System.out.println("Please enter a key:");
            key = scanner.nextInt();
        }
    }

    public String getCommand() {
        return command;
    }

    public String getFilePath() {
        return filePath;
    }

    public int getKey() {
        return key;
    }
}

