// ================= MAHASISWA =================
class Mahasiswa extends CivitasAkademika {
    private String nim;
    private int semester;
    private Fakultas fakultas;
    private static int counterMahasiswa = 0;

    // Overloading Constructor 1
    public Mahasiswa() {
        super("Unknown", "Unknown");
        counterMahasiswa++;
    }

    // Overloading Constructor 2
    public Mahasiswa(String nama, String email, String nim, int semester, Fakultas fakultas) {
        super(nama, email);
        this.nim = nim;
        this.semester = semester;
        this.fakultas = fakultas;
        counterMahasiswa++;
    }

    public double hitungUKT() {
        return fakultas.getTarifUKT() - (0.05 * semester * fakultas.getTarifUKT());
    }

    public void tampilkanUKT() {
        System.out.println("UKT Akhir: Rp" + hitungUKT());
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("Nama     : " + nama);
        System.out.println("Email    : " + email);
        System.out.println("NIM      : " + nim);
        System.out.println("Semester : " + semester);
        System.out.println("Fakultas : " + fakultas.getNamaFakultas());
        tampilkanUKT();
    }

    public static int getCounterMahasiswa() {
        return counterMahasiswa;
    }
}