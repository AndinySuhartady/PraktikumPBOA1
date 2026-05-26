/*
 * File : Kucing.java  
 * Nama : Andiny Khaerany Suhartady
 * NIM  : 24060124140194
 * Tanggal : 26 April 2026
 * Deskripsi :Kelas turunan (subclass) dari Anabul yang merepresentasikan hewan kucing dengan perilaku gerak dan suara spesifik
 */


public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak melata.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi meong.");
    }
}
