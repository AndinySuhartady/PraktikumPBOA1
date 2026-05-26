/*
*File :AngkaSialException.java
*Deskripsi : Eksepsi buatan sendirim menolak masukan angka 13!
*Nama : Andiny Khaerany Suhartady
*NIM :24060124140194
*/

public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}
