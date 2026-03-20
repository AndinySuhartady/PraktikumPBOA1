/*
Nama File : MBangunDatar.java
Deskripsi : Main program
Pembuat : Andiny Khaerany Suhartady
Tanggal : 20 Maret 2026
*/

public class MBangunDatar {

    public static void main(String[] args) {


        BangunDatar P1 = new Persegi(10, "Merah", "Solid");
        Persegi P2 = new Persegi(5, "Biru", "Putus");

        BangunDatar L1 = new Lingkaran(7, "Hijau", "Tebal");
        Lingkaran L2 = new Lingkaran(14, "Kuning", "Tipis");

        System.out.println("=== Persegi ===");
        P2.printInfo();

        System.out.println("\n=== Lingkaran ===");
        L2.printInfo();

        // Perbandingan
        System.out.println("\nLuas sama? " + P1.isEqualLuas(L1));
        System.out.println("Keliling sama? " + P1.isEqualKeliling(L1));

        // Resize
        System.out.println("\n=== Resize Persegi ===");
        P2.zoomIn();
        P2.printInfo();

        System.out.println("\n=== Resize Lingkaran ===");
        L2.zoomOut();
        L2.printInfo();

        // Counter
        System.out.println();
        BangunDatar.printCounterBangunDatar();
    }
}