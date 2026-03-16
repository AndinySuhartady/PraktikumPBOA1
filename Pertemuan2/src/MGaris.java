/*
 * File        : MGaris.java
 * Deskripsi   : Main class untuk menguji Garis
 * Pembuat     : Andiny Khaerany Suhartady
 * Tanggal     : 1 Maret 2026
 */

public class MGaris {
    public static void main(String[] args) {

        Titik A = new Titik(-2, 0);
        Titik B = new Titik(0, 4);

        Garis G1 = new Garis(A, B);

        System.out.println("Panjang G1: " + G1.getPanjang());
        System.out.println("Gradien G1: " + G1.getGradien());

        Titik tengah = G1.getTitikTengah();
        System.out.print("Titik Tengah: ");
        tengah.printTitik();

        System.out.println("Persamaan Garis: " + G1.getPersamaanGaris());

        // Garis kedua
        Garis G2 = new Garis(new Titik(0,0), new Titik(2,4));

        System.out.println("Apakah G1 sejajar G2? " + G1.isSejajar(G2));
        System.out.println("Apakah G1 tegak lurus G2? " + G1.isTegakLurus(G2));

        System.out.println("Jumlah objek Garis: " + Garis.getCounterGaris());
    }
}