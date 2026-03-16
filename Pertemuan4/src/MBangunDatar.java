/*
Nama File : MBangunDatar.java
Deskripsi : Main class untuk menjalankan program
Pembuat   : Andiny Khaerany Suhartady
Tanggal   : 16 Maret 2026
*/

public class MBangunDatar {

    public static void main(String[] args) {

        Persegi p1 = new Persegi(5, "Merah", "Hitam");
        Persegi p2 = new Persegi(10, "Biru", "Putih");

        Lingkaran l1 = new Lingkaran(7, "Hijau", "Kuning");
        Lingkaran l2 = new Lingkaran(3.5, "Ungu", "Hitam");

        System.out.println("=== Persegi 1 ===");
        p1.printInfo();

        System.out.println("\n=== Persegi 2 ===");
        p2.printInfo();

        System.out.println("\n=== Lingkaran 1 ===");
        l1.printInfo();

        System.out.println("\n=== Lingkaran 2 ===");
        l2.printInfo();

        BangunDatar.printCounterBangunDatar();
    }
}