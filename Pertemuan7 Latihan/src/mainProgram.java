/*
 * File : mainProgram.java
 * Nama : Andiny Khaerany Suhartady
 * NIM  : 24060124140194
 * Tanggal : 26 April 2026
 * Deskripsi :Program utama untuk menguji registrasi peserta seminar, relasi dosen-mahasiswa, dan polimorfisme
 */


public class mainProgram {
    public static void main(String[]args){
        Seminar seminar = new Seminar();

        // 2 objek Dosen
        Dosen d1 = new Dosen("Pak Michael", "198001");
        Dosen d2 = new Dosen("Bu Amlana", "198002");

        // 5 objek Mahasiswa (pakai objek dosen)
        Mahasiswa m1 = new Mahasiswa("Evielashta", "22001", d1);
        Mahasiswa m2 = new Mahasiswa("Loeunsi", "22002", d2);
        Mahasiswa m3 = new Mahasiswa("Dirlia", "22003", d1);
        Mahasiswa m4 = new Mahasiswa("Chiead", "22004", d2);
        Mahasiswa m5 = new Mahasiswa("Beine", "22005", d1);

        // Registrasi semua peserta
        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(m1);
        seminar.registrasi(m2);
        seminar.registrasi(m3);
        seminar.registrasi(m4);
        seminar.registrasi(m5);

        // Tampilkan peserta
        seminar.tampilPeserta();

        // Jumlah peserta
        System.out.println("Jumlah peserta: " + seminar.countPeserta());

        // Jumlah Mahasiswa
        System.out.println("Jumlah mahasiswa: " + seminar.countMahasiswa());

        // Uji setWali 
        m1.setWali(d2); // set wali Evielashta

        System.out.println("Wali baru Evielashta: " + d2.getNama());

        System.out.println("\nData Mahasiswa:");
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}


// Renungan: Simpulkan bagaimana cara kerja Polimorfisme sesuai kalimat Anda sendiri!

//Polimorfisme artinya satu tipe data bisa dipakai untuk berbagai objek yang berbeda, tapi hasilnya bisa berbeda tergantung objeknya.
//Di program ini, semua peserta disimpan sebagai CivitasAkademika, tapi sebenarnya isinya ada Dosen dan Mahasiswa.
//Saat method getNomor() dipanggil, hasilnya beda-beda: kalau objeknya Dosen akan menampilkan NIP, kalau Mahasiswa menampilkan NIM.
//Jadi walaupun dipanggil dengan cara yang sama, hasilnya bisa berbeda. Itu yang disebut polimorfisme.
