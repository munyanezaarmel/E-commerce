/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cn.armel.booking.admin.model;

/**
 *
 * @author armelmunyaneza
 */
public class Admin  extends Person{
     private int id;
    private String email;
    private String password;
    private String role;

    public Admin() {
    }

    public Admin(int id, String email, String password, String role) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public Admin(int id, String email, String password, String role, String name, String dob, String gender) {
        super(name, dob, gender);
        this.id = id;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public Admin(String email, String password, String role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return super.toString();
    
}
