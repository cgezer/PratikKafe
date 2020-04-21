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
public class oyun {

    private String langerd;
    private String satranc;
    private String tavla;

    public oyun () {
    }

    public oyun (String langerd , String satranc , String tavla) {
        this.langerd = langerd;
        this.satranc = satranc;
        this.tavla = tavla;
    }

    public String getLangerd () {
        return langerd;
    }

    public void setLangerd (String langerd) {
        this.langerd = langerd;
    }

    public String getSatranc () {
        return satranc;
    }

    public void setSatranc (String satranc) {
        this.satranc = satranc;
    }

    public String getTavla () {
        return tavla;
    }

    public void setTavla (String tavla) {
        this.tavla = tavla;
    }

    @Override
    public String toString () {
        return "oyun{" + "langerd=" + langerd + ", satranc=" + satranc + ", tavla=" + tavla + '}';
    }

}
