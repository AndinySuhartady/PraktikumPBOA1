/*
Nama File : Petani.java
Deskripsi : Subclass
Pembuat   : Andiny Khaerany Suhartady
Tanggal   : 21 Maret 2026
*/

import java.time.LocalDate;

public class Petani extends Manusia {

    private String asal;
    static int counterPetani = 0;

    public Petani(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String asal){
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asal = asal;
        counterPetani++;
    }

    @Override
    public double hitungPajak(){
        return 0; // sesuai soal
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal        : " + asal);
        System.out.println("Tipe        : Petani");
    }

    public static int getCounterPetani(){
        return counterPetani;
    }
}