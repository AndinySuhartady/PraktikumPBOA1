/*
*File :Asersi2.java
*Deskripsi : Program untuk demo asersi, yang akan menolak input jari jari lingkungan yang bernilai nol
*Nama : Andiny Khaerany Suhartady
*NIM :24060124140194
*/
//class Lingkaran
class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}


//class Asersi2
public class Asersi2{
    public static void main (String [] args){
        double jariJari = 0;
        assert (jariJari > 0):"jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}


//PETANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas.Jelaskan pada lembar laporan praktikum!
/* Terdapat kekurangan dalam pada program Aersi2, yaitu penggunaan assertion untuk validasi input sehingga penggunaannya tidak tepat.
Karena pada Java  assertion digunakan untuk debugging, sehingga penggunaanya tidak tepat.
 */