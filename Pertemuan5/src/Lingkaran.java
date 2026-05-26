/*
Nama File : Lingkaran.java
Deskripsi : Subclass Lingkaran
Pembuat : Andiny Khaerany Suhartady
Tanggal : 20 Maret 2026
*/

public class Lingkaran extends BangunDatar implements IResize {

    private double jariJari;

    public Lingkaran(){
        super(0, "Hitam", "Solid");
    }

    public Lingkaran(double jariJari, String warna, String border){
        super(0, warna, border);
        this.jariJari = jariJari;
    }

    @Override
    public double getLuas(){
        return Math.PI * jariJari * jariJari;
    }

    @Override
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

    // Interface
    @Override
    public void zoomIn(){
        jariJari = jariJari * 1.1;
    }

    @Override
    public void zoomOut(){
        jariJari = jariJari * 0.9;
    }
}