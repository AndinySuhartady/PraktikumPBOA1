abstract class Masalah {
    protected String idMasalah;
    protected String deskripsi;

    public Masalah(String idMasalah, String deskripsi) {
        this.idMasalah = idMasalah;
        this.deskripsi = deskripsi;
    }

    // Metode virtual/abstrak yang wajib diisi oleh setiap subclass
    public abstract String getDetailMasalah();

    
}