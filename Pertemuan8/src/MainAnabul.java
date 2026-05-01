/*
 * File : MainAnabul.java
 * Nama : Andiny Khaerany Suhartady
 * NIM  : 24060124140194
 * Tanggal : 1 May 2026
 * Deskripsi : Kelas utama untuk menguji penggunaan generik pada operator dan larik dengan objek Anabul
 */

public class MainAnabul {
    public static void main(String[] args) {

        Anabul[] daftar = {
            new Kucing("Aisyaila", 3.2),
            new Anjing("Cazyi"),
        };

        for (Anabul a : daftar) {
            a.bersuara();
            a.gerak();
            System.out.println();
        }

        System.out.println("\nAPLIKASI TUKAR & BOBOT2");

        // Aplikasi prosedur generik Tukar untuk sesama integer
        Ref<Integer> aInt = new Ref<>(3);
        Ref<Integer> bInt = new Ref<>(6);
        System.out.println("Sebelum Tukar: a= " + aInt.val + ", b=" + bInt.val);
        OperatorGenerik.Tukar(aInt, bInt);
        System.out.println("Sesudah Tukar: a=" + aInt.val + ", b=" + bInt.val);

        // Aplikasi prosedur generik Tukar untuk sesama string
        Ref<String> aStr = new Ref<>("Halo");
        Ref<String> bStr = new Ref<>("Dunia");
        System.out.println("Sebelum Tukar: a= " + aStr.val + ", b=" + bStr.val);
        OperatorGenerik.Tukar(aStr, bStr);
        System.out.println("Sesudah Tukar: a=" + aStr.val + ", b=" + bStr.val);

        // Aplikasi prosedur generik Tukar untuk tukar keluarga Anabul
        Ref<Anabul> aAnabul = new Ref<>(new Anjing("Cazyi"));
        Ref<Anabul> bAnabul = new Ref<>(new Kucing("Aisyaila", 3.2));
        System.out.println("Sebelum Tukar: a= " + aAnabul.val.getClass() + ", b=" + bAnabul.val.getClass());
        OperatorGenerik.Tukar(aAnabul, bAnabul);
        System.out.println("Sesudah Tukar: a=" + aAnabul.val.getClass() + ", b=" + bAnabul.val.getClass());

        // Aplikasi fumgsi generik Bobot2
        Anggora kucingA = new Anggora("Equisha", 4.2);
        Kembangtelon kucingB = new Kembangtelon("Laiciey", 3.5);
        double totalBobot = OperatorGenerik.Bobot2(kucingA, kucingB);
        System.out.println("Total bobot dua kucing keturunan: " + totalBobot + " kg");

        System.out.println("\nAPLIKASI LARIK GENERIK");
        // Realisasi kelas Data & aplikasi untuk keluarga objek Anabul
        //Data<Anabul> dataAnabul = new Data<>();
        Data<Anabul> dataAnabul = new Data<>();

        // b. setIsi
        dataAnabul.setIsi(1, new Kucing("Aisyaila", 3.2));
        dataAnabul.setIsi(2, new Anjing("Cazyi"));

        // c. getIsi
        System.out.println("Elemen ke-1: " + dataAnabul.getIsi(1).getNama());
        System.out.println("Elemen ke-2: " + dataAnabul.getIsi(2).getNama());

        // d. getSize
        System.out.println("Jumlah data: " + dataAnabul.getSize());
    }
}


//Renungan:
//Simpulkan bagaimana cara kerja konsep Generik sesuai kalimat Anda sendiri!
//Generik adalah cara supaya satu class atau method bisa dipakai untuk berbagai tipe data tanpa harus bikin ulang kode. 
//Dengan begitu, program jadi lebih fleksibel dan tidak ribet. Selain itu, generik juga membantu menghindari kesalahan tipe data karena sudah dicek saat kompilasi.
//Pada praktikum ini, generik digunakan untuk mengelola berbagai objek seperti keluarga Anabul dalam satu struktur yang sama, sehingga kode jadi lebih rapi dan mudah digunakan kembali.