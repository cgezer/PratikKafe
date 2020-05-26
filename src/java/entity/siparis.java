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
public class siparis {
    
    private int id;
    private String konum;
    private int tutar;
    private int iletisim_no;
    private Date tarih;
    private String saat;
    private int sure;
    private String tipi;

    public siparis () {
    }

    
    public siparis (int id , String konum , int tutar , int iletisim_no , Date tarih , String saat , int sure , String tipi) {
        this.id = id;
        this.konum = konum;
        this.tutar = tutar;
        this.iletisim_no = iletisim_no;
        this.tarih = tarih;
        this.saat = saat;
        this.sure = sure;
        this.tipi = tipi;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getKonum () {
        return konum;
    }

    public void setKonum (String konum) {
        this.konum = konum;
    }

    public int getTutar () {
        return tutar;
    }

    public void setTutar (int tutar) {
        this.tutar = tutar;
    }

    public int getIletisim_no () {
        return iletisim_no;
    }

    public void setIletisim_no (int iletisim_no) {
        this.iletisim_no = iletisim_no;
    }

    public Date getTarih () {
        return tarih;
    }

    public void setTarih (Date tarih) {
        this.tarih = tarih;
    }

    public String getSaat () {
        return saat;
    }

    public void setSaat (String saat) {
        this.saat = saat;
    }

    public int getSure () {
        return sure;
    }

    public void setSure (int sure) {
        this.sure = sure;
    }

    public String getTipi () {
        return tipi;
    }

    public void setTipi (String tipi) {
        this.tipi = tipi;
    }

    @Override
    public String toString () {
        return "siparis{" + "id=" + id + ", konum=" + konum + ", tutar=" + tutar + ", iletisim_no=" + iletisim_no + ", tarih=" + tarih + ", saat=" + saat + ", sure=" + sure + ", tipi=" + tipi + '}';
    }
    
    
    
}
