package com.edu16io;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class TestFileInput {
    public static void main(String[] args) {
        byte[] r = new byte[1000];
        String fileName = "c:/Tools/1/test.txt";
        FileInputStream inFile;
        try {
            inFile = new FileInputStream(fileName);
            System.out.println("Input file was opened.");
            int bytesAv = inFile.available(); // Bytes count
            System.out.println("Bytes count: " + bytesAv + " Bytes");
            int count = inFile.read(r, 0, bytesAv);
            System.out.println("Was readed: " + count + " bytes.");
            System.out.println(r[0] + " " + r[1] + " " + r[2]);
            System.out.println((char) r[0] + " " + (char) r[1] + " " + (char) r[2]);
            inFile.close();
            System.out.println("Input stream was closed.");
            //
            for (int i = 0; i < bytesAv; i++) {
                System.out.println("r[" + i + "] = " + r[i] + "  r[" + i + "] as char = " + (char) r[i]);
            }

        } catch (IOException e) {
            System.out.println("File Read/Write Error: " + fileName);
        }
        System.out.println("Array: " + Arrays.toString(r));
    }
}
