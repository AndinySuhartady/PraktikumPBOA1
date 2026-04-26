class Registrasi {
    private String tglRegistrasi, tglBayar, metodeBayar;
    private Pelatihan pelatihan;
    private Peserta peserta;

    public Registrasi(String tgl, Pelatihan p, Peserta ps) {
        this.tglRegistrasi = tgl;
        this.pelatihan = p;
        this.peserta = ps;
    }

    // Overloading
    public void prosesPembayaran(String tglBayar) {
        this.tglBayar = tglBayar;
        this.metodeBayar = "Tunai";
    }

    public void prosesPembayaran(String tglBayar, String metode) {
        this.tglBayar = tglBayar;
        this.metodeBayar = metode;
    }

    public double kalkulasiTotal() {
        double hrg = pelatihan.getHarga();
        double diskon = peserta.hitungDiskon(hrg);
        double pajak = hrg * pelatihan.getPajak() / 100;
        return hrg - diskon + pajak;
    }

    public void tampilkanInfoBayar() {
        System.out.println("- Pelatihan: " + pelatihan.getNama());
        System.out.println("  Total: " + kalkulasiTotal());
        System.out.println("  Metode Bayar: " + metodeBayar);
        System.out.println("  Tanggal Bayar: " + tglBayar);
}
}