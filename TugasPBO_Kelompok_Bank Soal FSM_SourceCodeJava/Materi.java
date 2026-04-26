/*
Kelompok PBO:
1. Agung Rama Pramana Putra (24060124120007)
2. Andiny Khaerany Suhartady (24060124140194)
3. Cindy Kurniawan (24060124140201)
4. Jessica Laurencia Panjaitan (24060124130084)
5. Putri Elizabeth Simanjuntak (24060124120018)
*/

public class Materi extends Konten{
    private String tipeFile;

     public Materi(int var1,String var2,String var3,String var4, String var5){
        super(var1, var2, var3, var4);
        setTipeFile(var5);
     }

     //setter & getter
     public void setTipeFile(String tipe){
        if (tipe.equals("PDF") || tipe.equals("PPT")){
            this.tipeFile = tipe;
        }else{
            throw new IllegalArgumentException("Tipe File harus bertipe PDF atau PPT");
        }
     }

    public String getTipeFile(){
        return tipeFile;
    }

    @Override
    public void upload(){
        System.out.println("Materi '" + getJudul() + "' tipe " + getTipeFile() + " berhasil diupload.");
    }

    @Override
    public void download(){
        System.out.println("Mengunduh materi '" + getJudul() + "' dari: " + getFilePath());
}
}

