/*
 * File : CivitasAkademika.java
 * Nama : Andiny Khaerany Suhartady
 * NIM  : 24060124140194
 * Tanggal : 26 April 2026
 * Deskripsi :Kelas induk (superclass) yang merepresentasikan civitas akademika secara umum
 */


public class CivitasAkademika {
    protected String nama;

    public CivitasAkademika (String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public String getNomor(){
        return "-";  //default dan akan dilakukan override
    }
}
