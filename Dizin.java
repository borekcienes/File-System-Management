/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanaldosyasistemisimulasyonu;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author borek
 */
public class Dizin {
    private final String isim;
    private final List<Dosya> dosyalar;
    private final List<Dizin> altDizinler;

    public Dizin(String isim) {
        this.isim = isim;
        this.dosyalar = new ArrayList<>();
        this.altDizinler = new ArrayList<>();
    }

    public String getIsim() {
        return isim;
    }

    public List<Dosya> getDosyalar() {
        return dosyalar;
    }

    public List<Dizin> getAltDizinler() {
        return altDizinler;
    }

    public void dosyaEkle(Dosya dosya) {
        dosyalar.add(dosya);
    }

    public void dizinEkle(Dizin dizin) {
        altDizinler.add(dizin);
    }

    public void dosyaSil(Dosya dosya) {
        dosyalar.remove(dosya);
    }

    public void dizinSil(Dizin dizin) {
        altDizinler.remove(dizin);
    }

    public void listele() {
        System.out.println("Dizin: " + isim);
        for (Dizin altDizin : altDizinler) {
            System.out.println("  Dizin: " + altDizin.getIsim());
        }
        for (Dosya dosya : dosyalar) {
            System.out.println("  Dosya: " + dosya.getIsim());
        }
    }
}
