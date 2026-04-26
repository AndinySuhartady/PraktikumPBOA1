// Superclass Peserta
abstract class Peserta {
    protected String noKTP, nama, email;
    protected Registrasi[] daftarRegistrasi = new Registrasi[3];
    protected int jumlahDaftar = 0;

    public Peserta(String noKTP, String nama, String email) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.email = email;
    }

    public abstract double hitungDiskon(double harga);

    public void tambahRegistrasi(Registrasi r) {
        if (jumlahDaftar < 3) {
            daftarRegistrasi[jumlahDaftar++] = r;
        }
    }

    public void tampilkanDetailPeserta() {
    System.out.println("========== DATA PESERTA ==========");
    System.out.println("KTP: " + noKTP);
    System.out.println("Nama: " + nama);
    System.out.println("Email: " + email);
    System.out.println(">> DAFTAR PELATIHAN:");

    if (jumlahDaftar == 0) {
        System.out.println("- Belum ada pelatihan");
    } else {
        for (int i = 0; i < jumlahDaftar; i++) {
            daftarRegistrasi[i].tampilkanInfoBayar();
        }
    }
}
}