/*
 * File :  Burung.java 
 * Nama : Andiny Khaerany Suhartady
 * NIM  : 24060124140194
 * Tanggal : 26 April 2026 
 * Deskripsi :Kelas turunan (subclass) dari Anabul yang merepresentasikan hewan burung dengan perilaku gerak dan suara spesifik
 */



public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak terbang.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi cuit.");
    }
}
