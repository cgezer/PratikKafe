/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import entity.User;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author SMSNG
 */
@Named
@SessionScoped
public class LoginBean implements Serializable{
   private User user;
   
   public String login(){
      
      if(this.user.getUsername ().equals ("celal") && this.user.getPassword ().equals ("123")){
         FacesContext.getCurrentInstance ().getExternalContext ().getSessionMap ().put ("valid_user", this.user);
         return "/template/admin?faces-redirect=true";
      }else{
         FacesContext.getCurrentInstance ().addMessage (null, new FacesMessage("Hatalı bilgi girişi"));
           return "/login";
      }
      
   }

   public User getUser () {
      if(this.user==null)
         this.user=new User ();
      return user;
   }

   public void setUser (User user) {
      this.user = user;
   }
   
}
