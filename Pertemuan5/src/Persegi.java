/*
Nama File : Persegi.java
Deskripsi : Subclass Persegi
Pembuat : Andiny Khaerany Suhartady
Tanggal : 20 Maret 2026
*/

public class Persegi extends BangunDatar implements IResize{
    private double sisi;

    public Persegi (){
        super(4, "Hitam", "Solid");
    }

    public Persegi(double sisi, String warna, String border){
        super (4, warna, border);
        this.sisi = sisi;
    }

    @Override
    public double getLuas(){
        return sisi*sisi;
    }

    @Override
    public double getKeliling(){
        return 4*sisi;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi        : " + sisi);
        System.out.println("Luas        : " + getLuas());
        System.out.println("Keliling    : " + getKeliling());

    }

    // Interface
    @Override
    public void zoomIn(){
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut(){
        sisi = sisi * 0.9;
    }
}