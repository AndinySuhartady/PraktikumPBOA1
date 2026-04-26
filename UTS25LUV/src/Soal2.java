/*
Jelaskan relasi antar kelas yang dibuat pada nomor1
*/

public class Soal2 {
    
}


/*
1. Pelatihan (Generalization / Inheritance)
Relasi: Kelas Pelatihan bertindak sebagai Superclass (induk), sedangkan PelatihanReguler dan PelatihanInsidental adalah Subclass (anak).
Penjelasan: Konsep Inheritance digunakan karena kedua jenis pelatihan berbagi atribut umum (kode, nama, harga, pajak), namun memiliki spesifikasi berbeda (durasi/level vs tanggal/lokasi). Ini memungkinkan penggunaan Overriding pada metode tampilkanDetail().
2. Peserta (Generalization / Inheritance)
Relasi: Kelas Peserta adalah Superclass, sedangkan PesertaUmum dan PesertaMember adalah Subclass.
Penjelasan: Keduanya mewarisi atribut KTP, Nama, dan Email. Pembedanya adalah PesertaMember memiliki atribut tambahan (No Anggota) dan logika Overriding pada metode hitung harga untuk menyertakan diskon member.
3. Registrasi (Association / Association Class)
Relasi: Hubungan antara Peserta dan Pelatihan.
Penjelasan: Relasi ini bersifat Association (Asosiasi). Karena setiap registrasi harus mencatat data unik (tanggal daftar, tanggal bayar, metode bayar), kelas Registrasi berfungsi sebagai penghubung.
Multiplisitas: Satu Peserta dapat memiliki relasi dengan maksimal 3 objek Pelatihan sekaligus (sesuai batasan soal).
4. Relasi Statis (Encapsulation)
Relasi: Variabel Pajak dan Diskon.
Penjelasan: Meskipun bukan relasi antar objek fisik, terdapat hubungan ketergantungan di mana nilai pajak dan diskon bersifat Class-level (static). Perubahan pada nilai ini di satu tempat akan berdampak pada seluruh perhitungan harga akhir di objek terkait.
*/


