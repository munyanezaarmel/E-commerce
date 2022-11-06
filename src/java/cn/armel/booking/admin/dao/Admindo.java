/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cn.armel.booking.admin.dao;
import cn.armel.booking.admin.model.Admin;
import java.sql.*;

/**
 *
 * @author armelmunyaneza
 */
public class Admindo {
    private Connection con;
    private String query;
    private PreparedStatement pst;
    private ResultSet rs;

    public Admindo(Connection con) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
        this.con = con;
    }
    public Admin loginAdmin(String email,String password){
      Admin admin=null;
              query="select from admin where email=? and password=?";
                return admin;
    }
}
