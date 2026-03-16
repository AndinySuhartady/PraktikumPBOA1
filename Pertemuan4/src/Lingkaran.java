/*
Nama File : Lingkaran.java
Deskripsi : Subclass dari BangunDatar
Pembuat   : Andiny Khaerany Suhartady
Tanggal   : 16 Maret 2026
*/

public class Lingkaran extends BangunDatar {
    private double jariJari;

 public Lingkaran(double jariJari, String warna, String border) {
        super(0, warna, border); 
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jariJari);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}