/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import dao.KullaniciDAO;
import entity.kullanici;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author SMSNG
 */
@FacesConverter(value="kulConverter")
public class KullaniciConverter implements Converter {

   private KullaniciDAO kulDAO;

   public KullaniciDAO getKulDAO () {
      if(this.kulDAO==null){
         this.kulDAO=new KullaniciDAO ();
      }
      return kulDAO;
   }

   public void setKulDAO (KullaniciDAO kulDAO) {
      this.kulDAO = kulDAO;
   }
 
   @Override
   public Object getAsObject (FacesContext context , UIComponent component , String value) {
      System.out.println ("-----------getAsObject Metod-----------");
      return this.getKulDAO ().getById (Integer.valueOf (value));
   }

   @Override
   public String getAsString (FacesContext fc , UIComponent uic , Object t) {
       System.out.println ("-----------getAsString Metod-----------");
      kullanici  k = (kullanici)t;
     
      return String.valueOf (k.getKullanici_id ());
   }   
  
   
}
