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
public class feedback {

    private int feedback_id;
    private int puan;
    private String aciklama;
    private int kullanici_id;

    public feedback () {
    }

   public feedback (int feedback_id , int puan , String aciklama , int kullanici_id) {
      this.feedback_id = feedback_id;
      this.puan = puan;
      this.aciklama = aciklama;
      this.kullanici_id = kullanici_id;
   }

   public int getFeedback_id () {
      return feedback_id;
   }

   public void setFeedback_id (int feedback_id) {
      this.feedback_id = feedback_id;
   }

   public int getPuan () {
      return puan;
   }

   public void setPuan (int puan) {
      this.puan = puan;
   }

   public String getAciklama () {
      return aciklama;
   }

   public void setAciklama (String aciklama) {
      this.aciklama = aciklama;
   }

   public int getKullanici_id () {
      return kullanici_id;
   }

   public void setKullanici_id (int kullanici_id) {
      this.kullanici_id = kullanici_id;
   }

 
}
