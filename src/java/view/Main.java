/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entity.etkinlik;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import controller.etkinlikController;

/**
 *
 * @author SMSNG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
       public static void main (String[] args) throws IOException {
         BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
           etkinlikController etkDAO=new etkinlikController();
         
           while(true){
           System.out.println ("Eklenecek kategorinin adını yazınız");
           String ad=br.readLine ();
             System.out.println ("Eklenecek kategorinin fiyatını yazınız");
           int fiyat=Integer.parseInt (br.readLine ());
             System.out.println ("Eklenecek kapasitesini yazınız");
           int kapasite =Integer.parseInt (br.readLine ());
           
             etkinlik etk=new etkinlik();
          etk.setAd (ad);
          etk.setFiyat (fiyat);
          etk.setKapasite (kapasite);
       
           etkDAO.insert (etk);
         
           for(etkinlik e:etkDAO.getList ()){
               System.out.println ("ID:"+e.getId ()+"    AD:"+e.getAd ()+"               FİYAT:"+e.getFiyat ()+"              KAPASİTE:"+e.getKapasite ());
           }
    }

    }
    
}
