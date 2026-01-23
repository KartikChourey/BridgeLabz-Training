package com.javastreams;

import java.io.*;

public class ImageByte {

    public static void main(String[] args) throws Exception {

        // Reading image file
        FileInputStream fis = new FileInputStream("image.jpg");

        // Converting file data into byte array
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        int data;
        while ((data = fis.read()) != -1) {
            baos.write(data);
        }

  
        byte[] imageBytes = baos.toByteArray();


        ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
        FileOutputStream fos = new FileOutputStream("newImage.jpg");

        while ((data = bais.read()) != -1) {
            fos.write(data);
        }

        fis.close();
        fos.close();

        System.out.println("Image copied using ByteArray streams.");
    }
}
