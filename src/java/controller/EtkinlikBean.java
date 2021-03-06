/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.EtkinlikDAO;
import entity.etkinlik;
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
public class EtkinlikBean implements Serializable {

   private EtkinlikDAO dao;
   private etkinlik entity;

   public EtkinlikBean () {
   }

   public String create () {
      this.getDao ().create (entity);
   this.entity = new etkinlik ();
      return "/etkinlik/list";
   }

   public List<etkinlik> getRead () {
      return this.getDao().read ();
   }

   public String updateForm (etkinlik c) {
      this.entity = c;
      return "/etkinlik/update";
   }

   public String update () {
      this.getDao ().upDate (entity);
   this.entity = new etkinlik ();
      return "/etkinlik/list";

   }

   public void delete (etkinlik c) {
      this.getDao ().delete (c);

   }

   public EtkinlikDAO getDao () {
      if (this.dao == null) {
         this.dao = new EtkinlikDAO ();
      }
      return dao;
   }

   public void setDao (EtkinlikDAO dao) {
      this.dao = dao;
   }

   public etkinlik getEntity () {
      if (this.entity == null) {
         this.entity = new etkinlik ();
      }
      return entity;
   }

   public void setEntity (etkinlik entity) {
      this.entity = entity;
   }

}
