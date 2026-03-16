/*
 * File        : Dosen.java
 * Deskripsi   : Berisi atribut dan method dalam class Dosen
 * Pembuat     : Andiny Khaerany Suhartady
 * Tanggal     : 8 Maret 2026
 */

//Class Dosen
public class Dosen {

    // Atribut
    private String NIP;
    private String Nama;
    private String Prodi;


    public Dosen() {
        //Konstruktor tanpa parameter
    }

    // Konstruktor dengan parameter
    public Dosen(String NIP, String Nama, String Prodi){
        this.NIP = NIP;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }

    // Getter / Selektor
    public String getNIP(){
        return NIP;
    }

    public String getNama(){
        return Nama;
    }

    public String getProdi(){
        return Prodi;
    }

    // Setter / Mutator
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setProdi(String Prodi){
        this.Prodi = Prodi;
    }


    public void printDosen(){
        System.out.println("NIP: " + NIP);
        System.out.println("Nama : " + Nama);
        System.out.println("Prodi : " + Prodi);
    }

    
}

