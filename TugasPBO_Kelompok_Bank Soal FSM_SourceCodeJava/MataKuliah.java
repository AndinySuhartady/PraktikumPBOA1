/*
Kelompok PBO:
1. Agung Rama Pramana Putra (24060124120007)
2. Andiny Khaerany Suhartady (24060124140194)
3. Cindy Kurniawan (24060124140201)
4. Jessica Laurencia Panjaitan (24060124130084)
5. Putri Elizabeth Simanjuntak (24060124120018)
*/



import java.util.ArrayList;

public class MataKuliah {
    private int idMK;
    private String namaMK;
    private ArrayList<Konten> listKonten;

    public MataKuliah(int kode, String nama){
        this.idMK = kode;
        this.namaMK = nama;
        listKonten = new ArrayList<>();
    }

    //setter & getter
    public void setIdMK(int kode){
        this.idMK = kode;
    }

    public int getIdMk(){
        return this.idMK;
    }

    public void setNamaMK( String nama){
        this.namaMK = nama;
    }

    public String getNamaMK(){
        return this.namaMK;
    }

    public ArrayList<Konten> getListKonten(){ 
        return listKonten; 
    }

    public void tambahKonten(Konten k){ 
        listKonten.add(k); 
    }

}
