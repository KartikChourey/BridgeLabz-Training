package com.searchingalgorithms.stringbuffer;

public class Comparison{

    public static void main(String[] args) {

        int count = 1_000_000;

        // StringBuilder test
        long startSB = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append("hello");
        }
        long endSB = System.nanoTime();

        // StringBuffer test
        long startSBF = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            sbf.append("hello");
        }
        long endSBF = System.nanoTime();

        System.out.println("StringBuilder Time: " + (endSB - startSB));
        System.out.println("StringBuffer Time : " + (endSBF - startSBF));
    }
}
