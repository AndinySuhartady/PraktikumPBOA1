import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class DosenTamu extends Dosen {
    private String nidk;
    private LocalDate tglBerakhirKontrak;

    public DosenTamu(String nip, String nama, String tglLahir, String tmtBekerja, double gajiPokok, String fakultas, String nidk, String tglBerakhir) {
        super(nip, nama, tglLahir, tmtBekerja, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tglBerakhirKontrak = LocalDate.parse(tglBerakhir);
    }

    public long getSisaKontrak() {
    return ChronoUnit.MONTHS.between(
        LocalDate.of(2025, 3, 10),tglBerakhirKontrak );
    }

    public double getTunjangan() {
        return 0.025 * gajiPokok;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK            : " + nidk);
        System.out.println("Status          : Dosen Tamu");
        System.out.println("Tgl Berakhir    : " + tglBerakhirKontrak.format(fmt));
        System.out.println("Tunjangan       : Rp " + getTunjangan());
    }
}