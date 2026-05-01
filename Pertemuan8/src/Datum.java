/*
 * File : Datum.java
 * Nama : Andiny Khaerany Suhartady
 * NIM  : 24060124140194
 * Tanggal : 1 May 2026
 * Deskripsi : Kelas generik untuk menyimpan satu objek bertipe T
 */

public class Datum <T>{
    private T isi;

    public T getIsi(){
        return isi;
    }

    public void setIsi(T isiBaru){
        this.isi = isiBaru;
    }
}
