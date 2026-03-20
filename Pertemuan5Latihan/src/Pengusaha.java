/*
Nama File : Pengusaha.java
Deskripsi : Subclass
Pembuat   : Andiny Khaerany Suhartady
Tanggal   : 21 Maret 2026
*/

import java.time.LocalDate;

public class Pengusaha extends Manusia {

    private String npwp;
    static int counterPengusaha = 0;

    public Pengusaha(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String npwp){
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    @Override
    public double hitungPajak(){
        return 0.15 * pendapatan;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP        : " + npwp);
        System.out.println("Tipe        : Pengusaha");
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }
}