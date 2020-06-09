/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author SMSNG
 */
public abstract class DBConnection {
    private Connection connection;    
    
    public Connection connec() throws SQLException{
       if(this.connection==null || this.connection.isClosed()){
        try{
       Class.forName("com.mysql.cj.jdbc.Driver");
        connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/kafedb","root", "123");
      
    }  catch(Exception e){
            System.out.println("Failed to get connection");
            e.printStackTrace();
        }
       }
      return this.connection;
}
}
