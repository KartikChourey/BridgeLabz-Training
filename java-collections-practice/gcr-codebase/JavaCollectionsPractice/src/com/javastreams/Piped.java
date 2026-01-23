package com.javastreams;

import java.io.*;

public class Piped {

    public static void main(String[] args) throws Exception {

       
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);

        // Writer thread
        Thread writer = new Thread(() -> {
            try {
                pos.write("Hello from Writer Thread".getBytes());
                pos.close();
            } catch (IOException e) {}
        });

        // Reader thread
        Thread reader = new Thread(() -> {
            try {
                int ch;
                while ((ch = pis.read()) != -1) {
                    System.out.print((char) ch);
                }
                pis.close();
            } catch (IOException e) {}
        });

        writer.start();
        reader.start();
    }
}
