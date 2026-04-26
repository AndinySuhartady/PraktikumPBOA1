// ================= MAIN PROGRAM =================
public class MainPBO {
    public static void main(String[] args) {

        // Membuat objek Fakultas
        Fakultas fsm = new Fakultas("Sains dan Matematika", 5000000, 4500000);

        // ================= MAHASISWA =================
        Mahasiswa m1 = new Mahasiswa("Budi", "budi@email.com", "240101", 4, fsm);
        Mahasiswa m2 = new Mahasiswa("Siti", "siti@email.com", "240102", 2, fsm);

        m1.tampilkanInfo();
        System.out.println("------------------------");
        m2.tampilkanInfo();

        System.out.println("Jumlah Mahasiswa: " + Mahasiswa.getCounterMahasiswa());

        // ================= DOSEN =================
        Dosen d1 = new Dosen("Dr. Andi", "andi@email.com", "198501", 10, fsm);

        System.out.println();
        d1.tampilkanInfo();

        System.out.println("Jumlah Dosen: " + Dosen.getCounterDosen());

    }
}
