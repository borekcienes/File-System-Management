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
public class SanalDisk {
    private final int kapasite;
    private final List<Dizin> dizinler;

    public SanalDisk(int kapasite) {
        this.kapasite = kapasite;
        this.dizinler = new ArrayList<>();
    }

    public int getKapasite() {
        return kapasite;
    }

    public void dizinEkle(Dizin dizin) {
        dizinler.add(dizin);
    }

    public void dizinSil(Dizin dizin) {
        dizinler.remove(dizin);
    }

    public void listele() {
        for (Dizin dizin : dizinler) {
            dizin.listele();
        }
    }

    public void diskDurumu() {
        System.out.println("Toplam Kapasite: " + kapasite + " MB");
        // Burada disk kullanımının hesaplanması ve gösterilmesi sağlanabilir
        System.out.println("Kullanilan Alan: " + dizinler.size() * 10 + " MB"); // Örnek hesaplama
    }
}
