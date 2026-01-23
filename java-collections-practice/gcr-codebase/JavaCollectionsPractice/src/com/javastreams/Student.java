package com.javastreams;

import java.io.*;

public class Student {

    public static void main(String[] args) throws Exception {

        // Writing primitive data to binary file
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("student.dat"));
        dos.writeInt(101);
        dos.writeUTF("Kartik");
        dos.writeDouble(8.9);
        dos.close();

       
        DataInputStream dis = new DataInputStream(new FileInputStream("student.dat"));

        System.out.println("Roll No: " + dis.readInt());
        System.out.println("Name   : " + dis.readUTF());
        System.out.println("GPA    : " + dis.readDouble());

        dis.close();
    }
}
