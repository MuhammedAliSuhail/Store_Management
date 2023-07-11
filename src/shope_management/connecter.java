/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shope_management;

import java.sql.*;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class connecter {
    public Statement getconnect(){
     try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","Suhail@123");
            Statement st=con.createStatement();
            return st;
        }catch(Exception e){ 
         JOptionPane.showMessageDialog(null, e.toString());
         return null;
        }
    }
}
