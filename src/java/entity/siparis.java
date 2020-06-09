/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author SMSNG
 */
public class siparis {
    
   private int siparis_id;
   private String konum;
   private int tutar;
   private String saat;
   private String tarih;
   private int sure;
   private String tipi;
   private int musteri_id;

    public siparis () {
    }

   public siparis (int siparis_id , String konum , int tutar , String saat , String tarih , int sure , String tipi , int musteri_id) {
      this.siparis_id = siparis_id;
      this.konum = konum;
      this.tutar = tutar;
      this.saat = saat;
      this.tarih = tarih;
      this.sure = sure;
      this.tipi = tipi;
      this.musteri_id = musteri_id;
   }

   public int getSiparis_id () {
      return siparis_id;
   }

   public void setSiparis_id (int siparis_id) {
      this.siparis_id = siparis_id;
   }

   public String getKonum () {
      return konum;
   }

   public void setKonum (String konum) {
      this.konum = konum;
   }

   public int getTutar () {
      return tutar;
   }

   public void setTutar (int tutar) {
      this.tutar = tutar;
   }

   public String getSaat () {
      return saat;
   }

   public void setSaat (String saat) {
      this.saat = saat;
   }

   public String getTarih () {
      return tarih;
   }

   public void setTarih (String tarih) {
      this.tarih = tarih;
   }

   public int getSure () {
      return sure;
   }

   public void setSure (int sure) {
      this.sure = sure;
   }

   public String getTipi () {
      return tipi;
   }

   public void setTipi (String tipi) {
      this.tipi = tipi;
   }

   public int getMusteri_id () {
      return musteri_id;
   }

   public void setMusteri_id (int musteri_id) {
      this.musteri_id = musteri_id;
   }

}
