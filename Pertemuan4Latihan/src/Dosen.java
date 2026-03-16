/*
Nama File : Dosen.java
Deskripsi : Subclass dari Pegawai
Pembuat   : Andiny Khaerany Suhartady
Tanggal   : 16 Maret 2026
*/

import java.time.LocalDate;

public class Dosen extends Pegawai {

    protected String fakultas;

    public Dosen(String nip, String nama, LocalDate tglLahir, LocalDate tmt,
                 double gajiPokok, String fakultas) {

        super(nip, nama, tglLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }
}