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
public class tatli {
    private int id;
    private String ad;
    private float fiyat;   

    public tatli () {
    }

    public tatli (int id , String ad , float fiyat) {
        this.id = id;
        this.ad = ad;
        this.fiyat = fiyat;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getAd () {
        return ad;
    }

    public void setAd (String ad) {
        this.ad = ad;
    }

    public float getFiyat () {
        return fiyat;
    }

    public void setFiyat (float fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString () {
        return "tatli{" + "id=" + id + ", ad=" + ad + ", fiyat=" + fiyat + '}';
    }
    
    
}
