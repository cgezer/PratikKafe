/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author SMSNG
 */
public class menu {
    private int menu_id;
    private String ad;
    private String turu;
    private int fiyat;
    private String stok_durumu;

   public menu () {
   }

   public menu (int menu_id , String ad , String turu , int fiyat , String stok_durumu) {
      this.menu_id = menu_id;
      this.ad = ad;
      this.turu = turu;
      this.fiyat = fiyat;
      this.stok_durumu = stok_durumu;
   }

   public int getMenu_id () {
      return menu_id;
   }

   public void setMenu_id (int menu_id) {
      this.menu_id = menu_id;
   }

   public String getAd () {
      return ad;
   }

   public void setAd (String ad) {
      this.ad = ad;
   }

   public String getTuru () {
      return turu;
   }

   public void setTuru (String turu) {
      this.turu = turu;
   }

   public int getFiyat () {
      return fiyat;
   }

   public void setFiyat (int fiyat) {
      this.fiyat = fiyat;
   }

   public String getStok_durumu () {
      return stok_durumu;
   }

   public void setStok_durumu (String stok_durumu) {
      this.stok_durumu = stok_durumu;
   }

   
   
}
