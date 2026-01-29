package com.JSONdata.handsonpracticeproblems;

import org.json.JSONArray;
import org.json.JSONObject;
import java.sql.*;

public class DbTojson {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "password");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT id, name FROM users");

        JSONArray arr = new JSONArray();

        while(rs.next()) {
            JSONObject obj = new JSONObject();
            obj.put("id", rs.getInt("id"));
            obj.put("name", rs.getString("name"));
            arr.put(obj);
        }

        System.out.println(arr.toString(2));
        con.close();
    }
}
