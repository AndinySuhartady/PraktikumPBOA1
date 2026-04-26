// ================= DOSEN =================
class Dosen extends Karyawan {
    private Fakultas fakultas;
    private static int counterDosen = 0;

    public Dosen(String nama, String email, String nip, int masaKerja, Fakultas fakultas) {
        super(nama, email, nip, masaKerja);
        this.fakultas = fakultas;
        counterDosen++;
    }

    public double hitungGaji() {
        return fakultas.getGajiPokok() + (masaKerja * 0.01 * fakultas.getGajiPokok());
    }

    public void tampilkanGaji() {
        System.out.println("Total Gaji: Rp" + hitungGaji());
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== DATA DOSEN ===");
        System.out.println("Nama      : " + nama);
        System.out.println("Email     : " + email);
        System.out.println("NIP       : " + nip);
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
        System.out.println("Fakultas  : " + fakultas.getNamaFakultas());
        tampilkanGaji();
    }

    public static int getCounterDosen() {
        return counterDosen;
    }
}