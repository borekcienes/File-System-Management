/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanaldosyasistemisimulasyonu;

/**
 *
 * @author borek
 */
public class Dosya {
    private final String isim;
    private String icerik;

    public Dosya(String isim) {
        this.isim = isim;
        this.icerik = "";
    }

    public String getIsim() {
        return isim;
    }

    public String getIcerik() {
        return icerik;
    }

    public void yaz(String veri) {
        this.icerik += veri;
    }

    public void sil() {
        this.icerik = "";
    }
}
