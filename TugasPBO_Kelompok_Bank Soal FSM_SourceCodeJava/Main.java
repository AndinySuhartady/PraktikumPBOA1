/*
Kelompok PBO:
1. Agung Rama Pramana Putra (24060124120007)
2. Andiny Khaerany Suhartady (24060124140194)
3. Cindy Kurniawan (24060124140201)
4. Jessica Laurencia Panjaitan (24060124130084)
5. Putri Elizabeth Simanjuntak (24060124120018)
*/


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // ======= USER =======
        Mahasiswa mhs = new Mahasiswa(1, "Andi", "andi@gmail.com", "andi123");
        Admin adm = new Admin(2, "Budi", "budi@gmail.com", "budi123");

        System.out.println("=== LOGIN ===");
        mhs.login("andi123");
        mhs.login("salah");
        adm.logout();

        // ======= BUAT KONTEN =======
        System.out.println("\n=== BUAT KONTEN ===");
        Soal soal = new Soal(1, "Soal UTS PBO", "2024-01-01", "/files/soal.pdf", "UTS", 2024);
        Soal soal2 = new Soal(2, "Soal UAS PBO", "2023-06-01", "/files/soal2.pdf", "UAS", 2023);
        Materi materi = new Materi(3, "Slide PBO", "2024-01-01", "/files/materi.ppt", "PPT");
        Kuis kuis = new Kuis(4, "Kuis PBO Bab 1", "2024-01-01", "/files/kuis.pdf");
        System.out.println("Soal jenis: " + soal.getJenisUjian() + ", tahun: " + soal.getTahun());
        System.out.println("Materi tipe: " + materi.getTipeFile());

        // ======= MATAKULIAH =======
        System.out.println("\n=== MATAKULIAH ===");
        MataKuliah mk = new MataKuliah(1, "Pemrograman Berorientasi Objek");
        mk.tambahKonten(soal);
        mk.tambahKonten(soal2);
        mk.tambahKonten(materi);
        mk.tambahKonten(kuis);
        System.out.println("MataKuliah: " + mk.getNamaMK());
        System.out.println("Jumlah konten: " + mk.getListKonten().size());

        // ======= KUIS DENGAN LATIHAN SOAL =======
        System.out.println("\n=== KUIS ===");
        LatihanSoal ls1 = new LatihanSoal();
        ls1.setId(1);
        ls1.setPertanyaan("Apa kepanjangan OOP?");
        ls1.setJawaban("Object Oriented Programming");

        LatihanSoal ls2 = new LatihanSoal();
        ls2.setId(2);
        ls2.setPertanyaan("Apa itu inheritance?");
        ls2.setJawaban("Pewarisan");

        kuis.tambahSoal(ls1);
        kuis.tambahSoal(ls2);
        kuis.mulaiKuis();

        ArrayList<String> jawabanUser = new ArrayList<>();
        jawabanUser.add("Object Oriented Programming");
        jawabanUser.add("Salah");
        kuis.cekJawaban(jawabanUser);

        // ======= UPLOAD & DOWNLOAD =======
        System.out.println("\n=== UPLOAD & DOWNLOAD ===");
        mhs.uploadKonten(soal);
        mhs.uploadKonten(soal2);
        mhs.uploadKonten(materi);
        mhs.downloadKonten(materi);

        // ======= OVERLOADING CARI KONTEN =======
        System.out.println("\n=== CARI KONTEN (OVERLOADING) ===");
        mhs.cariKonten("PBO");
        mhs.cariKonten("PBO", "Soal");
        mhs.cariKonten("PBO", 2024);

        // ======= EXCEPTION =======
        System.out.println("\n=== EXCEPTION ===");
        try {
            new Soal(99, "Soal Gagal", "2024-01-01", "/files/gagal.pdf", "MID", 2024);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        try {
            new Materi(99, "Materi Gagal", "2024-01-01", "/files/gagal.doc", "DOCX");
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // ======= ADMIN =======
        System.out.println("\n=== ADMIN ===");
        adm.verifikasiKonten(soal);
        adm.updateKonten(materi);
        adm.hapusKonten(kuis);
    }
}