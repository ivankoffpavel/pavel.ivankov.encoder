package com.javarush;

import com.javarush.cli.CLI;

public class Main {
    public static void main(String[] args) {
        final int threeArgs = 3;
        final int twoArgs = 2;
        CLI cli = new CLI();
        MethodService ms = new MethodService();
        if (args.length == threeArgs) {
            String command = args[0];
            String filePath = args[1];
            int key = Integer.parseInt(args[2]);
            ms.threeArgsInputMethod(command, filePath, key);
        } else if (args.length == twoArgs) {
            String command = args[0];
            String filePath = args[1];
            if (command.equalsIgnoreCase("brute_force")) {
                ms.twoArgsInputMethod(filePath);
            } else {
                System.out.println("The first argument was entered incorrecrtly!");
            }

        } else {
            cli.InputUser();
            ms.threeArgsInputMethod(cli.getCommand(), cli.getFilePath(), cli.getKey());
        }
    }
}
