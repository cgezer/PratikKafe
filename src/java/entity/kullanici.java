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
public class kullanici {
    private int kullanici_id;
    private String ad;
    private String soyad;
    private String adres;
    private int kredi_kart_no;
     private int telefon_no;

   public kullanici () {
   }

   public kullanici (int kullanici_id , String ad , String soyad , String adres , int kredi_kart_no , int telefon_no) {
      this.kullanici_id = kullanici_id;
      this.ad = ad;
      this.soyad = soyad;
      this.adres = adres;
      this.kredi_kart_no = kredi_kart_no;
      this.telefon_no = telefon_no;
   }

   public int getKullanici_id () {
      return kullanici_id;
   }

   public void setKullanici_id (int kullanici_id) {
      this.kullanici_id = kullanici_id;
   }

   public String getAd () {
      return ad;
   }

   public void setAd (String ad) {
      this.ad = ad;
   }

   public String getSoyad () {
      return soyad;
   }

   public void setSoyad (String soyad) {
      this.soyad = soyad;
   }

   public String getAdres () {
      return adres;
   }

   public void setAdres (String adres) {
      this.adres = adres;
   }

   public int getKredi_kart_no () {
      return kredi_kart_no;
   }

   public void setKredi_kart_no (int kredi_kart_no) {
      this.kredi_kart_no = kredi_kart_no;
   }

   public int getTelefon_no () {
      return telefon_no;
   }

   public void setTelefon_no (int telefon_no) {
      this.telefon_no = telefon_no;
   }

 
}
