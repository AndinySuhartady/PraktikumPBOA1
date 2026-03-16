/*
Nama File : MBangunDatar.java
Deskripsi : Main class untuk menjalankan program
Pembuat   : Andiny Khaerany Suhartady
Tanggal   : 16 Maret 2026
*/

public class MBangunDatar {
    public static void main(String[] args) {
        // Membuat objek Persegi
        Persegi p = new Persegi(5, "Merah", "Hitam");
        Lingkaran l = new Lingkaran(7, "Hijau", "Kuning");


        Persegi p1 = new Persegi(5, "Merah", "Hitam");
        Persegi p2 = new Persegi(10, "Biru", "Putih");
        p2.setSisi(10);
        p2.setWarna("Biru");
        p2.setBorder("Putih");

        // Membuat objek Lingkaran
        Lingkaran l1 = new Lingkaran(7, "Hijau", "Kuning");
        Lingkaran l2 = new Lingkaran(3.5, "Ungu", "Hitam");


        // Memanggil method-method

        System.out.println("=== Info Persegi ===");
        p.printInfo();

        System.out.println("\n=== Info Lingkaran ===");
        l.printInfo();

        System.out.println("=== Info Persegi 1 ===");
        p1.printInfo();

        System.out.println("\n=== Info Persegi 2 ===");
        p2.printInfo();

        System.out.println("\n=== Info Lingkaran 1 ===");
        l1.printInfo();

        System.out.println("\n=== Info Lingkaran 2 ===");
        l2.printInfo();

        // Memanggil static method dari superclass
        BangunDatar.printCounterBangunDatar();

        // Memanggil static method dari subclass
        Persegi.printCounterBangunDatar();


    }
}