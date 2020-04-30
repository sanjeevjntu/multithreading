package com.sanjeev.corejava.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class FilesWrite {
    public static void main(String[] args) throws IOException {
        Files.writeString(Path.of("example.txt"), "Some string to be written into a file");
        Files.writeString(Path.of("example1.txt"), "Some string to be written into a file1");
        boolean sameFile = Files.isSameFile(Path.of("./example.txt"), Path.of("./example.txt"));
        boolean sameFile1 = Files.isSameFile(Path.of("example.txt"), Path.of("example1.txt"));

        System.out.println(sameFile);
        System.out.println(sameFile1);
    }
}
