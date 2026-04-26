/*
Lengkapilah setiap kelas dengan atribut beserta tipe datanya, konstruktor, dan semua method yang relevan.
 Untuk konstruktor dan method tuliskan secara lengkap signature-nya!
*/


/*
Berdasarkan deskripsi kasus di atas, berikut adalah rincian Atribut dan Method untuk setiap kelas dengan menerapkan prinsip PBO (Encapsulation, Inheritance, Overloading, dan Overriding):
1. Class Pelatihan (Superclass)
    Atribut:
private String kode
private String nama
private int kuota
private String namaInstruktur
private double harga
private static double pajakPersen (Static agar bisa diubah massal sesuai aturan LPK)
    Method:
public Pelatihan(...) (Konstruktor)
public abstract void tampilkanDetail() (Method abstrak untuk Overriding)
public static void setPajak(double pajak) (Untuk mengubah nilai pajak secara global)
public double getHarga() & public double getPajak() (Getter/Setter untuk Encapsulation)

2. Class PelatihanReguler (Subclass)
    Atribut:
private int durasi (3 atau 6 bulan)
private String level (Basic, Intermediate, Advance)
private String metodeKursus (Privat atau Kelompok)
    Method:
@Override public void tampilkanDetail() (Menampilkan info umum + durasi, level, metode)

3. Class PelatihanInsidental (Subclass)
    Atribut:
private String tanggal
private String jenisPelaksanaan (Online atau Offline)
    Method:
@Override public void tampilkanDetail() (Menampilkan info umum + tanggal dan jenis pelaksanaan)

4. Class Peserta (Superclass)
    Atribut:
private String noKTP, nama, email
    Method:
public Peserta(...) (Konstruktor)
public abstract double hitungDiskon(double harga) (Method abstrak untuk Overriding)

5. Class PesertaMember (Subclass)
    Atribut:
private String nomorAnggota
private String tanggalBergabung
private static double diskonPersen (Static untuk kebijakan diskon LPK)
    Method:
public static void setDiskon(double diskon)
@Override public double hitungDiskon(double harga) (Mengembalikan nilai diskon sesuai % member)

6. Class PesertaUmum (Subclass)
    Method:
@Override public double hitungDiskon(double harga) (Selalu mengembalikan 0 karena tidak ada diskon)

7. Class Registrasi (Association Class)
    Atribut:
private String tanggalRegistrasi, tanggalBayar, metodePembayaran
private Pelatihan pelatihan (Asosiasi ke objek Pelatihan)
private Peserta peserta (Asosiasi ke objek Peserta)
    Method:
public double hitungHargaAkhir() (Logika: (Harga - Diskon) + Pajak)
public void bayar(String tanggal) (Overloading - untuk pembayaran Tunai)
public void bayar(String tanggal, String infoBank) (Overloading - untuk pembayaran Non-tunai)
public void tampilkanDetailRegistrasi() (Menampilkan data peserta, pelatihan, dan rincian bayar)
*/



/*
abstract class Pelatihan {
    private String kode;
    private String nama;
    private int kuota;
    private String namaInstruktur;
    private double harga;
    private static double pajakPersen; // Static agar nilai seragam & bisa diubah-ubah

    // Konstruktor
    public Pelatihan(String kode, String nama, int kuota, String namaInstruktur, double harga) { }

    // Method Signature
    public static void setPajak(double pajak) { } // Untuk mengubah aturan pajak LPK
    public double getPajak() { return pajakPersen; }
    public abstract void tampilkanDetail(); // Overriding di subclass
    public double hitungHargaSetelahPajak() { return harga + (harga * pajakPersen / 100); }
    
    // Getter & Setter (Encapsulation)
    public String getKode() { }
    public double getHarga() { }
}

class PelatihanReguler extends Pelatihan {
    private int durasiBulan; // 3 atau 6
    private String level; // Basic, Intermediate, Advance
    private String metode; // Privat atau Kelompok

    public PelatihanReguler(String kode, String nama, int kuota, String instruktur, double harga, int durasi, String level, String metode) { }

    @Override
    public void tampilkanDetail() { }
}

class PelatihanInsidental extends Pelatihan {
    private String tanggalLaksana;
    private String format; // Online atau Offline

    public PelatihanInsidental(String kode, String nama, int kuota, String instruktur, double harga, String tanggal, String format) { }

    @Override
    public void tampilkanDetail() { }
}

abstract class Peserta {
    private String noKTP;
    private String nama;
    private String email;
    private Registrasi[] daftarRegistrasi; // Maksimal 3 (Array/List)

    public Peserta(String noKTP, String nama, String email) { }

    public abstract double hitungDiskon(double harga); // Overriding untuk member vs umum
    public abstract void tampilkanInfoPeserta();
    
    // Getter & Setter
}
class PesertaMember extends Peserta {
    private String noAnggota;
    private String tanggalBergabung;
    private static double diskonMemberPersen; // Static agar mudah diubah-ubah

    public PesertaMember(String noKTP, String nama, String email, String noAnggota, String tglGabung) { }

    public static void setDiskonMember(double diskon) { } 

    @Override
    public double hitungDiskon(double harga) { return harga * (diskonMemberPersen / 100); }

    @Override
    public void tampilkanInfoPeserta() { }
}

class PesertaUmum extends Peserta {
    public PesertaUmum(String noKTP, String nama, String email) { }

    @Override
    public double hitungDiskon(double harga) { return 0; } // Peserta umum 0% diskon

    @Override
    public void tampilkanInfoPeserta() { }
}

class Registrasi {
    private String tglRegistrasi;
    private String tglBayar;
    private String metodeBayar; // Tunai atau Non-tunai
    private Pelatihan pelatihan;
    private Peserta peserta;

    public Registrasi(String tglRegistrasi, Pelatihan pelatihan, Peserta peserta) { }

    // Overloading Method Pembayaran
    public void prosesPembayaran(String tglBayar) { } // Default Tunai
    public void prosesPembayaran(String tglBayar, String detailBank) { } // Overloading untuk Non-tunai

    public double hitungTotalBayar() {
        double hargaAwal = pelatihan.getHarga();
        double diskon = peserta.hitungDiskon(hargaAwal);
        double pajak = hargaAwal * (pelatihan.getPajak() / 100);
        return (hargaAwal - diskon) + pajak;
    }

    public void tampilkanStruk() { }
}


*/
public class Soal3 {
    
}
