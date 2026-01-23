package com.javastreams;

import java.io.*;

public class Buffered {

    public static void main(String[] args) throws Exception {

        String src = "bigfile.dat";
        String normalCopy = "normalCopy.dat";
        String bufferedCopy = "bufferedCopy.dat";

        // Measuring time for normal stream copy
        long startNormal = System.nanoTime();

        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(normalCopy);

   
        byte[] buffer = new byte[4096];
        int bytesRead;

       
        while ((bytesRead = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }

        fis.close();
        fos.close();

        long endNormal = System.nanoTime();

        // Measuring time for buffered stream copy
        long startBuffered = System.nanoTime();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(bufferedCopy));

      
        while ((bytesRead = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, bytesRead);
        }

        bis.close();
        bos.close();

        long endBuffered = System.nanoTime();

        System.out.println("Normal Stream Time  : " + (endNormal - startNormal));
        System.out.println("Buffered Stream Time: " + (endBuffered - startBuffered));
    }
}
