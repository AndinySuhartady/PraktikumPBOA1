import java.time.LocalDate;

class Tendik extends Pegawai {
    private String bidang;

    public Tendik(String nip, String nama, String tglLahir, String tmtBekerja, double gajiPokok, String bidang) {
        super(nip, nama, tglLahir, tmtBekerja, gajiPokok);
        this.bidang = bidang;
    }

    @Override
    public void printInfo() {
        LocalDate bup = tglLahir.plusYears(55).plusMonths(1).withDayOfMonth(1);
        double tunjangan = 0.01 * getMasaKerjaTahun() * gajiPokok;
        super.printInfo();
        System.out.println("Jabatan         : Tenaga Kependidikan");
        System.out.println("Bidang          : " + bidang);
        System.out.println("BUP             : " + bup.format(fmt));
        System.out.printf("Tunjangan       : 1%% x %d x Rp %,.2f = Rp %,.2f\n", getMasaKerjaTahun(), gajiPokok, tunjangan);
    }
}