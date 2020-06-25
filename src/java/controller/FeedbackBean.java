/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.FeedbackDAO;
import entity.feedback;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author CelalGezer
 */
@Named
@SessionScoped
public class FeedbackBean implements Serializable {

   private FeedbackDAO dao;
   private feedback entity;
   
   
   public String create () {
      this.getDao ().create (entity);
      this.entity = new feedback ();
      return "/feedback/list";
   }

   public List<feedback> getRead () {
      return this.getDao ().read ();
   }

   public String updateForm (feedback c) {
      this.entity = c;
      return "/feedback/update";
   }

   public String update () {
      this.getDao ().upDate (entity);
      this.entity = new feedback ();
      return "/feedback/list";
   }

   public void delete (feedback c) {
      this.getDao ().delete (c);
   }
   public FeedbackDAO getDao () {
      if (this.dao == null) {
         this.dao = new FeedbackDAO ();
      }
      return dao;
   }

   public void setDao (FeedbackDAO dao) {
      this.dao = dao;
   }

   public feedback getEntity () {
      if (this.entity == null) {
         this.entity = new feedback ();
      }
      return entity;
   }

   public void setEntity (feedback entity) {
      this.entity = entity;
   }

}
