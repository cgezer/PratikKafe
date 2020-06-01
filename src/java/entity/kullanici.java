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
    private int id;
    private String ad;
    private String soyad;
    private String adres;
    private int kredi_kart_no;

    public kullanici () {
    }

    public kullanici (int id ,String ad ,String soyad, String adres ,int kredi_kart_no) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.adres = adres;
        this.kredi_kart_no = kredi_kart_no;
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

    @Override
    public String toString () {
        return "musteri{" + "id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", adres=" + adres + ", kredi_kart_no=" + kredi_kart_no + '}';
    }
    
    
}
