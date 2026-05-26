/*
 * File        : Mahasiswa.java
 * Deskripsi   : Berisi atribut dan method dalam class Mahasiswa
 * Pembuat     : Andiny Khaerany Suhartady
 * Tanggal     : 8 Maret 2026
 */


import java.util.ArrayList;

// Class Mahasiswa
class Mahasiswa {

    // Atribut
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    
    public Mahasiswa() {
        this.listMatKul = new ArrayList<>();
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
    }

    //Getter/Selektor
    public String getNim() { 
        return nim; 
    }

    public String getNama() { 
        return nama; 
    }

    public String getProdi() { 
        return prodi; 
    }

    public Dosen getDosenWali() { 
        return dosenWali; 
    }

    public Kendaraan getKendaraan() { 
        return kendaraan; 
    }

    //Setter/Mutator
    public void setNim(String nim) { 
        this.nim = nim; 
    }

    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public void setProdi(String prodi) { 
        this.prodi = prodi; 
    }

    public void setDosenWali(Dosen dosenWali) { 
        this.dosenWali = dosenWali; 
    }

    public void setKendaraan(Kendaraan kendaraan) { 
        this.kendaraan = kendaraan; 
    }

    // Method menambah mata kuliah
    public void addMatKul(MataKuliah newMatKul) {
        listMatKul.add(newMatKul);
    }
    
    public int getJumlahMatKul(){
        return listMatKul.size();
    }

    public int getJumlahSKS(){
        int total = 0;
        for(int i = 0; i < listMatKul.size(); i++){
            total += listMatKul.get(i).getSks();
        }
            return total;
    }

    // Print detail mahasiswa
    public void printDetailMhs() {

        System.out.println("Nim  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi: " + prodi);

        System.out.println("\nDaftar Mata Kuliah:");

        for(int i = 0; i < listMatKul.size(); i++){
            System.out.println("- " + listMatKul.get(i).getNama());
        }

        if(dosenWali != null){
            System.out.println("\nDosen Wali: " + dosenWali.getNama());
        }

        if(kendaraan != null){
            System.out.println("Kendaraan : " + kendaraan.getJenis() +
                               " (" + kendaraan.getNoPlat() + ")");
        }
    }
}
