/*
 * File : MainTeman.java
 * Nama : Andiny Khaerany Suhartady
 * NIM  : 24060124140194
 * Tanggal : 9 Mei 2026
 * Deskripsi : Aplikasi kelas Teman
 */

public class MainTeman {
    public static void main(String[] args) {
        Teman t = new Teman();

        t.addNama("Lixiyie");
        t.addNama("Abrasha");
        t.addNama("Meiyksa");

        System.out.println("Jumlah Teman: " + t.getNbelm());
        t.showTeman();

        System.out.println("\nNama Pertama: " + t.getNama(0));

        t.setNama(1, "Uleiyva");

        System.out.println("\nKoleksi terbaru:");
        t.showTeman();

        // f. isMember(nama)
        System.out.println("\nApakah 'Lixiyie' ada? " + t.isMember("Lixiyie"));

        // g. gantiNama(nama, namaBaru)
        t.gantiNama("Lixiyie", "Traishana");

        System.out.println("\nSetelah gantiNama:");
        t.showTeman();

        // h. countNama(nama)
        System.out.println("\nJumlah 'Abrasha': " + t.countNama("Abrasha"));

        // e. delNama(nama)
        t.delNama("Abrasha");

        System.out.println("\nSetelah delNama:");
        t.showTeman();
    }
}


       