/*
Nama File : BangunDatar.java
Deskripsi : Abstract class untuk bangun datar
Pembuat   : Andiny Khaerany Suhartady
Tanggal   : 20 Maret 2026
*/

public abstract class BangunDatar {

    protected int jmlSisi;
    protected String warna;
    protected String border;

    static int counterBangunDatar = 0;

    // Konstruktor
    public BangunDatar(){
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    // ABSTRACT METHOD
    public abstract double getLuas();
    public abstract double getKeliling();

    // Method biasa
    public void printInfo(){
        System.out.println("Jumlah Sisi : " + jmlSisi);
        System.out.println("Warna       : " + warna);
        System.out.println("Border      : " + border);
    }

    // Method pembanding
    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah objek BangunDatar : " + counterBangunDatar);
    }
}