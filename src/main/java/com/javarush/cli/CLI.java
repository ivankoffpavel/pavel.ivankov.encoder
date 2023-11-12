package com.javarush.cli;

import java.util.Scanner;

public class CLI {
    public void InputUser(){
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String filePath = scanner.nextLine();
        int key = scanner.nextInt();
    }
}
