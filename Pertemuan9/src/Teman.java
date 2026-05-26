
/*
 * File : Teman.java
 * Nama : Andiny Khaerany Suhartady
 * NIM  : 24060124140194
 * Tanggal : 9 Mei 2026
 * Deskripsi : Kelas koleksi nama teman menggunakan ArrayList
 */

import java.util.ArrayList;

public class Teman {
    private ArrayList<String> Lnama;

    public Teman() {
        Lnama = new ArrayList<>();
    }

    public int getNbelm() {
        return Lnama.size();
    }

    public String getNama(int i) {
        return Lnama.get(i);
    }

    public void setNama(int i, String nama) {
        Lnama.set(i, nama);
    }

    public void addNama(String nama) {
        Lnama.add(nama);
    }

    public void delNama(String nama) {
        Lnama.remove(nama);
    }

    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namaBaru) {
        int idx = Lnama.indexOf(nama);

        if (idx != -1) {
            Lnama.set(idx, namaBaru);
        }
    }

    public int countNama(String nama) {
        int count = 0;

        for (String n : Lnama) {
            if (n.equals(nama)) {
                count++;
            }
        }

        return count;
    }

    public void showTeman() {
        for (String n : Lnama) {
            System.out.println(n);
        }
    }
}