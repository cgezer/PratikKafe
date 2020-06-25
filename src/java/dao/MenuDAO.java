/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.menu;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

/**
 *
 * @author SMSNG Celal Gezer
 */

public class MenuDAO extends DBConnection {
  
   
   public void create(menu c){
      try{
         Statement st=this.connec ().createStatement ();
         st.executeUpdate ("insert into menu(ad,turu,fiyat,stok_durumu) values('"+c.getAd ()+"','"+c.getTuru ()+"','"+c.getFiyat ()+"','"+c.getStok_durumu ()+"')");
      } catch(Exception e){
         System.out.println (e.getMessage ());
   }
   }
       public List <menu> read(){
          List<menu> list= new ArrayList<>();
      try{
         Statement st=this.connec ().createStatement ();
         ResultSet rs=st.executeQuery ("select * from menu order by menu_id asc");
         
         while(rs.next ()){
            menu tmp= new menu(rs.getInt ("menu_id"),rs.getString ("ad") ,rs.getString ("turu"),  rs.getInt ("fiyat"), rs.getString ("stok_durumu"));
            list.add (tmp);            
         }
      } catch(Exception e){
         System.out.println (e.getMessage ());
   }
      return list;
       }
       public void upDate(menu c){
      try{
         Statement st=this.connec ().createStatement ();
         st.executeUpdate ("update menu set ad='"+c.getAd ()+"', turu='"+c.getTuru ()+"', fiyat='"+c.getFiyat ()+"', stok_durumu='"+c.getStok_durumu ()+"' where menu_id ="+c.getMenu_id ());
      } catch(Exception e){
         System.out.println (e.getMessage ());
   }
       }
       public void delete(menu c){
      try{
         Statement st=this.connec ().createStatement ();
         st.executeUpdate ("delete from menu where menu_id="+c.getMenu_id());
      } catch(Exception e){
         System.out.println (e.getMessage ());
   }
      
       }

}
   