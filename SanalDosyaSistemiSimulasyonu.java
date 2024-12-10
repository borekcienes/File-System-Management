/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sanaldosyasistemisimulasyonu;

/**
 *
 * @author borek
 */
public class SanalDosyaSistemiSimulasyonu {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SanalDisk disk = new SanalDisk(100); // 100 MB'lık bir sanal disk

        // Kök dizin oluştur
        Dizin kokDizin = new Dizin("Kok");
        disk.dizinEkle(kokDizin);

        // Alt dizin ve dosyalar ekle
        Dizin belgeDizini = new Dizin("Belgeler");
        kokDizin.dizinEkle(belgeDizini);

        Dosya dosya1 = new Dosya("dersNotlari.txt");
        dosya1.yaz("Bu bir ders notudur.");
        belgeDizini.dosyaEkle(dosya1);

        Dosya dosya2 = new Dosya("kitap.txt");
        dosya2.yaz("Bu bir kitaptır.");
        belgeDizini.dosyaEkle(dosya2);

        disk.listele();

        belgeDizini.dosyaSil(dosya1);
        System.out.println("Dosya silme isleminden sonra:");

        disk.listele();

        disk.diskDurumu();
    }
    
}
