/*
 * File        : Garis.java
 * Deskripsi   : Class Garis dengan atribut Titik awal & akhir
 * Pembuat     : Andiny Khaerany Suhartady
 * Tanggal     : 1 Maret 2026
 */

public class Garis {

    /* ********** ATRIBUT ********** */
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /* ********** KONSTRUKTOR ********** */

    // Default: (0,0) ke (1,1)
    public Garis() {
        this.titikAwal = new Titik(0,0);
        this.titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    // Konstruktor dengan parameter
    public Garis(Titik awal, Titik akhir) {
        this.titikAwal = awal;
        this.titikAkhir = akhir;
        counterGaris++;
    }

    /* ********** GETTER ********** */
    public Titik getTitikAwal() {
        return titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    /* ********** SETTER ********** */
    public void setTitikAwal(Titik t) {
        this.titikAwal = t;
    }

    public void setTitikAkhir(Titik t) {
        this.titikAkhir = t;
    }

    /* ********** METHOD ********** */

    // Panjang garis
    public double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    // Gradien
    public double getGradien() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return dy / dx;
    }

    // Titik tengah
    public Titik getTitikTengah() {
        double x = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double y = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(x, y);
    }

    // Cek sejajar
    public boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    // Cek tegak lurus
    public boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }

    // Print garis
    public void printGaris() {
        System.out.print("Garis dari ");
        titikAwal.printTitik();
        System.out.print(" ke ");
        titikAkhir.printTitik();
    }

    // Persamaan garis y = mx + c
    public String getPersamaanGaris() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - (m * titikAwal.getAbsis());
        return "y = " + m + "x + " + c;
    }
}