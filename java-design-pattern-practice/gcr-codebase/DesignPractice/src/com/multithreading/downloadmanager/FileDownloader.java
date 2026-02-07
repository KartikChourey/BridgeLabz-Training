package com.multithreading.downloadmanager;

import java.util.Random;

class FileDownloaderThread extends Thread {
    private String fileName;
    private Random random = new Random();

    FileDownloaderThread(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        for (int i = 0; i <= 100; i += 25) {
            System.out.println("[" + getName() + "] Downloading " + fileName + ": " + i + "%");
            try {
                Thread.sleep(300 + random.nextInt(500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}