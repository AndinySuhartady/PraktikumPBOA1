/*
 * File : Piaraan.java
 * Nama : Andiny Khaerany Suhartady
 * NIM  : 24060124140194
 * Tanggal : 9 Mei 2026
 * Deskripsi : Kelas koleksi antrean Anabul
 */

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    private Queue<Anabul> Lanabul;
    private int nbelm;

    public Piaraan() {
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    // i. getNbelm()
    public int getNbelm() {
        return nbelm;
    }

    // ii. enqueueAnabul(anabul)
    public void enqueueAnabul(Anabul a) {
        Lanabul.add(a);
        nbelm++;
    }

    // iii. isMember(anabul)
    public boolean isMember(Anabul a) {
        return Lanabul.contains(a);
    }

    // iv. getAnabul()
    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    // v. dequeueAnabul()
    public Anabul dequeueAnabul() {
        Anabul a = Lanabul.poll();

        if (a != null) {
            nbelm--;
        }

        return a;
    }

    // c. showAnabul()
    public void showAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println(a.getNama());
        }
    }

    // d. countKucing()
    public int countKucing() {
        int count = 0;

        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }

        return count;
    }

    // e. bobotKucing()
    public double bobotKucing() {
        double total = 0;

        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                total += a.getBobot();
            }
        }

        return total;
    }

    // f. showJenisAnabul()
    public void showJenisAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println(
                a.getNama() + " -> " + a.getClass().getName()
            );
        }
    }
}