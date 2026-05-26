/*
 * File : OperatorGenerik.java
 * Nama : Andiny Khaerany Suhartady
 * NIM  : 24060124140194
 * Tanggal : 1 May 2026
 * Deskripsi : Kelas yang berisi operasi generik seperti Tukar dan Bobot2
 */

// Kelas bantiuan agar nilai objek bisa ditukar referensinya

class Ref<T>{
    public T val;
    public Ref(T val){ this.val = val;}
}


public class OperatorGenerik {
    // Prosedur generik Tukar untuk menukar dua parameter generik
    public static <T> void Tukar(Ref<T> a, Ref<T> b){
        T temp = a.val;
        a.val = b.val;
        b.val = temp;
    }
       
    // Menggunakan Bounded Type Parameter <T extends Kucing>
    public static <T extends Kucing, U extends Kucing> double Bobot2(T a, U b){
        // Mengembalikan jumlah bobot keduanya
        return a.getBobot() + b.getBobot();
    }
}
