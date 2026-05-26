/*
 * File : MainAnabul.java  
 * Nama : Andiny Khaerany Suhartady
 * NIM  : 24060124140194
 * Tanggal : 26 April 2026 
 * Deskripsi :Program utama untuk mendemonstrasikan penggunaan polimorfisme pada kelas Anabul dan turunannya
 */


public class MainAnabul {
    public static void main(String[] args) {
        Anabul[] daftar = {
            new Kucing("Aisyaila"),
            new Anjing("Cazyi"),
            new Burung("Mersht")
        };

        for (Anabul a : daftar) {
            a.bersuara();
            a.gerak();
            System.out.println();
        }
    }
}
