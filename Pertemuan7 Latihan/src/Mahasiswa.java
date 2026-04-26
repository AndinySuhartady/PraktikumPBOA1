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
