/*
Buatlah implementasi dari kelas yang merepresentasikan peserta dan kelas yang merepresentasikan pelatihan beserta subkelasnya (jika ada) dalam Bahasa Java sehingga pada pelatihan dapat menampilkan informasi detail pelatihan serta pada peserta dapat menampilkan detail data peserta dan semua pelatihan yang didaftar beserta metode pembayarannya!Untuk mempersingkat penulisan pada bagian ini method yang perlu diimplementasikan adalah 
method selain konstruktor, selektor (getter), dan mutator (setter). 
Pemanggilan konstruktor, selektor. atau mutator jika diperlukan menggunakan nama sesuai yang telah dibuat pada class diagram nomor2
*/


/*
Jelaskan bagaimana penerapan konsep enkapsulasi, overloading, dan overriding pada desain atau implementasi yang dibuat pada jawaban soal sebelumnya.
*/

/*
1. Enkapsulasi (Encapsulation)
Konsep ini diterapkan dengan menyembunyikan detail data dan hanya mengizinkan akses melalui metode tertentu.
Implementasi: Semua atribut seperti harga, pajakPersen, dan nama diatur dengan akses modifier private atau protected.
Tujuannya: Agar data tidak bisa diubah sembarangan dari luar kelas. Perubahan nilai (seperti mengubah tarif pajak atau diskon) dilakukan melalui Setter (setPajak()) dan pembacaan nilai melalui Getter (getHarga()).

2. Overloading
Konsep ini terjadi ketika sebuah kelas memiliki beberapa metode dengan nama yang sama tetapi signature (parameter) yang berbeda.
Implementasi: Pada kelas Registrasi, terdapat metode prosesPembayaran().
prosesPembayaran(String tgl) digunakan untuk pembayaran Tunai.
prosesPembayaran(String tgl, String detailBank) digunakan untuk pembayaran Non-tunai.
Tujuannya: Memberikan fleksibilitas bagi pengguna program untuk memilih cara bayar yang berbeda tanpa perlu menghafal banyak nama metode yang berbeda.

3. Overriding
Konsep ini terjadi ketika Subclass menulis ulang (mendefinisikan kembali) metode yang sudah ada di Superclass untuk memberikan logika yang lebih spesifik.
Implementasi:
Metode tampilkanDetail(): Kelas PelatihanReguler dan PelatihanInsidental menulis ulang metode ini agar bisa menampilkan info tambahan (durasi vs tanggal) yang tidak ada di kelas induk Pelatihan.
Metode hitungDiskon(): Kelas PesertaMember melakukan override untuk menghitung diskon 15%, sedangkan PesertaUmum melakukan override untuk mengembalikan nilai 0.
Tujuannya: Memastikan setiap objek berperilaku sesuai dengan identitas spesifiknya meskipun dipanggil dari tipe induk yang sama.
*/
public class Soal5_6 {
    
}
