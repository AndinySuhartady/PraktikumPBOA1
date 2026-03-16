/*
Nama File : MBangunDatar.java
Deskripsi : Main class untuk menjalankan program
Pembuat   : Andiny Khaerany Suhartady
Tanggal   : 16 Maret 2026
*/

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        setJmlSisi(4); 
    }

    // Konstruktor dengan parameter
    public Persegi(double sisi, String warna, String border) {
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
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