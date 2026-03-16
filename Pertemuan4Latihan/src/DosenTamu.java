/*
Nama File : DosenTamu.java
Deskripsi : Subclass dari Pegawai
Pembuat   : Andiny Khaerany Suhartady
Tanggal   : 16 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTamu extends Dosen {

    private String nidk;
    private LocalDate akhirKontrak;

    public DosenTamu(String nip, String nidk, String nama, LocalDate tglLahir,
                     LocalDate tmt, double gajiPokok, String fakultas,
                     LocalDate akhirKontrak) {

        super(nip, nama, tglLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.akhirKontrak = akhirKontrak;
    }

    public double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }

    public int hitungSisaKontrakBulan() {
    Period p = Period.between(LocalDate.now(), akhirKontrak);
    return p.getYears() * 12 + p.getMonths();
    }


   @Override
public void printInfo() {

    super.printInfo();

    DateTimeFormatter format =
            DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id","ID"));

    System.out.println("NIDK : " + nidk);
    System.out.println("Jabatan : Dosen Tamu");
    System.out.println("Fakultas : " + fakultas);
    System.out.println("Akhir Kontrak : " + akhirKontrak.format(format));
    System.out.println("Masa Kontrak : " + hitungSisaKontrakBulan() + " bulan");

    System.out.printf("Tunjangan : Rp %.0f\n", hitungTunjangan());
}
}