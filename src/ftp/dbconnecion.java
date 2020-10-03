/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftp;

import java.sql.*;

/**
 *
 * @author Uditk
 */

public class dbconnecion {
private static final String USERNAME="root";
private static final String PASSWORD="Kotecha*01";
private static final String CONN_STRING="jdbc:mysql://localhost:3306/javadb1";
public static void main(String [] args)
{
    Connection conn = null;
    try
    {
        conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
        System.out.println("Database Connected");
        Statement stmt = (Statement) conn.createStatement();
        String fname = "snowhite";
        String insert = "INSERT INTO username (username,password,regno) VALUES ('udit2','1234','20194057');";
        stmt.executeUpdate(insert);
    }
    catch(SQLException e)
    {
       System.err.println(e);
    }

}
}