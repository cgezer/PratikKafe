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
public class etkinlik {
    private int etkinlik_id;
    private String ad;
    private int fiyat;
    private int kapasite;

    public etkinlik () {
    }

   public etkinlik (int etkinlik_id , String ad , int fiyat , int kapasite) {
      this.etkinlik_id = etkinlik_id;
      this.ad = ad;
      this.fiyat = fiyat;
      this.kapasite = kapasite;
   }

   public int getEtkinlik_id () {
      return etkinlik_id;
   }

   public void setEtkinlik_id (int etkinlik_id) {
      this.etkinlik_id = etkinlik_id;
   }

   public String getAd () {
      return ad;
   }

   public void setAd (String ad) {
      this.ad = ad;
   }

   public int getFiyat () {
      return fiyat;
   }

   public void setFiyat (int fiyat) {
      this.fiyat = fiyat;
   }

   public int getKapasite () {
      return kapasite;
   }

   public void setKapasite (int kapasite) {
      this.kapasite = kapasite;
   }

}
