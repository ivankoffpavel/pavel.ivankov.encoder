package com.javarush;

import com.javarush.cli.CLI;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        if (args.length == 2 || args.length == 3) {
            String command = args[0];
            String filePath = args[1];
            int key = Integer.parseInt(args[3]);
        } else {
            CLI cli = new CLI();
            cli.InputUser();
        }
        System.out.println(Arrays.toString(args));
    }
}