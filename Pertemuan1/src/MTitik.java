/*
 * Nama File   : MTitik.java
 * Deskripsi   : Main class untuk menjalankan class Titik
 * Pembuat     : Andiny Khaerany Suhartady
 * Tanggal     : 22 Februari 2026
 */

public class MTitik {
    public static void main(String[] args){

        Titik T1 = new Titik (); //Mmembuat objek titik T1 (0,0)

        T1.setAbsis(3);        //Mengubah absis menjadi 3
        T1.setOrdinat(4);      //Mengubah ordinat menjadi 4

        T1.printTitik();         //Cetak titik

        T1.geser(3,4);      //Geser sejauh (3,4)

        T1.printTitik();         //Cetak setelah digeser
    }   
}