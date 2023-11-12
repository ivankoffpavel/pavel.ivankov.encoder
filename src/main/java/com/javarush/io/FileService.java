package com.javarush.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileService {
    private String filePath;


    public FileService(String filePath) {
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

    public void writeFile(String encryptedText) {
        try (OutputStream fos = Files.newOutputStream(Paths.get(filePath + " [ENCRYPTED]"))) {
            byte[] bytes = encryptedText.getBytes();
            fos.write(bytes);
        } catch (IOException ex) {
            System.out.println("Oops! " + ex.getMessage());

        }
    }
}


