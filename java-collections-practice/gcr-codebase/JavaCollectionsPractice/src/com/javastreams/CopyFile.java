package com.javastreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

    public static void main(String[] args) {

    
        String source = "input.txt";

    
        String destination = "output.txt";

        try {
            // Opening source file in read mode
            FileInputStream fis = new FileInputStream(source);

            // Creating destination file (if not exists)
            FileOutputStream fos = new FileOutputStream(destination);

            int data;

            while ((data = fis.read()) != -1) {
             
                fos.write(data);
            }

            System.out.println("File copied successfully.");

          
            fis.close();
            fos.close();

        } catch (IOException e) {
            System.out.println("Source file not found or error while copying.");
        }
    }
}
