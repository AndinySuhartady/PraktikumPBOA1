/*
 * File : MainPiaraan.java
 * Nama : Andiny Khaerany Suhartady
 * NIM  : 24060124140194
 * Tanggal : 9 Mei 2026
 * Deskripsi : Aplikasi kelas Piaraan
 */

public class MainPiaraan {
    public static void main(String[] args) {

        Piaraan p = new Piaraan();

        // Membuat objek Anabul
        Kucing k1 = new Kucing("Cathryine", 3.5);
        Kucing k2 = new Kucing("Beilsya", 4.2);
        Anjing a1 = new Anjing("Agasjana", 6.8);
        Burung b1 = new Burung("Nelyva", 1.1);

        // enqueue
        p.enqueueAnabul(k1);
        p.enqueueAnabul(k2);
        p.enqueueAnabul(a1);
        p.enqueueAnabul(b1);

        // jumlah elemen
        System.out.println("Jumlah Anabul : " + p.getNbelm());

        // showAnabul
        System.out.println("\nDaftar Anabul:");
        p.showAnabul();

        // isMember
        System.out.println("\nApakah Agasjana ada?");
        System.out.println(p.isMember(a1));

        // getAnabul
        System.out.println("\nAnabul pertama:");
        System.out.println(p.getAnabul().getNama());

        // countKucing
        System.out.println("\nJumlah keluarga kucing:");
        System.out.println(p.countKucing());

        // bobotKucing
        System.out.println("\nTotal bobot kucing:");
        System.out.println(p.bobotKucing());

        // showJenisAnabul
        System.out.println("\nJenis setiap Anabul:");
        p.showJenisAnabul();

        // dequeue
        System.out.println("\nDequeue:");
        Anabul keluar = p.dequeueAnabul();
        System.out.println(keluar.getNama() + " keluar dari antrean");

        // antrean terbaru
        System.out.println("\nAntrean terbaru:");
        p.showAnabul();

        System.out.println("\nJumlah Anabul sekarang:");
        System.out.println(p.getNbelm());
    }
}


// Renungan : Simpulkan bagaimana cara kerja konsep Koleksi sesuai kalimat Anda sendiri!
// Laporkan hasil kerja Anda sesuai petunjuk Asisten!

// Menurut saya, konsep koleksi pada Java digunakan untuk menyimpan dan mengelola banyak data atau objek dalam satu wadah secara lebih fleksibel dibanding array biasa. 
// Dengan koleksi, data dapat ditambah, dihapus, dicari, maupun ditampilkan dengan lebih mudah menggunakan method yang sudah tersedia pada framework Java. Pada praktikum ini, koleksi digunakan untuk menyimpan daftar nama teman menggunakan ArrayList serta antrean hewan menggunakan Queue dan LinkedList. 
// Konsep koleksi juga mempermudah pengelolaan objek dalam pemrograman berorientasi objek karena dapat bekerja dengan berbagai tipe data dan class bentukan sendiri.