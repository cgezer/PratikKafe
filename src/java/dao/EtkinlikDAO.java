/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.etkinlik;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

/**
 *
 * @author SMSNG Celal Gezer
 */
public class EtkinlikDAO extends DBConnection {
  
   
   public void create(etkinlik c){
      try{
         Statement st=this.connec ().createStatement ();
         st.executeUpdate ("insert into etkinlik(id,ad,fiyat,kapasite) values('"+c.getId ()+"','"+c.getAd ()+"','"+c.getFiyat ()+"','"+c.getKapasite ()+"')");
      } catch(Exception e){
         System.out.println (e.getMessage ());
   }
   }
       public List <etkinlik> read(){
          List<etkinlik> list= new ArrayList<>();
      try{
         Statement st=this.connec ().createStatement ();
         ResultSet rs=st.executeQuery ("select * from etkinlik order by id asc");
         
         while(rs.next ()){
            etkinlik tmp= new etkinlik(rs.getInt ("id"),rs.getString ("ad") ,rs.getInt ("fiyat"),  rs.getInt ("kapasite"));
            list.add (tmp);            
         }
      } catch(Exception e){
         System.out.println (e.getMessage ());
   }
      return list;
       }
       public void upDate(etkinlik c){
      try{
         Statement st=this.connec ().createStatement ();
         st.executeUpdate ("update etkinlik set id='"+c.getId ()+"' , ad='"+c.getAd ()+"', fiyat='"+c.getFiyat ()+"', kapasite='"+c.getKapasite ()+"' where id ="+c.getId ());
      } catch(Exception e){
         System.out.println (e.getMessage ());
   }
       }
       public void delete(etkinlik c){
      try{
         Statement st=this.connec ().createStatement ();
         st.executeUpdate ("delete from etkinlik where id="+c.getId ());
      } catch(Exception e){
         System.out.println (e.getMessage ());
   }
      
       }

}
   