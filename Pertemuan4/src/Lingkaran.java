/*
Nama File : Lingkaran.java
Deskripsi : Subclass dari BangunDatar
Pembuat   : Andiny Khaerany Suhartady
Tanggal   : 16 Maret 2026
*/

public class Lingkaran extends BangunDatar {

    private double jariJari;

    // Konstruktor default
    public Lingkaran(){
        super(1, "Hitam", "Solid");
    }

    // Konstruktor berparameter
    public Lingkaran(double jariJari, String warna, String border){
        super(1, warna, border);
        this.jariJari = jariJari;
    }

    public double getLuas(){
        return Math.PI * jariJari * jariJari;
    }

    public double getKeliling(){
        return 2 * Math.PI * jariJari;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari   : " + jariJari);
        System.out.println("Luas        : " + getLuas());
        System.out.println("Keliling    : " + getKeliling());
    }
}