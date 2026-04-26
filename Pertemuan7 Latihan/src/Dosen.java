/*
 * File : Dosen.java
 * Nama : Andiny Khaerany Suhartady
 * NIM  : 24060124140194
 * Tanggal : 26 April 2026
 * Deskripsi :Kelas turunan dari CivitasAkademika yang merepresentasikan dosen dengan atribut NIP
 */

class Dosen extends CivitasAkademika {
    private String nip;
    
    public Dosen (String nama, String nip){
        super(nama);
        this.nip = nip;
    }

    @Override
    public String getNomor(){
        return nip;
    }
}
