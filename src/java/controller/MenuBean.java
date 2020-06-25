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

   public void create () {
      this.getDao ().create (this.entity);
      this.entity = new menu ();
   }

   public List<menu> getRead () {
      return this.getDao ().read ();
   }

   public void clearForm () {
      this.entity = new menu ();
   }

   public void updateForm (menu c) {
      this.entity = c;
   }

   public void update () {
      this.getDao ().upDate (this.entity);
      this.entity = new menu ();
   }

   public void deleteConfirm (menu c) {
      this.entity = c;
   }

   public void delete () {
      this.getDao ().delete (this.entity);
      this.entity = new menu ();
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
