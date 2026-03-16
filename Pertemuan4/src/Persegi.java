/*
Nama File : Persegi.java
Deskripsi : Subclass dari BangunDatar
Pembuat   : Andiny Khaerany Suhartady
Tanggal   : 16 Maret 2026
*/

public class Persegi extends BangunDatar {

    private double sisi;

    // Konstruktor default
    public Persegi(){
        super(4, "Hitam", "Solid");
    }

    // Konstruktor berparameter
    public Persegi(double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi * sisi;
    }

    public double getKeliling(){
        return 4 * sisi;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi        : " + sisi);
        System.out.println("Luas        : " + getLuas());
        System.out.println("Keliling    : " + getKeliling());
    }
}