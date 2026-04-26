class Dosen extends Pegawai {
    protected String fakultas;

    public Dosen(String nip, String nama, String tglLahir, String tmtBekerja, double gajiPokok, String fakultas) {
        super(nip, nama, tglLahir, tmtBekerja, gajiPokok);
        this.fakultas = fakultas;
    }
}