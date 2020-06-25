/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.siparis;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

/**
 *
 * @author SMSNG Celal Gezer
 */


public class SiparisDAO extends DBConnection {
    
   
   public void create(siparis c){
      try{
         Statement st=this.connec ().createStatement ();
         st.executeUpdate ("insert into siparis(konum,tutar,saat,tarih,sure,tipi,musteri_id) values"+ "('"+c.getKonum ()+"','"+c.getTutar ()+"','"+c.getSaat ()+"','"+c.getTarih ()+"','"+c.getSure ()+"','"+c.getTipi ()+"','"+c.getMusteri_id ()+"')");
      } catch(Exception e){
         System.out.println (e.getMessage ());
   }
   }
       public List <siparis> read(){
          List<siparis> list= new ArrayList<>();
      try{
         Statement st=this.connec ().createStatement ();
         ResultSet rs=st.executeQuery ("select * from siparis order by siparis_id asc");
         
         while(rs.next ()){
            siparis tmp= new siparis(rs.getInt ("siparis_id"),rs.getString ("konum") ,rs.getInt ("tutar"),  rs.getString ("saat"), rs.getString ("tarih"),rs.getInt ("sure"),rs.getString ("tipi"),rs.getInt ("musteri_id"));
            list.add (tmp);            
         }
      } catch(Exception e){
         System.out.println (e.getMessage ());
   }
      return list;
       }
       public void upDate(siparis c){
      try{
         Statement st=this.connec ().createStatement ();
         st.executeUpdate ("update siparis set  konum='"+c.getKonum ()+"', tutar='"+c.getTutar ()+"', saat='"+c.getSaat ()+"', tarih='"+c.getTarih ()+"',sure='"+c.getSure ()+"',tipi='"+c.getTipi ()+"',musteri_id='"+c.getMusteri_id ()+"' where siparis_id ="+c.getSiparis_id ());
      } catch(Exception e){
         System.out.println (e.getMessage ());
   }
       }
       public void delete(siparis c){
      try{
         Statement st=this.connec ().createStatement ();
         st.executeUpdate ("delete from siparis where siparis_id="+c.getSiparis_id ());
      } catch(Exception e){
         System.out.println (e.getMessage ());
   }
      
       }

}
   