/*
Kelompok PBO:
1. Agung Rama Pramana Putra (24060124120007)
2. Andiny Khaerany Suhartady (24060124140194)
3. Cindy Kurniawan (24060124140201)
4. Jessica Laurencia Panjaitan (24060124130084)
5. Putri Elizabeth Simanjuntak (24060124120018)
*/


import java.util.ArrayList;

public class Mahasiswa extends User {
    private ArrayList<Konten> daftarKonten;

    public Mahasiswa(int var1, String var2, String var3, String var4){
        super(var1, var2, var3, var4);
        daftarKonten = new ArrayList<>();
    }

    public void tambahKontenLokal(Konten k){
        daftarKonten.add(k);
    }

    public void uploadKonten(Konten k){
        daftarKonten.add(k);
        System.out.println("Konten '" + k.getJudul() + "' berhasil diupload.");
    }

    public void downloadKonten(Konten k){
        System.out.println("Mengunduh konten: " + k.getJudul() + " dari " + k.getFilePath());
    }

    // overloading - by keyword only
    public ArrayList<Konten> cariKonten(String keyword){
        ArrayList<Konten> hasil = new ArrayList<>();
        for (Konten k : daftarKonten){
            if (k.getJudul().toLowerCase().contains(keyword.toLowerCase())){
                hasil.add(k);
            }
        }
        System.out.println("Cari '" + keyword + "': ditemukan " + hasil.size() + " konten.");
        return hasil;
    }

    // overloading 
    public ArrayList<Konten> cariKonten(String keyword, String jenisKonten){
        ArrayList<Konten> hasil = new ArrayList<>();
        for (Konten k : daftarKonten){
            boolean judulCocok = k.getJudul().toLowerCase().contains(keyword.toLowerCase());
            boolean jenisCocok = false;
            if (jenisKonten.equals("Soal") && k instanceof Soal) jenisCocok = true;
            if (jenisKonten.equals("Materi") && k instanceof Materi) jenisCocok = true;
            if (jenisKonten.equals("Kuis") && k instanceof Kuis) jenisCocok = true;
            if (judulCocok && jenisCocok) hasil.add(k);
        }
        System.out.println("Cari '" + keyword + "' jenis '" + jenisKonten + "': ditemukan " + hasil.size() + " konten.");
        return hasil;
    }

    // overloading 
    public ArrayList<Konten> cariKonten(String keyword, int tahun){
        ArrayList<Konten> hasil = new ArrayList<>();
        for (Konten k : daftarKonten){
            boolean judulCocok = k.getJudul().toLowerCase().contains(keyword.toLowerCase());
            boolean tahunCocok = (k instanceof Soal && ((Soal) k).getTahun() == tahun);
            if (judulCocok && tahunCocok) hasil.add(k);
        }
        System.out.println("Cari '" + keyword + "' tahun " + tahun + ": ditemukan " + hasil.size() + " konten.");
        return hasil;
    }
}