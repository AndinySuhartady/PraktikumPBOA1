/*
Nama File : Tendik.java
Deskripsi : Subclass dari Pegawai
Pembuat   : Andiny Khaerany Suhartady
Tanggal   : 16 Maret 2026
*/

import java.time.LocalDate;

public class Tendik extends Pegawai {

    private String bidang;
    private final int BUP = 55;

    public Tendik(String nip, String nama, LocalDate tglLahir,
                  LocalDate tmt, double gajiPokok, String bidang) {

        super(nip, nama, tglLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public double hitungTunjangan() {
        return 0.01 * hitungMasaKerjaTahun() * gajiPokok;
    }

    public LocalDate hitungTanggalPensiun() {
        return tglLahir.plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }

    @Override
public void printInfo() {

    super.printInfo();
    System.out.println("Jabatan : Tendik");
    System.out.println("Bidang : " + bidang);

    System.out.println("Masa Kerja : "
            + hitungMasaKerjaTahun() + " tahun "
            + hitungMasaKerjaBulan() + " bulan");

    System.out.println("Tanggal Pensiun : " + hitungTanggalPensiun().format(format));

    System.out.printf("Tunjangan : Rp %.0f\n", hitungTunjangan());
}
}