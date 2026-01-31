package com.functionalinterface;
import java.io.Serializable;

class BackupData implements Serializable {
    String data = "Backup Info";
}

public class Backup{
    public static void main(String[] args) {

        BackupData bd = new BackupData();
        System.out.println(bd.data);
    }
}
