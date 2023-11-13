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
        if (filePath.contains(" [ENCRYPTED]")) {
            String[] filePathArray = filePath.split(" ");
            String newFilePath = filePathArray[0];
            try (OutputStream fos = Files.newOutputStream(Paths.get(newFilePath + " [DECRYPTED]"))) {
                byte[] bytes = encryptedText.getBytes();
                fos.write(bytes);
            } catch (IOException ex) {
                System.out.println("Oops! " + ex.getMessage());
            }

        } else {
            try (OutputStream fos = Files.newOutputStream(Paths.get(filePath + " [ENCRYPTED]"))) {
                byte[] bytes = encryptedText.getBytes();
                fos.write(bytes);
            } catch (IOException ex) {
                System.out.println("Oops! " + ex.getMessage());

            }
        }
    }
}
