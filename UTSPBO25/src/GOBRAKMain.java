import java.time.LocalDate;

public class GOBRAKMain {
    public static void main(String[] args) {
        // Inisialisasi Peserta
        Remaja r1 = new Remaja(
            "3301-2008",
            "Rian Hidayat",
            'L',
            LocalDate.of(2008, 5, 10),
            "Jl. Sudirman No. 5"
        );

        // Membuat objek masalah (Polimorfisme)
        Masalah m1 = new Kekerasan("K01", "Tawuran antar sekolah", 11, 2023);
        Masalah m2 = new PenyalahgunaanObat("O01", "Penyalahgunaan Napza", "Sabu-sabu", 5);
    Masalah m3 = new PergaulanBebas("P01", "Pergaulan tidak sehat", "Sering keluar malam");

        // Menambahkan masalah ke profil peserta
        r1.tambahMasalah(m1);
        r1.tambahMasalah(m2);
        r1.tambahMasalah(m3);
        // Menampilkan hasil pendaftaran
        r1.tampilkanProfil();

        /*
        Gobrak gobrak = new Gobrak();
        gobrak.tambahPeserta(r1);
        gobrak.tampilkanSemuaPeserta();
        */
    }
}