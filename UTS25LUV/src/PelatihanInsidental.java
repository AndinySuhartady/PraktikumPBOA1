class PelatihanInsidental extends Pelatihan {
    private String tanggal, format;

    public PelatihanInsidental(String kode, String nama, int kuota, String instruktur,
                               double harga, String tanggal, String format) {
        super(kode, nama, kuota, instruktur, harga);
        this.tanggal = tanggal;
        this.format = format;
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("=== Pelatihan Insidental ===");
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Instruktur: " + namaInstruktur);
        System.out.println("Kuota: " + kuota);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Format: " + format);
        System.out.println("Harga: " + harga);
        System.out.println("Pajak: " + pajakPersen + "%");
        System.out.println("Harga Akhir: " + hitungHargaAkhir());
    }
}