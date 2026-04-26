/*
Kelompok PBO:
1. Agung Rama Pramana Putra (24060124120007)
2. Andiny Khaerany Suhartady (24060124140194)
3. Cindy Kurniawan (24060124140201)
4. Jessica Laurencia Panjaitan (24060124130084)
5. Putri Elizabeth Simanjuntak (24060124120018)
*/


public class Admin extends User {
    public Admin(int var1, String var2, String var3, String var4){
        super(var1, var2, var3, var4);
    }
 
    public void verifikasiKonten(Konten k){
        System.out.println("Admin memverifikasi konten: '" + k.getJudul() + "' - DISETUJUI");
    }
 
    public void hapusKonten(Konten k){
        System.out.println("Admin menghapus konten: '" + k.getJudul() + "'");
    }
 
    public void updateKonten(Konten k){
        System.out.println("Admin mengupdate konten: '" + k.getJudul() + "'");
    }
}