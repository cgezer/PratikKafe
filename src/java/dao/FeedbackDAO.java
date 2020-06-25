/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.feedback;
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
public class FeedbackDAO extends DBConnection {

   private KullaniciDAO kDAO;

   public KullaniciDAO getkDAO () {
      if (kDAO == null) {
         this.kDAO = new KullaniciDAO ();
      }
      return kDAO;
   }

   public void setkDAO (KullaniciDAO kDAO) {
      this.kDAO = kDAO;
   }

   public void create (feedback c) {
      try {
         Statement st = this.connec ().createStatement ();
         st.executeUpdate ("insert into feedback(puan,aciklama,kullanici_id) values" + "('" + c.getPuan () + "','" + c.getAciklama () + "','" + c.getKullanici ().getKullanici_id () + "')");
      } catch (Exception e) {
         System.out.println (e.getMessage ());
      }
   }

   public List<feedback> read () {
      List<feedback> list = new ArrayList<> ();
      try {
         Statement st = this.connec ().createStatement ();
         ResultSet rs = st.executeQuery ("select * from feedback order by feedback_id desc limit 0,10");

         while (rs.next ()) {
            kullanici k = this.getkDAO ().getById (rs.getInt ("kullanici_id"));
            feedback tmp = new feedback (rs.getInt ("feedback_id") , rs.getInt ("puan") , rs.getString ("aciklama") , k);
            list.add (tmp);
         }
         st.close ();
         rs.close ();
      } catch (Exception e) {
         System.out.println (e.getMessage ());
      }
      return list;
   }

   public void upDate (feedback c) {
      try {
         Statement st = this.connec ().createStatement ();
         st.executeUpdate ("update feedback set  puan='" + c.getPuan () + "', aciklama='" + c.getAciklama () + "', kullanici_id='" + c.getKullanici ().getKullanici_id () + "' where feedback_id =" + c.getFeedback_id ());
      } catch (Exception e) {
         System.out.println (e.getMessage ());
      }
   }

   public void delete (feedback c) {
      try {
         Statement st = this.connec ().createStatement ();
         st.executeUpdate ("delete from feedback where feedback_id=" + c.getFeedback_id ());
      } catch (Exception e) {
         System.out.println (e.getMessage ());
      }

   }

}
