package com.edu16io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutput {
    public static void main(String[] args) {
        byte[] w = {48, 49, 50};
        String fileName = "c:/Tools/1/test.txt";
        FileOutputStream outFile;
        try {
            File file = new File(fileName);
            boolean flag = file.canWrite();
            System.out.println("flag = " + flag);
            if (!flag) {
                file.setWritable(true);
            }
            //
            outFile = new FileOutputStream(fileName);
            System.out.println("Output file was opened.");
            outFile.write(w);
            System.out.println("Saved: " + w.length + " bytes.");
            outFile.close();
            System.out.println("Output stream was closed.");
        } catch (IOException e) {
            System.out.println("File Write Error: " + fileName);
        }
    }
}
