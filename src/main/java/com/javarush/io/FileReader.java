package com.javarush.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    private String filePath;


    public FileReader(String filePath) {
        this.filePath = filePath;
    }

    public String readFile() {
        StringBuilder readString = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int i;
            while ((i = fis.read()) != -1) {
                readString.append((char) i);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Oops! " + e.getMessage());
        }
        return readString.toString();
    }
}


