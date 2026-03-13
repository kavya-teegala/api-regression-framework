package com.framework.regressionframework.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBUtils {

    public static void insertResult(String testName,String module,String status,String time){

        try{

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test_framework_db",
                    "root",
                    "Kavya@2006");

            String query="INSERT INTO test_case(test_name,module_name,status,execution_time) VALUES(?,?,?,?)";

            PreparedStatement ps=con.prepareStatement(query);

            ps.setString(1,testName);
            ps.setString(2,module);
            ps.setString(3,status);
            ps.setString(4,time);

            ps.executeUpdate();

            con.close();

        }catch(Exception e){

            e.printStackTrace();
        }
    }
}