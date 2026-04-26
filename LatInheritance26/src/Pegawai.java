import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class Pegawai {
    protected String nip, nama;
    protected LocalDate tglLahir, tmtBekerja;
    protected double gajiPokok;
    
    // Formatter untuk tanggal Indonesia (Contoh: 10 Mei 1960)
    protected DateTimeFormatter fmt = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));

    public Pegawai(String nip, String nama, String tglLahir, String tmtBekerja, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tglLahir = LocalDate.parse(tglLahir);
        this.tmtBekerja = LocalDate.parse(tmtBekerja);
        this.gajiPokok = gajiPokok;
    }

    public String getMasaKerja() {
    Period p = Period.between(tmtBekerja, LocalDate.of(2025, 3, 10));
    return p.getYears() + " tahun " + p.getMonths() + " bulan";
    }

    public int getMasaKerjaTahun() {
    return Period.between(tmtBekerja, LocalDate.of(2025, 3, 10)).getYears();
}

    public void printInfo() {
        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + tglLahir.format(fmt));
        System.out.println("TMT Bekerja     : " + tmtBekerja.format(fmt));
        System.out.printf("Gaji Pokok      : Rp %,.2f\n", gajiPokok);
        System.out.println("Masa Kerja : " + getMasaKerja());
    }
}