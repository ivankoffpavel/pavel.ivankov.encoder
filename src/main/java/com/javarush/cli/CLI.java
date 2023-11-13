package com.javarush.cli;

import java.util.Scanner;

public class CLI {
    public   String command;
    public String filePath;
    public int key;

    public void InputUser() {

        System.out.println("Any arguments were entered from keyboard...");
        System.out.println("Please enter a command [ENCRYPTED]/[DECRYPTED]/[BRUTE_FORCE]:");
        Scanner scanner = new Scanner(System.in);
        this.command = scanner.nextLine();
        System.out.println("Please enter a source/dest filepath: ");
        filePath = scanner.nextLine();
        System.out.println("Please enter a key:");
        key = scanner.nextInt();
        System.out.println(command);
        System.out.println(filePath);
        System.out.println(key);
    }
}
