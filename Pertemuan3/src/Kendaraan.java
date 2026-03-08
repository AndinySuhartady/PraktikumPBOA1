/*
 * File        : Kendaraan.java
 * Deskripsi   : Berisi atribut dan method dalam class Kendaraan
 * Pembuat     : Andiny Khaerany Suhartady
 * Tanggal     : 8 Maret 2026
 */

// Class Kendaraan
class Kendaraan {
    //Atribut
    private String noPlat;
    private String jenis; 

    public Kendaraan() {
        //Konstruktor tanpa parameter
    }

        // Konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    //Getter/Selektor
    public String getNoPlat() { 
        return noPlat; 
    }
    public String getJenis() { 
        return jenis; 
    }

    //Setter/Mutator
    public void setNoPlat(String noPlat) { 
        this.noPlat = noPlat;
    }
    public void setJenis(String jenis) { 
        this.jenis = jenis; 
    }
}