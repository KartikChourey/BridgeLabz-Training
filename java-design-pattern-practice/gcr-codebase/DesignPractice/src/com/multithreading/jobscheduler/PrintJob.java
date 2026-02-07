package com.multithreading.jobscheduler;

class PrintJob implements Runnable {
    String name;
    int pages;

    PrintJob(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public void run() {
        for (int i = 1; i <= pages; i++) {
            System.out.println(Thread.currentThread().getName() +
                    " Printing " + name + " - Page " + i + " of " + pages);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

