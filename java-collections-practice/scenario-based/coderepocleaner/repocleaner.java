package coderepocleaner;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class repocleaner{

    public static void main(String[] args) throws IOException {

        // Root folder to scan
        Path root = Paths.get("src");

    
        Pattern methodPattern = Pattern.compile("void\\s+[a-z][a-zA-Z0-9]*\\(");

        // Walk through directory structure
        Files.walk(root)
                .filter(p -> p.toString().endsWith(".java"))
                .forEach(path -> {
                    try {
                        List<String> lines = Files.readAllLines(path);
                        boolean hasWarning = false;

                        for (String line : lines) {
                            if (line.contains("import") && !line.contains(";")) {
                                hasWarning = true;
                            }
                        }

                 
                        if (hasWarning)
                            System.out.println("Warning File: " + path);
                        else
                            System.out.println("Valid File: " + path);

                    } catch (IOException e) {
                        System.out.println("Error reading: " + path);
                    }
                });
    }
}
