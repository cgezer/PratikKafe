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
public class icecek {
    private int id;
    private String adi;
    private float fiyat;
    private String marka;

    public icecek () {
    }

    public icecek (int id , String adi , float fiyat , String marka) {
        this.id = id;
        this.adi = adi;
        this.fiyat = fiyat;
        this.marka = marka;
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

    public float getFiyat () {
        return fiyat;
    }

    public void setFiyat (float fiyat) {
        this.fiyat = fiyat;
    }

    public String getMarka () {
        return marka;
    }

    public void setMarka (String marka) {
        this.marka = marka;
    }

    @Override
    public String toString () {
        return "icecek{" + "id=" + id + ", adi=" + adi + ", fiyat=" + fiyat + ", marka=" + marka + '}';
    }
    
    
}
