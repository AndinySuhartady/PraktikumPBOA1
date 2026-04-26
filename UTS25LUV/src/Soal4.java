/*
Pada desain setiap kelas yang dibuat pada nomor 4, adakah atribut kelas yang berupa atribut static? 
Jika ada jelaskan atribut yang mana dan alasan kenapa atribut tersebut dijadikan sebagai atribut static?
*/


/*
Ya, terdapat atribut static pada desain kelas tersebut. Atribut static digunakan untuk data yang nilainya seragam (shared) bagi semua objek dalam satu kelas dan dapat diubah secara global.
Berdasarkan kasus LPK, berikut adalah atribut static yang digunakan:

1. Atribut pajakPersen pada Kelas Pelatihan

Letak: Kelas Pelatihan (Superclass).
Alasan: Soal menyatakan bahwa "Semua pelatihan memiliki besaran pajak (%) yang sama" dan nilai ini dapat "diubah-ubah untuk disesuaikan dengan aturan yang berlaku".
Fungsi Static: Jika pemerintah menaikkan pajak dari 10% ke 11%, kita cukup mengubah satu nilai di tingkat kelas, dan otomatis semua objek pelatihan (baik Reguler maupun Insidental) akan mengikuti aturan pajak yang baru tanpa harus mengubahnya satu per satu.

2. Atribut diskonMemberPersen pada Kelas PesertaMember

Letak: Kelas PesertaMember (Subclass).
Alasan: Soal menyatakan bahwa "Semua peserta member mendapat diskon (%) yang sama untuk semua jenis pelatihan" dan besaran ini dapat "diubah-ubah menyesuaikan kebijakan LPK".
Fungsi Static: Jika LPK ingin menaikkan diskon loyalitas member, perubahan cukup dilakukan sekali pada atribut static ini, sehingga seluruh objek member yang terdaftar langsung mendapatkan potongan harga yang sama.


Ringkasan Manfaat:
Efisiensi Memori: Nilai hanya disimpan satu kali di memori, bukan di setiap objek.
Konsistensi Data: Menjamin tidak ada perbedaan nilai pajak atau diskon antar peserta/pelatihan yang seharusnya mendapatkan tarif yang sama.

*/
public class Soal4 {
    
}
