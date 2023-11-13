package com.javarush;

import com.javarush.cli.CLI;
import com.javarush.runner.Runner;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner();
        CLI cli = new CLI();
        if (args.length == 2 || args.length == 3) {
            String command = args[0];
            String filePath = args[1];
            int key = Integer.parseInt(args[3]);
            runner.run();
        } else {
            cli.InputUser();
            runner.run();

        }

        System.out.println(Arrays.toString(args));
    }
}