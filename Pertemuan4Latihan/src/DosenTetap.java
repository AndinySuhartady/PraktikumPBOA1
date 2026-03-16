/*
Nama File : DosenTetap.java
Deskripsi : Subclass dari Pegawai
Pembuat   : Andiny Khaerany Suhartady
Tanggal   : 16 Maret 2026
*/


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTetap extends Dosen {

    private String nidn;
    private final int BUP = 65;

    public DosenTetap(String nip, String nidn, String nama, LocalDate tglLahir,
                      LocalDate tmt, double gajiPokok, String fakultas) {

        super(nip, nama, tglLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public double hitungTunjangan() {
        return 0.02 * hitungMasaKerjaTahun() * gajiPokok;
    }

    public LocalDate hitungTanggalPensiun() {
        return tglLahir.plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }

    @Override
    public void printInfo() {

    super.printInfo();

    DateTimeFormatter format =
            DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id","ID"));

    System.out.println("NIDN : " + nidn);
    System.out.println("Jabatan : Dosen Tetap");
    System.out.println("Fakultas : " + fakultas);

    System.out.println("Masa Kerja : "
            + hitungMasaKerjaTahun() + " tahun "
            + hitungMasaKerjaBulan() + " bulan");

    System.out.println("Tanggal Pensiun : " + hitungTanggalPensiun().format(format));

    System.out.printf("Tunjangan : Rp %.0f\n", hitungTunjangan());
    }
}