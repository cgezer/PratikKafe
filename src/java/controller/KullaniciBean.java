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
   private kullanici entity;

   public KullaniciBean () {
   }

   public String create () {
      this.getDao ().create (entity);
   this.entity = new kullanici ();
      return "/kullanici/list";
   }

   public List<kullanici> getRead () {
      return this.getDao().read ();
   }

   public String updateForm (kullanici c) {
      this.entity = c;
      return "/kullanici/update";
   }

   public String update () {
      this.getDao ().upDate (entity);
   this.entity = new kullanici ();
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

   public kullanici getEntity () {
      if (this.entity == null) {
         this.entity = new kullanici ();
      }
      return entity;
   }

   public void setEntity (kullanici entity) {
      this.entity = entity;
   }

}
