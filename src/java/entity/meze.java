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
public class meze {
    private int id;
    private String adi;
    private String turu;
    private float fiyat;

    public meze () {
    }

    public meze (int id , String adi , String turu , float fiyat) {
        this.id = id;
        this.adi = adi;
        this.turu = turu;
        this.fiyat = fiyat;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getAdi () {
        return adi;
    }

    public void setAdi (String adi) {
        this.adi = adi;
    }

    public String getTuru () {
        return turu;
    }

    public void setTuru (String turu) {
        this.turu = turu;
    }

    public float getFiyat () {
        return fiyat;
    }

    public void setFiyat (float fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString () {
        return "meze{" + "id=" + id + ", adi=" + adi + ", turu=" + turu + ", fiyat=" + fiyat + '}';
    }
    
    
}
