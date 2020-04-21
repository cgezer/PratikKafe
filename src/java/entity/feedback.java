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

    private int id;
    private int puan;
    private String aciklama;

    public feedback () {
    }

    public feedback (int id , int puan , String aciklama) {
        this.id = id;
        this.puan = puan;
        this.aciklama = aciklama;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    @Override
    public String toString () {
        return "feedback{" + "id=" + id + ", puan=" + puan + ", aciklama=" + aciklama + '}';
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

    
}
