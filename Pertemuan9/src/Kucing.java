/*
 * File : Kucing.java
 * Nama : Andiny Khaerany Suhartady
 * NIM  : 24060124140194
 * Tanggal : 9 Mei 2026
 * Deskripsi : Subclass Kucing
 */

public class Kucing extends Anabul {

    public Kucing(String nama, double bobot) {
        super(nama, bobot);
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