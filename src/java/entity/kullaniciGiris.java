
package entity;

import java.util.Objects;

public class kullaniciGiris {
    private Long kullanici_giris_id;
    private String username;
    private String password;    
    private kullanici yetki;

    public kullaniciGiris() {
        this.yetki = new kullanici();
    }

    public Long getKullanici_giris_id() {
        return kullanici_giris_id;
    }

    public void setKullanici_giris_id(Long kullanici_giris_id) {
        this.kullanici_giris_id = kullanici_giris_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public kullanici getYetki() {
        return yetki;
    }

    public void setYetki(kullanici yetki) {
        this.yetki = yetki;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.kullanici_giris_id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final kullaniciGiris other = (kullaniciGiris) obj;
        if (!Objects.equals(this.kullanici_giris_id, other.kullanici_giris_id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Kullanici{" + "Kullanici_id=" + kullanici_giris_id + ", username=" + username + ", password=" + password + ", yetki=" + yetki + '}';
    }
    
}
