/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.MenuDAO;
import entity.menu;
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
public class MenuBean implements Serializable {

   private MenuDAO dao;
   private menu entity;

   public MenuBean () {
   }

   public String create () {
      this.getDao ().create (entity);
    this.entity = new menu ();
      return "/menu/list";
   }

   public List<menu> getRead () {
      return this.getDao().read ();
   }

   public String updateForm (menu c) {
      this.entity = c;
      return "/menu/update";
   }

   public String update () {
      this.getDao ().upDate (entity);
     this.entity = new menu ();
      return "/menu/list";

   }

   public void delete (menu c) {
      this.getDao ().delete (c);

   }

   public MenuDAO getDao () {
      if (this.dao == null) {
         this.dao = new MenuDAO ();
      }
      return dao;
   }

   public void setDao (MenuDAO dao) {
      this.dao = dao;
   }

   public menu getEntity () {
      if (this.entity == null) {
         this.entity = new menu ();
      }
      return entity;
   }

   public void setEntity (menu entity) {
      this.entity = entity;
   }

}
