/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.kullanici;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

/**
 *
 * @author SMSNG Celal Gezer
 */
public class KullaniciDAO extends DBConnection {
  
    public kullanici getById(int id){
      kullanici k=null;      
      try{
         Statement st= this.connec ().createStatement ();
         ResultSet rs=st.executeQuery ("select * from kullanici where kullanici_id="+id);
         rs.next ();
         
         k=new kullanici(rs.getInt ("kullanici_id"),rs.getString ("ad") ,rs.getString ("soyad"),  rs.getString ("adres"), rs.getInt ("kredi_kart_no"),rs.getInt ("telefon_no"));
         
      }catch(Exception e){
         System.out.println (e.getMessage ());
      }
      return k;
   }
  
   
   
   public void create(kullanici c){
      try{
         Statement st=this.connec ().createStatement ();
         st.executeUpdate ("insert into kullanici(ad,soyad,adres,kredi_kart_no,telefon_no) values('"+c.getAd ()+"','"+c.getSoyad ()+"','"+c.getAdres ()+"','"+c.getKredi_kart_no ()+"','"+c.getTelefon_no ()+"')");
      } catch(Exception e){
         System.out.println (e.getMessage ());
   }
   }
       public List <kullanici> read(){
          List<kullanici> list= new ArrayList<>();
      try{
         Statement st=this.connec ().createStatement ();
         ResultSet rs=st.executeQuery ("select * from kullanici order by kullanici_id asc");
         
         while(rs.next ()){
            kullanici tmp= new kullanici(rs.getInt ("kullanici_id"),rs.getString ("ad") ,rs.getString ("soyad"),  rs.getString ("adres"), rs.getInt ("kredi_kart_no"),rs.getInt ("telefon_no"));
            list.add (tmp);            
         }
      } catch(Exception e){
         System.out.println (e.getMessage ());
   }
      return list;
       }
       public void upDate(kullanici c){
      try{
         Statement st=this.connec ().createStatement ();
         st.executeUpdate ("update kullanici set ad='"+c.getAd ()+"', soyad='"+c.getSoyad ()+"', adres='"+c.getAdres ()+"', kredi_kart_no='"+c.getKredi_kart_no ()+"',telefon_no='"+c.getTelefon_no ()+"' where kullanici_id ="+c.getKullanici_id ());
      } catch(Exception e){
         System.out.println (e.getMessage ());
   }
       }
       public void delete(kullanici c){
      try{
         Statement st=this.connec ().createStatement ();
         st.executeUpdate ("delete from kullanici where kullanici_id="+c.getKullanici_id ());
      } catch(Exception e){
         System.out.println (e.getMessage ());
   }
      
       }

}
   