package com.javarush.io;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriter {
    private String filePath;

    public FileWriter(String filePath) {
        this.filePath = filePath;
    }

    public void writeFile(String encryptedText) {
        try (OutputStream fos = Files.newOutputStream(Paths.get(filePath + " [ENCRYPTED]"))) {
            byte[] bytes = encryptedText.getBytes();
            fos.write(bytes);
        } catch (IOException ex) {
            System.out.println("Oops! " + ex.getMessage());

        }
    }
}
