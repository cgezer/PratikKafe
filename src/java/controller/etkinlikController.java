/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.etkinlik;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.DBConnection;

/**
 *
 * @author SMSNG
 */
public class etkinlikController {
     private DBConnection db;
    
    public void insert(etkinlik et){
       try{
           Statement st= this.getDb ().connec ().createStatement ();
           st.executeUpdate ("insert into etkinlik (ad,fiyat,kapasite)  "
                   + "values ('"+et.getAd ()+"','"+et.getFiyat ()+"','"+et.getKapasite ()+"')");
       }catch(Exception e){
           System.out.println (e.getMessage ());
       }
    }
    
    
    
    public List<etkinlik> getList(){
    List<etkinlik> etList= new ArrayList<>();
    try{
           Statement st= this.getDb ().connec ().createStatement ();
          ResultSet rs=st.executeQuery ("select * from etkinlik ");
          while(rs.next ()){
              etkinlik tmp=new etkinlik (rs.getInt("id"), rs.getString ("ad"),rs.getInt ("fiyat"),rs.getInt ("kapasite"));
              etList.add (tmp);
          }
       }catch(Exception e){
           System.out.println (e.getMessage ());
       }
    return etList;
    }

    public DBConnection getDb () {
        if(this.db== null){
            this.db=new DBConnection();
        }
        return db;
    }

    public void setDb (DBConnection db) {
        this.db = db;
    }
    
}
