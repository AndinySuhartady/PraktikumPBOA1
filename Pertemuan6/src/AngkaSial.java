/*
*File :AngkaSial.java
*Deskripsi : Program penggunaan exception buatan sendiri pengenalan klausa 'throw' dan 'throws'
*Nama : Andiny Khaerany Suhartady
*NIM :24060124140194 */
public class AngkaSial {
    
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka ==13){
            throw new AngkaSialException ();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main (String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati hati memasukkan angka !!!");
        }
    }
}


//PERTANYAAN:
/*Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?

Jawaban: Baris 12 pada AngkaSial.java tidak dieksekusi saat nilai angka = 13, karena program sudah melakukan pelemparan exception (throw) sebelum mencapai baris tersebut. Namun, baris ini tetap dieksekusi untuk nilai yang tidak menyebabkan exception, seperti saat angka = 10.

/Apakah baris 21 pada AngkaSial.java di atas dieksekusi?

Jawaban: Baris 21 pada AngkaSial.java tidak dieksekusi karena ketika exception terjadi pada pemanggilan as.cobaAngka(13), alur program langsung berpindah ke blok catch. Oleh karena itu, baris setelahnya tidak dijalankan.

//Jelaskan pada lembar praktikum anda !

*/

