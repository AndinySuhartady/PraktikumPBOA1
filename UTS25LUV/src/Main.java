public class Main {
    public static void main(String[] args) {
        // 1. Set Kebijakan Global (Static)
        Pelatihan.setPajak(10.0); // Pajak 10%
        PesertaMember.setDiskonMember(15.0); // Diskon Member 15%

        // 2. Instansiasi Pelatihan
        PelatihanReguler p1 = new PelatihanReguler("REG01", "Java Programming", 10, "Budi", 2000000, 3, "Intermediate", "Kelompok");
        PelatihanInsidental p2 = new PelatihanInsidental("INS01", "Webinar AI", 50, "Ani", 500000, "2023-12-01", "Online");

        // 3. Instansiasi Peserta
        PesertaMember m1 = new PesertaMember("12345", "Rizky", "rizky@mail.com", "MBR001", "2023-01-01");
        PesertaUmum u1 = new PesertaUmum("67890", "Santi", "santi@mail.com");

        // 4. Proses Registrasi & Pembayaran
        // Rizky (Member) daftar Java Programming
        Registrasi reg1 = new Registrasi("2023-11-01", p1, m1);
        reg1.prosesPembayaran("2023-11-02", "Transfer BCA"); // Non-Tunai (Overloading)
        m1.tambahRegistrasi(reg1);

        // Santi (Umum) daftar Webinar AI
        Registrasi reg2 = new Registrasi("2023-11-05", p2, u1);
        reg2.prosesPembayaran("2023-11-05"); // Tunai (Overloading)
        u1.tambahRegistrasi(reg2);

        // 5. Menampilkan Output
        System.out.println("=== OUTPUT DETAIL PELATIHAN ===");
        p1.tampilkanDetail();
        p2.tampilkanDetail();

        System.out.println("\n=== OUTPUT DETAIL PESERTA & TRANSAKSI ===");
        m1.tampilkanDetailPeserta();
        System.out.println();
        u1.tampilkanDetailPeserta();
    }
}


/*
Penjelasan Logika:
Polimorfisme: Saat m1.tampilkanInfoPeserta() dipanggil, sistem secara otomatis menghitung diskon 15% karena m1 adalah objek PesertaMember. Sebaliknya, u1 mendapatkan diskon 0.
Encapsulation: Semua data diakses melalui method, bukan langsung ke atribut private.
Overloading: Terlihat pada reg1.prosesPembayaran yang menggunakan 2 parameter (Non-tunai) dan reg2.prosesPembayaran yang menggunakan 1 parameter (Tunai).
Static: Jika Pelatihan.setPajak(11.0) dipanggil, maka otomatis perhitungan reg1 dan reg2 akan berubah saat dijalankan ulang.
*/