package com.walking.intensive.chapter5.task22;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SimpleFileReader {

    String readFile(String readPath) {
        try {
            byte[] data = Files.readAllBytes(Path.of(readPath));
            return new String(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}