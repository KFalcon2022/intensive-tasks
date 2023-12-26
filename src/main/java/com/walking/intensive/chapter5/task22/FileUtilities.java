package com.walking.intensive.chapter5.task22;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtilities {

    String readFile(String readPath) {
        byte[] data = new byte[0];

        try {
            data = Files.readAllBytes(Path.of(readPath));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new String(data);
    }

    void writeResult(String writePath, String result) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(writePath))) {
            writer.write(result);
        }
    }
}
