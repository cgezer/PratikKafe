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
public class masa {
    private int id;
    private String adi;
    private String konum;

    public masa () {
    }

    public masa (int id , String adi , String konum) {
        this.id = id;
        this.adi = adi;
        this.konum = konum;
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

    public String getKonum () {
        return konum;
    }

    public void setKonum (String konum) {
        this.konum = konum;
    }

    @Override
    public String toString () {
        return "masa{" + "id=" + id + ", adi=" + adi + ", konum=" + konum + '}';
    }
    
    
}
