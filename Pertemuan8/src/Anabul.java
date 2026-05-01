/*
 * File : Anabul.java
 * Nama : Andiny Khaerany Suhartady
 * NIM  : 24060124140194
 * Tanggal : 1 May 2026
 * Deskripsi : Kelas induk (superclass) untuk merepresentasikan hewan peliharaan (Anabul)
 */

public class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void gerak() {
        System.out.println(nama + " bergerak.");
    }

    public void bersuara() {
        System.out.println(nama + " bersuara.");
    }
}
