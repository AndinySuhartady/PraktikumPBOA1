/*
 * File : Seminar.java
 * Nama : Andiny Khaerany Suhartady
 * NIM  : 24060124140194
 * Tanggal : 26 April 2026
 * Deskripsi :Kelas untuk mengelola data peserta seminar menggunakan array CivitasAkademika dan menerapkan polimorfisme
 */

public class Seminar {
    private CivitasAkademika[] pesertas;
    private int banyakPeserta;

    //Konstruktor
    public Seminar (){
        pesertas = new CivitasAkademika[100]; //array statis 
        banyakPeserta = 0; 
    }

    public int countPeserta(){
        return banyakPeserta;
    }

    public void registrasi (CivitasAkademika p){
        if (banyakPeserta < pesertas.length){
            pesertas[banyakPeserta] = p; //Mengisi secara berurutan
            banyakPeserta++;
        } else {
            System.out.println("Seminar penuh!");
        }

    }

    public void tampilPeserta() {
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println(
                pesertas[i].getNama() + " - " + pesertas[i].getNomor()
            );
        }
    }

    public int countMahasiswa(){
        int jumlah = 0;

        for (int i = 0; i < banyakPeserta; i++){
            if (pesertas[i] instanceof Mahasiswa){
                jumlah++;
            }
        }

        return jumlah;
    }
}
