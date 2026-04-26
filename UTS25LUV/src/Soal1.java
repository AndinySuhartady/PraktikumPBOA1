/*
SOAL URAIAN:
Untuk soal nomor 1-6 perhatikan contoh kasus berikut:
Sebuah Lembaga Penyedia Kursus (LPK) menyediakan dua jenis pelatihan, yaitu reguler dan insidental. Setiap jenis pelatihan memiliki informasi kode, nama, kuota, nama instruktur, harga dan pajak, Pelatihan regular dilaksanakan selama durasi waktu tertentu (3 atau 6 bulan), memiliki 3 jenis level (baric, intermediate, atau advance), serta metode kursus privat atau kelompok. 
Pelatihan insidental hanya dilakukan pada tanggal tertentu dan bisa diselenggarakan secara online ataupun offline. Semua pelatihan memiliki besaran pajak (%) yang sama, namun nilai pajak ini nantinya dapat diubah-ubah untuk disesuaikan dengan aturan yang berlaku.Selanjutnya, untuk peserta pelatihan terdapat kategori peserta umum dan peserta member. Semua peserta memiliki informasi nomor KTP, nama, dan email, sedangkan peserta member memiliki nomor anggota dan tanggal mulai bergabung. Semua peserta member mendapat diskon (%) yang sama untuk semua jenis pelatihan yang diikuti, dan besaran diskon ini nantinya juga dapat diubah-ubah menyesuaikan kebijakan LPK. 
Peserta umum tidak mendapatkan diskon.Harga akhir pelatihan yang harus dibayar peserta adalah harga dikurangi dengan diskon (%) dikalikan harga, lalu ditambah dengan pajak (%) dikalikan harga pelatihan.
Setiap peserta dapat mendaftar maksimal 3 jenis pelatihan sekaligus. Lalu, pada saat registrasi akan dicatat tanggal registrasi, tanggal bayar, dan metode pembayaran (tunai atau non-tunai).Diharapkan dari objek pelatihan dapat menampilkan informasi detail setiap pelatihan, meliputi kode, nama, jenis (reguler atau insidental), kuota, harga, pajak dan harga akhir setelah dikurangi pajak, serta informasi tambahan sesuai dengan jenis pelatihannya. Kemudian pada objek peserta juga dapat menampilkan semua detail data peserta dan semua data pelatihan yang didaftar beserta informasi pembayarannya (harga awal, diskon, pajak, harga akhir, tanggal bayar dan metode pembayaran).


1. (CPMK05-2 dan CPMK10-2 (1,2) bobot 10%) Desainlah class diagram yang tepat untuk kasus tersebut dengan menerapkan konsep enkapuslasi, pewarisan, overloading, dan overriding dalam paradigma pemrograman berorientasi objek. Class diagram yang dibuat harus memuat semua kelas yang diperlukan beserta relasi antar kelas yang ada. Untuk mempermudah penggambaran pada bagian kelas cukup dituliskan nama kelasnya saja!
*/

public class Soal1{

}


/*
Struktur Class Diagram
    Pelatihan (Base Class / Parent)
        Turunan (Inheritance): PelatihanReguler dan PelatihanInsidental.
        Encapsulation: Atribut harga dan pajak (statis/global) diset private dengan getter/setter.
        Overriding: Method tampilkanDetail() dan hitungHargaAkhir().
    Peserta (Base Class / Parent)
        Turunan (Inheritance): PesertaUmum dan PesertaMember.
        Encapsulation: Data pribadi (KTP, Nama) diset private.
        Overriding: Method hitungDiskon().
    Registrasi (Association Class)
        Menghubungkan Peserta dan Pelatihan.
        Menampung atribut transaksi: tanggal registrasi, tanggal bayar, dan metode pembayaran.
        Overloading: Method bayar(tunai) dan bayar(non-tunai, detailBank).
*/

/*
classDiagram
    class Pelatihan {
        <<abstract>>
    }
    class PelatihanReguler {
    }
    class PelatihanInsidental {
    }
    class Peserta {
        <<abstract>>
    }
    class PesertaUmum {
    }
    class PesertaMember {
    }
    class Registrasi {
    }

    Pelatihan <|-- PelatihanReguler : Inheritance
    Pelatihan <|-- PelatihanInsidental : Inheritance
    Peserta <|-- PesertaUmum : Inheritance
    Peserta <|-- PesertaMember : Inheritance
    
    Peserta "1" -- "0..3" Registrasi : Mendaftar
    Registrasi "0..*" -- "1" Pelatihan : Terkait

*/


/*
Poin Penting Implementasi PBO:

Encapsulation: 
    Semua atribut menggunakan akses modifier private dan diakses melalui public getter/setter. Variabel pajak dan diskon member sebaiknya menggunakan keyword static agar nilainya seragam dan mudah diubah-ubah sesuai kebijakan LPK.
Inheritance: 
    Mengelompokkan atribut umum (KTP, Nama) ke dalam superclass Peserta agar kode lebih efisien.
Overriding: 
    Method hitungHargaAkhir() didefinisikan ulang di kelas anak untuk menyesuaikan apakah ada komponen diskon member atau tidak.
Overloading:   
    Pada kelas Registrasi, method pembayaran dapat memiliki parameter berbeda tergantung metode yang dipilih (tunai atau non-tunai).
*/