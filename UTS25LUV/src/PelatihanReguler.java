class PelatihanReguler extends Pelatihan {
    private int durasi;
    private String level, metode;

    public PelatihanReguler(String kode, String nama, int kuota, String instruktur,
                            double harga, int durasi, String level, String metode) {
        super(kode, nama, kuota, instruktur, harga);
        this.durasi = durasi;
        this.level = level;
        this.metode = metode;
    }

   @Override
    public void tampilkanDetail() {
        System.out.println("=== Pelatihan Reguler ===");
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Instruktur: " + namaInstruktur);
        System.out.println("Kuota: " + kuota);
        System.out.println("Durasi: " + durasi + " bulan");
        System.out.println("Level: " + level);
        System.out.println("Metode: " + metode);
        System.out.println("Harga: " + harga);
        System.out.println("Pajak: " + pajakPersen + "%");
        System.out.println("Harga Akhir: " + hitungHargaAkhir());
    }
}