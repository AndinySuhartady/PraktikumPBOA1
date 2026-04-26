class PergaulanBebas extends Masalah {
    private String keterangan;

    public PergaulanBebas(String id, String deskripsi, String keterangan) {
        super(id, deskripsi);
        this.keterangan = keterangan;
    }

    @Override
    public String getDetailMasalah() {
        return "Pergaulan Bebas: " + keterangan;
    }
}