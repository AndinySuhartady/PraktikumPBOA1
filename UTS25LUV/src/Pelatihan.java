abstract class Pelatihan {
    protected String kode, nama, namaInstruktur;
    protected int kuota;
    protected double harga;
    protected static double pajakPersen = 10.0;

    public Pelatihan(String kode, String nama, int kuota, String instruktur, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.kuota = kuota;
        this.namaInstruktur = instruktur;
        this.harga = harga;
    }

    public static void setPajak(double pajak) {
        pajakPersen = pajak;
    }

    public double getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    }

    public double getPajak() {
        return pajakPersen;
    }

    public double hitungHargaAkhir() {
        return harga + (harga * pajakPersen / 100);
    }

    public abstract void tampilkanDetail();
}