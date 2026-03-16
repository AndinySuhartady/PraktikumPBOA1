/*
 * File        : MataKuliah.java
 * Deskripsi   : Berisi atribut dan method dalam class MataKuliah
 * Pembuat     : Andiny Khaerany Suhartady
 * Tanggal     : 8 Maret 2026
 */

// Class MataKuliah
class MataKuliah {
    //Atribut
    private String idMatKul;
    private String nama;
    private int sks;

    public MataKuliah() {
        //Konstruktor tanpa parameter
    }

    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    //Getter/Selektor
    public String getIdMatKul() { 
        return idMatKul; 
    }


    public String getNama() { 
        return nama; 
    }

    public int getSks() { 
        return sks; 
    }


     //Setter/Mutator
     
    public void setIdMatKul(String idMatKul) { 
        this.idMatKul = idMatKul; 
    }

    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public void setSks(int sks) { 
        this.sks = sks; 
    }
}


