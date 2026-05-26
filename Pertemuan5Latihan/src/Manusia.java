/*
Nama File : Manusia.java
Deskripsi : Superclass
Pembuat   : Andiny Khaerany Suhartady
Tanggal   : 21 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;

public class Manusia{

    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;

    static int counterMns = 0;

    public Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan){
    this.nama = nama;
    this.tglMulaiKerja = tglMulaiKerja;
    this.alamat = alamat;
    this.pendapatan = pendapatan;
    counterMns++;
    }

    public void setAlamat(String alamat){
        this.alamat =  alamat;
    }

    public int hitungMasaKerja(){
        return Period.between(tglMulaiKerja, LocalDate.now()).getYears(); 
    }

    public double hitungPajak(){
        return 0; //Override di subclass
    }

    public void cetakInfo(){
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Pendapatan : " + pendapatan);
    }

    public static int getCounterMns(){
        return counterMns;
    }
    
}