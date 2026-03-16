/*
 * Nama File   : MTitik.java
 * Deskripsi   : Main class untuk menjalankan class Titik
 * Pembuat     : Andiny Khaerany Suhartady
 * Tanggal     : 28 Februari 2026
 */

public class MTitik {
    public static void main(String[] args){

        Titik T1 = new Titik();

        T1.setAbsis(3);
        T1.setOrdinat(4);

        T1.printTitik();

        T1.geser(3,4);

        T1.printTitik();

        Titik T2 = new Titik(3,5);
        
        T2.printTitik();
        
        T1.setAbsis(10);
        
        T1.setOrdinat(10);
        
        T2.printTitik();

        T1.getKuadran();

        T1.getJarakPusat();

        T1.getJarak(T2);

        // Uji refleksi X (ubah langsung)
        T1.refleksiX();
        System.out.println("\nT1 setelah refleksi terhadap sumbu X:");
        T1.printTitik();

        // Uji refleksi Y (ubah langsung)
        T1.refleksiY();
        System.out.println("T1 setelah refleksi terhadap sumbu Y:");
        T1.printTitik();

        // Uji getRefleksiX (buat objek baru)
        Titik T3 = T2.getRefleksiX();
        System.out.println("\nRefleksi X dari T2 (T3):");
        T3.printTitik();

        // Uji getRefleksiY (buat objek baru)
        Titik T4 = T2.getRefleksiY();
        System.out.println("Refleksi Y dari T2 (T4):");
        T4.printTitik();


        // Titik T2 = new Titik(3,5);

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jarak Titik = " + T1.getJarakPusat());
    }   
}