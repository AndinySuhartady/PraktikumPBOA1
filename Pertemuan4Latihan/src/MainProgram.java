/*
Nama File : MainProgram.java
Deskripsi : Main dari Pegawai
Pembuat   : Andiny Khaerany Suhartady
Tanggal   : 16 Maret 2026
*/


import java.time.LocalDate;

public class MainProgram {

    public static void main(String[] args) {

        DosenTetap d1 = new DosenTetap(
                "9545647548",
                "78647324",
                "Andi",
                LocalDate.of(1990,5,5),
                LocalDate.of(2015,1,1),
                5000000,
                "Fakultas Sains dan Matematika"
        );
        DosenTamu d2 = new DosenTamu(
                "123456",
                "998877",
                "Budi",
                LocalDate.of(1985,3,10),
                LocalDate.of(2020,2,1),
                4500000,
                "Fakultas Teknik",
                LocalDate.of(2026,12,31)
        );

        Tendik t1 = new Tendik(
                "111222",
                "Besties",
                LocalDate.of(1992,7,12),
                LocalDate.of(2018,4,1),
                3500000,
                "Akademik"
        );
        d1.printInfo();
        d2.printInfo();
        t1.printInfo();

        
        
    }
}