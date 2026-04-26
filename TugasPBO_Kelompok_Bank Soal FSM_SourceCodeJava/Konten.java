/*
Kelompok PBO:
1. Agung Rama Pramana Putra (24060124120007)
2. Andiny Khaerany Suhartady (24060124140194)
3. Cindy Kurniawan (24060124140201)
4. Jessica Laurencia Panjaitan (24060124130084)
5. Putri Elizabeth Simanjuntak (24060124120018)
*/

public abstract class Konten {
    private int idKonten;
    private String judul;
    private String tanggalUpload;
    private String filePath;

    //konstrulktor
    public Konten(int var1, String var2, String var3, String var4){
        this.idKonten = var1;
        this.judul = var2;
        this.tanggalUpload = var3;
        this.filePath = var4;
    }
    //setter & getter
    public int getIdKonten(){
        return this.idKonten;
    }
    
    public void setIdKonten(int id){
        this.idKonten = id;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    public String getJudul(){
        return this.judul;
    }
    
    public void setTanggalUpload(String date){
        this.tanggalUpload = date;
    }

    public String getTanggalUpload(){
        return this.tanggalUpload;
    }

    public void setFilePath(String path){
        this.filePath = path;
    }

    public String getFilePath(){
        return this.filePath;
    }

    public void upload(){
        System.out.println("Konten terupload");
    }

    public void download(){
        System.out.println("Konten terdownload");
    }
}
