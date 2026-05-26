/*
Nama File : Pegawai.java
Deskripsi : Superclass dari Pegawai
Pembuat   : Andiny Khaerany Suhartady
Tanggal   : 16 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {

    protected String nip;
    protected String nama;
    protected LocalDate tglLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    protected DateTimeFormatter format =
            DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id","ID"));
    public Pegawai(String nip, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public int hitungMasaKerjaTahun() {
        return Period.between(tmt, LocalDate.now()).getYears();
    }

    public int hitungMasaKerjaBulan() {
        return Period.between(tmt, LocalDate.now()).getMonths();
    }

    
    public void printInfo() {
        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id","ID"));
        

        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + tglLahir.format(format));
        System.out.println("TMT : " + tmt.format(format));
        System.out.printf("Gaji Pokok : Rp %.0f\n", gajiPokok);
    }
}