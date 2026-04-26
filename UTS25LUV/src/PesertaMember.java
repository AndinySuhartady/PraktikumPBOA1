// Subclass Peserta Member
class PesertaMember extends Peserta {
    private String noAnggota, tglBergabung;
    private static double diskonMember = 10.0;

    public PesertaMember(String ktp, String nama, String email,
                         String noAnggota, String tgl) {
        super(ktp, nama, email);
        this.noAnggota = noAnggota;
        this.tglBergabung = tgl;
    }

    public static void setDiskonMember(double d) {
        diskonMember = d;
    }

    @Override
    public double hitungDiskon(double harga) {
        return harga * diskonMember / 100;
    }
}