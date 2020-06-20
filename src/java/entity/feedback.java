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
    private kullanici kullanici;

    public feedback () {
    }

   public feedback (int feedback_id , int puan , String aciklama , kullanici kullanici) {
      this.feedback_id = feedback_id;
      this.puan = puan;
      this.aciklama = aciklama;
      this.kullanici = kullanici;
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

   public kullanici getKullanici () {
      return kullanici;
   }

   public void setKullanici (kullanici kullanici) {
      this.kullanici = kullanici;
   }

 
}
