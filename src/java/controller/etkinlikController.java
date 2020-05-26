/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.etkinlik;
<<<<<<< HEAD
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import model.etkinlikModel;

/**
 *
 * @author SMSNG CelalGezer
 */
@Named
@SessionScoped
public class etkinlikController implements Serializable {
private   int id ;
private   String ad ;
private   int fiyat ;
private   int kapasite ;

    private etkinlikModel Model;


    public void creat () {
        etkinlik e = new etkinlik (this.id ,this.ad , this.fiyat , this.kapasite);
        this.getModel().insert (e);

    }

    public List<etkinlik> getList () {
        return this.getModel().getList ();
    }

    public etkinlikModel getModel () {
        if (this.Model == null) {
            this.Model = new etkinlikModel ();
        }
        return Model;
    }

    public void setEtkModel (etkinlikModel etkModel) {
        this.Model = etkModel;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getAd () {
        return ad;
    }

    public void setAd (String ad) {
        this.ad = ad;
    }

    public int getFiyat () {
        return fiyat;
    }

    public void setFiyat (int fiyat) {
        this.fiyat = fiyat;
    }

    public int getKapasite () {
        return kapasite;
    }

    public void setKapasite (int kapasite) {
        this.kapasite = kapasite;
    }

=======

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
>>>>>>> origin/cgezer
    
}
