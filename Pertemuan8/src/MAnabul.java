/*
 * File : MAnabul.java
 * Nama : Andiny Khaerany Suhartady
 * NIM  : 24060124140194
 * Tanggal : 1 May 2026
 * Deskripsi : Kelas utama untuk menguji penggunaan generik Datum dengan objek Anabul
 */

public class MAnabul {
    public static void main(String[] args) {
        Datum<Anabul> dataAnabul = new Datum<>();

        Anggora anggora = new Anggora("Equisha", 4.2);
        Kembangtelon kembangtelon = new Kembangtelon("Laiciey", 3.5);

        dataAnabul.setIsi(anggora);
        dataAnabul.getIsi().gerak();
        dataAnabul.getIsi().bersuara();

        dataAnabul.setIsi(kembangtelon);
        dataAnabul.getIsi().gerak();
        dataAnabul.getIsi().bersuara();
    }
}