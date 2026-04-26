class PenyalahgunaanObat extends Masalah {
    private String jenisObat;
    private int lamaPenyalahgunaan;

    public PenyalahgunaanObat(String id, String deskripsi, String jenis, int lama) {
        super(id, deskripsi);
        this.jenisObat = jenis;
        this.lamaPenyalahgunaan = lama;
    }

 
    @Override
    public String getDetailMasalah() {
    return "Penyalahgunaan Obat: " + deskripsi +
           " (Jenis: " + jenisObat +
           ", Lama: " + lamaPenyalahgunaan + " bulan)";
}
}

