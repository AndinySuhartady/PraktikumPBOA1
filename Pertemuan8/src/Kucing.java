/*
 * File : Kucing.java
 * Nama : Andiny Khaerany Suhartady
 * NIM  : 24060124140194
 * Tanggal : 1 May 2026
 * Deskripsi : Kelas turunan dari Anabul yang memiliki atribut bobot dan perilaku kucing
 */


public class Kucing extends Anabul {

    protected double bobot;

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot(){
        return bobot;
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

