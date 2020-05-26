/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.etkinlik;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import model.etkinlikModel;

/**
 *
 * @author SMSNG CelalGezer
 */
@Named
@SessionScoped
public class etkinlikController implements Serializable {
private   int id ;
private   String ad ;
private   int fiyat ;
private   int kapasite ;

    private etkinlikModel Model;


    public void creat () {
        etkinlik e = new etkinlik (this.id ,this.ad , this.fiyat , this.kapasite);
        this.getModel().insert (e);

    }

    public List<etkinlik> getList () {
        return this.getModel().getList ();
    }

    public etkinlikModel getModel () {
        if (this.Model == null) {
            this.Model = new etkinlikModel ();
        }
        return Model;
    }

    public void setEtkModel (etkinlikModel etkModel) {
        this.Model = etkModel;
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

    public int getFiyat () {
        return fiyat;
    }

    public void setFiyat (int fiyat) {
        this.fiyat = fiyat;
    }

    public int getKapasite () {
        return kapasite;
    }

    public void setKapasite (int kapasite) {
        this.kapasite = kapasite;
    }

    
}
