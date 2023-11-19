package com.javarush.io;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriter {
    private String filePath;
    private int key;
    private String encyptedText;

    public FileWriter(String filePath) {
        this.filePath = filePath;
    }

    public FileWriter(String filePath, int key, String encyptedText) {
        this.filePath = filePath;
        this.key = key;
        this.encyptedText = encyptedText;
    }

    public String getFilePath() {
        return filePath;
    }

    public void writeFile(String encryptedText) {
        if (filePath.contains("[ENCRYPTED]")) {
            String newFilePath = filePath.substring(0,filePath.lastIndexOf("[ENCRYPTED]"));
            try (OutputStream fos = Files.newOutputStream(Paths.get(newFilePath + "[DECRYPTED]"))) {
                byte[] bytes = encryptedText.getBytes();
                fos.write(bytes);
                System.out.println("Resultfile - "+ newFilePath + "[DECRYPTED]");
            } catch (IOException ex) {
                System.out.println("Oops! " + ex.getMessage());
            }

        } else {
            try (OutputStream fos = Files.newOutputStream(Paths.get(filePath.substring(0, filePath.length() - 4) + "[ENCRYPTED]" + ".txt"))) {
                byte[] bytes = encryptedText.getBytes();
                fos.write(bytes);
                System.out.println("Resultfile - "+ filePath.substring(0, filePath.length() - 4) + "[ENCRYPTED]" + ".txt");
            } catch (IOException ex) {
                System.out.println("Oops! " + ex.getMessage());
            }
        }
    }

    public void writeBfFile() {
        if (filePath.contains(" [ENCRYPTED]")) {
            String[] filePathArray = filePath.split(" ");
            String newFilePath = filePathArray[0];
            try (OutputStream fos = Files.newOutputStream(Paths.get(newFilePath + " (B key - " + key + ")"))) {
                byte[] bytes = encyptedText.getBytes();
                fos.write(bytes);
                System.out.println("Brute force decrypted file path - "+newFilePath + " (B key - " + key + ")");
            } catch (IOException ex) {
                System.out.println("Oops! " + ex.getMessage());
            }

        } else {
            try (OutputStream fos = Files.newOutputStream(Paths.get(filePath.substring(0, filePath.length() - 4) + " (B key - " + key + ")"+".txt"))) {
                byte[] bytes = encyptedText.getBytes();
                fos.write(bytes);
                System.out.println("Brute force decrypted file path - "+filePath.substring(0, filePath.length() - 4) + " (B key - " + key + ")"+".txt");
            } catch (IOException ex) {
                System.out.println("Oops! " + ex.getMessage());
            }
        }
    }
}
