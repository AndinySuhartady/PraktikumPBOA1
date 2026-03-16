/*
 * Nama File   : Titik.java
 * Deskripsi   : Berisi atribut dan method dalam class Titik
 * Pembuat     : Andiny Khaerany Suhartady
 * Tanggal     : 22 Februari 2026
 */

public class Titik {

    /* ********** ATRIBUT ********** */
    double absis;
    double ordinat;

    /* ********** KONSTRUKTOR ********** */
    Titik(){
        absis = 0;
        ordinat = 0;
    }
    
    /* ********** METHOD ********** */
    // Mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }
    
    // Mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    // Mengubah nilai absis
    void setAbsis(double x){
        absis = x;
    }

    //Mengubah nilai ordinat
    void setOrdinat(double y){
        ordinat = y;
    }

    //Menggeser titik
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //Mencetak titik
    void printTitik(){
        System.out.println("Titik(" + absis +", " + ordinat + ")");
    }
} //end class Titik