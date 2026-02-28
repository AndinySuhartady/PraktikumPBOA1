/*
 * Nama File   : Titik.java
 * Deskripsi   : Berisi atribut dan method dalam class Titik
 * Pembuat     : Andiny Khaerany Suhartady
 * Tanggal     : 28 Februari 2026
 */

public class Titik {

    /* **** ATRIBUT **** */
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /* **** METHOD **** */

    // Konstruktor default (0,0)
    public Titik() {
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }

    // Konstruktor dengan parameter (overloading)
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    /* **** METHOD **** */
    // Mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }
    
    // Mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    public static int getCounterTitik() {
        return counterTitik;
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


    // MENENTUKAN KUADRAN
    public int getKuadran() {
        if (absis > 0 && ordinat > 0) return 1;
        else if (absis < 0 && ordinat > 0) return 2;
        else if (absis < 0 && ordinat < 0) return 3;
        else if (absis > 0 && ordinat < 0) return 4;
        else return 0; // di sumbu
    }

    // JARAK KE TITIK (0,0)
    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    // JARAK KE TITIK LAIN
    public double getJarak(Titik T) {
        double dx = absis - T.absis;
        double dy = ordinat - T.ordinat;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // REFLEKSI TERHADAP SUMBU X (UBAH LANGSUNG)
    public void refleksiX() {
        this.ordinat = -this.ordinat;
    }

    // REFLEKSI TERHADAP SUMBU Y (UBAH LANGSUNG)
    public void refleksiY() {
        this.absis = -this.absis;
    }

    // MENGHASILKAN TITIK BARU REFLEKSI X
    public Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    // MENGHASILKAN TITIK BARU REFLEKSI Y
    public Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }


} //end class Titik
