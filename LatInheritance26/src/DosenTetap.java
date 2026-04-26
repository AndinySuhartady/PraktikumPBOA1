import java.time.LocalDate;

class DosenTetap extends Dosen {
    private String nidn;

    public DosenTetap(String nip, String nama, String tglLahir, String tmtBekerja, double gajiPokok, String fakultas, String nidn) {
        super(nip, nama, tglLahir, tmtBekerja, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public LocalDate getBUP() {
        // 65 tahun + 1 bulan, set ke tanggal 1
        return tglLahir.plusYears(65).plusMonths(1).withDayOfMonth(1);
    }

    public double getTunjangan() {
       return 0.02 * getMasaKerjaTahun() * gajiPokok;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN            : " + nidn);
        System.out.println("Status          : Dosen Tetap");
        System.out.println("Fakultas : " + fakultas);
        System.out.printf("Tunjangan : 2%% x %d x Rp %,.2f = Rp %,.2f\n",getMasaKerjaTahun(), gajiPokok, getTunjangan());
        System.out.println("BUP             : " + getBUP().format(fmt));
    }
}