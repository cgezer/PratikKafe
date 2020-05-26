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
public class kampanya {
    private int id;
    private String adi;
    private String tipi;
    private int oran;

    public kampanya () {
    }

    public kampanya (int id , String adi , String tipi , int oran) {
        this.id = id;
        this.adi = adi;
        this.tipi = tipi;
        this.oran = oran;
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

    public String getTipi () {
        return tipi;
    }

    public void setTipi (String tipi) {
        this.tipi = tipi;
    }

    public int getOran () {
        return oran;
    }

    public void setOran (int oran) {
        this.oran = oran;
    }

    @Override
    public String toString () {
        return "kampanya{" + "id=" + id + ", adi=" + adi + ", tipi=" + tipi + ", oran=" + oran + '}';
    }
    
    
    
}
