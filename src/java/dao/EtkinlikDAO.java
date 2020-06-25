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
         st.executeUpdate ("insert into etkinlik(ad,fiyat,kapasite) values('"+c.getAd ()+"','"+c.getFiyat ()+"','"+c.getKapasite ()+"')");
      } catch(Exception e){
         System.out.println (e.getMessage ());
   }
   }
       public List <etkinlik> read(){
          List<etkinlik> list= new ArrayList<>();
      try{
         Statement st=this.connec ().createStatement ();
         ResultSet rs=st.executeQuery ("select * from etkinlik order by etkinlik_id asc");
         
         while(rs.next ()){
            etkinlik tmp= new etkinlik(rs.getInt ("etkinlik_id"),rs.getString ("ad") ,rs.getInt ("fiyat"),rs.getInt ("kapasite"));
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
         st.executeUpdate ("update etkinlik set ad='"+c.getAd ()+"', fiyat='"+c.getFiyat ()+"', kapasite='"+c.getKapasite ()+"' where etkinlik_id="+c.getEtkinlik_id ());
      } catch(Exception e){
         System.out.println (e.getMessage ());
   }
       }
       public void delete(etkinlik c){
      try{
         Statement st=this.connec ().createStatement ();
         st.executeUpdate ("delete from etkinlik where etkinlik_id="+c.getEtkinlik_id ());
      } catch(Exception e){
         System.out.println (e.getMessage ());
   }
      
       }

}
   