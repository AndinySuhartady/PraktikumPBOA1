class Kekerasan extends Masalah {
    private int bulanKejadian;
    private int tahunKejadian;

    public Kekerasan(String id, String deskripsi, int bulan, int tahun) {
        super(id, deskripsi);
        this.bulanKejadian = bulan;
        this.tahunKejadian = tahun;
    }

    @Override
    public String getDetailMasalah() {
        return "Kekerasan: " + deskripsi + " (Terjadi: " + bulanKejadian + "/" + tahunKejadian + ")";
    }
}

