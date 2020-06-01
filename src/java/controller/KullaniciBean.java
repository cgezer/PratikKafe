/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.KullaniciDAO;
import entity.kullanici;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author SMSNG
 */
@Named
@SessionScoped
public class KullaniciBean implements Serializable {

   private KullaniciDAO dao;
   private kullanici enttiy;

   public KullaniciBean () {
   }

   public String create () {
      this.getDao ().create (enttiy);
    this.enttiy = new kullanici ();
      return "/kullanici/list";
   }

   public List<kullanici> getRead () {
      return this.getDao().read ();
   }

   public String updateForm (kullanici c) {
      this.enttiy = c;
      return "/kullanici/update";
   }

   public String update () {
      this.getDao ().upDate (enttiy);
     this.enttiy = new kullanici ();
      return "/kullanici/list";

   }

   public void delete (kullanici c) {
      this.getDao ().delete (c);

   }

   public KullaniciDAO getDao () {
      if (this.dao == null) {
         this.dao = new KullaniciDAO ();
      }
      return dao;
   }

   public void setDao (KullaniciDAO dao) {
      this.dao = dao;
   }

   public kullanici getEnttiy () {
      if (this.enttiy == null) {
         this.enttiy = new kullanici ();
      }
      return enttiy;
   }

   public void setEnttiy (kullanici enttiy) {
      this.enttiy = enttiy;
   }

}
