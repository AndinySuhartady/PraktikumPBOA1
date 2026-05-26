/*
Nama File : PNS.java
Deskripsi : Subclass
Pembuat   : Andiny Khaerany Suhartady
Tanggal   : 21 Maret 2026
*/

import java.time.LocalDate;

public class PNS extends Manusia {

    private String nip;
    static int counterPNS = 0;

    public PNS(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String nip){
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public PNS(String nama, LocalDate tglMulaiKerja, double pendapatan, String nip){
        super(nama, tglMulaiKerja, "", pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    @Override
    public double hitungPajak(){
        return 0.10 * pendapatan;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP         : " + nip);
        System.out.println("Tipe        : PNS");
    }

    public static int getCounterPNS(){
        return counterPNS;
    }
}