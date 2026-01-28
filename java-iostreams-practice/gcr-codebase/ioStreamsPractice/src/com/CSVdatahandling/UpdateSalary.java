package com.CSVdatahandling;

import java.io.*;

public class UpdateSalary {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("updated_employees.csv"));


        bw.write(br.readLine());
        bw.newLine();

        String line;
        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

           
            if (data[2].equals("IT")) {
                int salary = Integer.parseInt(data[3]);
                salary += salary * 0.10;
                data[3] = String.valueOf(salary);
            }

            bw.write(String.join(",", data));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
