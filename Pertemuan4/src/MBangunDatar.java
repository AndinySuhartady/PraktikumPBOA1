/*
Nama File : MBangunDatar.java
Deskripsi : Main class untuk menjalankan program
Pembuat   : Andiny Khaerany Suhartady
Tanggal   : 16 Maret 2026
*/

public class MBangunDatar {

    public static void main(String[] args) {

        Persegi p1 = new Persegi(5, "Merah", "Putus-putus");
        Lingkaran l1 = new Lingkaran(7, "Biru", "Tebal");

        System.out.println("=== Persegi ===");
        p1.printInfo();

        System.out.println("\n=== Lingkaran ===");
        l1.printInfo();

        System.out.println();
        BangunDatar.printCounterBangunDatar();
    }
}