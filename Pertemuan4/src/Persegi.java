/*
Nama File : Persegi.java
Deskripsi : Subclass untuk menjalankan program
Pembuat   : Andiny Khaerany Suhartady
Tanggal   : 16 Maret 2026
*/

public class Persegi extends BangunDatar {
    private double sisi;


    // Konstruktor dengan parameter
      public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }


    // Getter dan Setter
    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Method untuk menghitung luas
    public double hitungLuas() {
        return sisi * sisi;
    }

    // Method untuk menghitung keliling
    public double hitungKeliling() {
        return 4 * sisi;
    }

    // Override printInfo agar menampilkan detail persegi
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Panjang sisi: " + sisi);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}