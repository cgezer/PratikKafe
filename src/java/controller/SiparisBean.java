/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.SiparisDAO;
import entity.siparis;
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

public class SiparisBean implements Serializable {

   private SiparisDAO dao;
   private siparis entity;

   public SiparisBean () {
   }

   public String create () {
      this.getDao ().create (entity);
    this.entity = new siparis ();
      return "/siparis/list";
   }

   public List<siparis> getRead () {
      return this.getDao().read ();
   }

   public String updateForm (siparis c) {
      this.entity = c;
      return "/siparis/update";
   }

   public String update () {
      this.getDao ().upDate (entity);
     this.entity = new siparis ();
      return "/siparis/list";

   }

   public void delete (siparis c) {
      this.getDao ().delete (c);

   }

   public SiparisDAO getDao () {
      if (this.dao == null) {
         this.dao = new SiparisDAO ();
      }
      return dao;
   }

   public void setDao (SiparisDAO dao) {
      this.dao = dao;
   }

   public siparis getEntity () {
      if (this.entity == null) {
         this.entity = new siparis ();
      }
      return entity;
   }

   public void setEntity (siparis entity) {
      this.entity = entity;
   }

}
