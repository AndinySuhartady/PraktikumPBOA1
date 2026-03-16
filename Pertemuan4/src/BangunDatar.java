/*
Nama File : BangunDatar.java
Deskripsi : Superclass untuk bangun datar
Pembuat   : Andiny Khaerany Suhartady
Tanggal   : 16 Maret 2026
*/

public class BangunDatar {

    protected int jmlSisi;
    protected String warna;
    protected String border;

    static int counterBangunDatar = 0;

    // Konstruktor default
    public BangunDatar(){
        counterBangunDatar++;
    }

    // Konstruktor berparameter
    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public void printInfo(){
        System.out.println("Jumlah Sisi : " + jmlSisi);
        System.out.println("Warna       : " + warna);
        System.out.println("Border      : " + border);
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah objek BangunDatar : " + counterBangunDatar);
    }
}