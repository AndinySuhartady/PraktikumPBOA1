import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Remaja {
    private String nia;
    private String namaLengkap;
    private char jenisKelamin;
    private LocalDate tanggalLahir;
    private String alamat;
    private List<Masalah> daftarMasalah;

    public Remaja(String nia, String namaLengkap, char jenisKelamin, LocalDate tanggalLahir, String alamat) {
        this.nia = nia;
        this.namaLengkap = namaLengkap;
        this.jenisKelamin = jenisKelamin;
        this.tanggalLahir = tanggalLahir;
        this.alamat = alamat;
        this.daftarMasalah = new ArrayList<>();
    }

    // Menambahkan masalah
    public void tambahMasalah(Masalah masalah) {
        daftarMasalah.add(masalah);
    }

    // Menampilkan profil + semua masalah
    public void tampilkanProfil() {
        System.out.println("=== Profil Remaja ===");
        System.out.println("NIA: " + nia);
        System.out.println("Nama: " + namaLengkap);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Alamat: " + alamat);

        System.out.println("\nDaftar Masalah:");
        for (Masalah m : daftarMasalah) {
            System.out.println(m.getDetailMasalah()); // polymorphism terjadi di sini

           
        }


    }

}