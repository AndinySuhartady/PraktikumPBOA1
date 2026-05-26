/*
 * File : Burung.java
 * Nama : Andiny Khaerany Suhartady
 * NIM  : 24060124140194
 * Tanggal : 9 Mei 2026
 * Deskripsi : Subclass Burung
 */

public class Burung extends Anabul {

    public Burung(String nama, double bobot) {
        super(nama, bobot);
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
