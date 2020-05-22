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
    private int id;
    private String adi;
    private String turu;
    private float fiyat;
    private String stok_durumu;

    public menu () {
    }

    public menu (int id , String adi , String turu , float fiyat , String stok_durumu) {
        this.id = id;
        this.adi = adi;
        this.turu = turu;
        this.fiyat = fiyat;
        this.stok_durumu = stok_durumu;
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

    public String getStok_durumu () {
        return stok_durumu;
    }

    public void setStok_durumu (String stok_durumu) {
        this.stok_durumu = stok_durumu;
    }

    @Override
    public String toString () {
        return "menu{" + "id=" + id + ", adi=" + adi + ", turu=" + turu + ", fiyat=" + fiyat + ", stok_durumu=" + stok_durumu + '}';
    }
    
}
