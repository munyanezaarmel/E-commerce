/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cn.armel.booking.connection;

/**
 *
 * @author armelmunyaneza
 * 
 */
import java.sql.*;
import java.sql.SQLException;
public class ConnectionDB {
    public static Connection getCon() throws ClassNotFoundException,SQLException{     
 Class.forName("com.mysql.cj.jdbc.Driver");
 return DriverManager.getConnection("jdbc:mysql://localhost:3306/booking","root","");
}
}
