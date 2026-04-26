/*
Kelompok PBO:
1. Agung Rama Pramana Putra (24060124120007)
2. Andiny Khaerany Suhartady (24060124140194)
3. Cindy Kurniawan (24060124140201)
4. Jessica Laurencia Panjaitan (24060124130084)
5. Putri Elizabeth Simanjuntak (24060124120018)
*/


import java.util.ArrayList;

public class Kuis extends Konten{
    private ArrayList<LatihanSoal> listSoal;

    public Kuis(int var1,String var2,String var3,String var4){
        super(var1, var2, var3, var4);
        listSoal = new ArrayList<>();
    }

    public void tambahSoal(LatihanSoal ls){
        listSoal.add(ls);
    }

    public void mulaiKuis(){
        assert !listSoal.isEmpty() : "Kuis tidak boleh dimulai tanpa soal!";
        System.out.println("Kuis '" + getJudul() + "' dimulai. Total soal: " + listSoal.size());
    }

    public int cekJawaban(ArrayList<String> jawabanUser){
        int totNilai = 0;
        for (int i = 0; i < listSoal.size(); i++){
            if (listSoal.get(i).cekJawaban(jawabanUser.get(i))){
                totNilai += 1;
            }
        }
        System.out.println("Jawaban diperiksa. Benar: " + totNilai + "/" + listSoal.size());
        return totNilai;
    }

    @Override
    public void upload(){
        System.out.println("Kuis '" + getJudul() + "' berhasil diupload.");
    }

    @Override
    public void download(){
        System.out.println("Mengunduh kuis '" + getJudul() + "' dari: " + getFilePath());
}
    
}