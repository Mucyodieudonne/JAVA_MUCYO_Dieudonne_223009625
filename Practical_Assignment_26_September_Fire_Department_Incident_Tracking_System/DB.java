/**
=====Group Members(Group number 31)=====
1)MUCYO Dieudonne 223009625
2)NDAGIJIMANA Aloyz 223017789
3)UZABAKIRIHO Theogene 223009518
 **/
package com.FDITS;


import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    public static Connection getConnection() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/fire_db","root","");
    }
}
