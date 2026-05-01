/*
 * File : Data.java
 * Nama : Andiny Khaerany Suhartady
 * NIM  : 24060124140194
 * Tanggal : 1 May 2026
 * Deskripsi : Kelas generik yang menyimpan larik elemen bertipe T dengan kapasitas 100 elemen
 */


public class Data<T> {
    private T[] ruang;
    private int banyak;

    @SuppressWarnings("unchecked")
    public Data() {
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    public void setIsi(int posisi, T nilai) {
        // validasi 1..100
        if (posisi < 1 || posisi > 100) {
            System.out.println("Index harus 1-100!");
            return;
        }

        ruang[posisi - 1] = nilai;

        if (posisi > banyak) {
            banyak = posisi;
        }
    }

    public T getIsi(int posisi) {
        if (posisi < 1 || posisi > banyak) {
            return null;
        }
        return ruang[posisi - 1];
    }

    public int getSize() {
        return banyak;
    }
}
