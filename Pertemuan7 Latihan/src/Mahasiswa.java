/*
 * File : Mahasiswa.java
 * Nama : Andiny Khaerany Suhartady
 * NIM  : 24060124140194
 * Tanggal : 26 April 2026
 * Deskripsi :Kelas turunan dari CivitasAkademika yang merepresentasikan mahasiswa dengan atribut NIM dan dosen wali
 */

class Mahasiswa extends CivitasAkademika{
    private String nim;
    private Dosen dosenWali; //diubah menjadi objek

    public Mahasiswa (String nama, String nim, Dosen dosenWali){
        super(nama);
        this.nim = nim;
        this.dosenWali = dosenWali;
    }

    @Override
    public String getNomor(){
        return nim;
    }
    
    //Method setWali
    public void setWali(Dosen dosenBaru){
        this.dosenWali = dosenBaru;
    }

    public void tampilDataMahasiswa() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Dosen Wali: " + dosenWali.getNama());
    }
}
