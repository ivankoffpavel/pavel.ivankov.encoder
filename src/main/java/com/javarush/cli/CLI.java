package com.javarush.cli;

import java.util.Scanner;

public class CLI {

    public void InputUser(){

        System.out.println("Any arguments were entered from keyboard...");
        System.out.println("Please enter a command [ENCRYPTED]/[DECRYPTED]/[BRUTE_FORCE]:");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        System.out.println("Please enter a source/dest filepath: ");
        String filePath = scanner.nextLine();
        System.out.println("Please enter a key:");
        int key = scanner.nextInt();
    }
}
