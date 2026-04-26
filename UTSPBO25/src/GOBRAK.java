import java.util.List;
import java.util.ArrayList;

class Gobrak {
    private List<Remaja> daftarPeserta;

    public Gobrak() {
        daftarPeserta = new ArrayList<>();
    }

    public void tambahPeserta(Remaja r) {
        daftarPeserta.add(r);
    }

    public void tampilkanSemuaPeserta() {
        System.out.println("Jumlah Peserta: " + daftarPeserta.size());
        for (Remaja r : daftarPeserta) {
            r.tampilkanProfil();
            System.out.println("---------------------");
        }
    }

     /*
        public void tampilkanSemuaPeserta() {
            System.out.println("Jumlah Peserta: " + daftarPeserta.size());
            for (Remaja r : daftarPeserta) {
            r.tampilkanProfil();
            System.out.println("---------------------");
            }
        }
            */
}