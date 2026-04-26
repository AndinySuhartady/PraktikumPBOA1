/*
Kelompok PBO:
1. Agung Rama Pramana Putra (24060124120007)
2. Andiny Khaerany Suhartady (24060124140194)
3. Cindy Kurniawan (24060124140201)
4. Jessica Laurencia Panjaitan (24060124130084)
5. Putri Elizabeth Simanjuntak (24060124120018)
*/


public class Soal extends Konten {
    private String jenisUjian;
    private int tahun;

    //konstruktor
    public Soal(int var1,String var2,String var3,String var4, String var5, int var6){
        super(var1, var2, var3, var4);
        setJenisUjian(var5);
        this.tahun = var6;
    }

    //setter & getter
    public void setJenisUjian(String jenis){
        if (jenis.equals("UTS") || jenis.equals("UAS")){
            this.jenisUjian = jenis;
        }else{
            throw new IllegalArgumentException("Jenis ujian harus UTS atau UAS");
        }
    }

    public String getJenisUjian(){
        return this.jenisUjian;
    }

    public void setTahun(int y){
        this.tahun = y;
    }

    public int getTahun(){
        return tahun;
    }

    @Override
    public void upload(){
        System.out.println("Soal " + getJenisUjian() + " tahun " + getTahun() + " berhasil diupload.");
    }

    @Override
    public void download(){
        System.out.println("Mengunduh soal dari: " + getFilePath());
    }
}
