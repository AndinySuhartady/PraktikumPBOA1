/*
Kelompok PBO:
1. Agung Rama Pramana Putra (24060124120007)
2. Andiny Khaerany Suhartady (24060124140194)
3. Cindy Kurniawan (24060124140201)
4. Jessica Laurencia Panjaitan (24060124130084)
5. Putri Elizabeth Simanjuntak (24060124120018)
*/


public class LatihanSoal {
    private int id;
    private String pertanyaan;
    private String jawaban;

    public LatihanSoal(){

    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setPertanyaan(String pertanyaan){
        this.pertanyaan = pertanyaan;
    }
    public String getPertanyaan(){
        return this.pertanyaan;
    }
    public void setJawaban(String jawaban){
        this.jawaban = jawaban;
    }
    public String getJawaban(){
        return this.jawaban;
    }

    public boolean cekJawaban(String jawabanUser){
        assert jawabanUser != null;

        return jawabanUser.equals(jawaban);
    }
}