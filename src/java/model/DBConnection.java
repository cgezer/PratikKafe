/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author SMSNG
 */
public class DBConnection {
    private Connection connection;
    
    
    public Connection connec(){
        try{
       Class.forName("com.mysql.cj.jdbc.Driver");
        connection=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/kafedb","root", "123");
      
    }  catch(Exception e){
            System.out.println("Failed to get connection");
            e.printStackTrace();
        }
      return this.connection;
}
}
