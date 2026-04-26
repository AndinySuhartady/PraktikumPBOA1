public class MainKepegawaian {
    public static void main(String[] args) {
        // Membuat objek sesuai contoh di gambar
        DosenTetap dosen1 = new DosenTetap(
            "9545647548", 
            "Andi", 
            "1990-05-05", 
            "2015-01-01", 
            5000000.0, 
            "Fakultas Sains dan Matematika", 
            "78647324"
        );

        System.out.println("=== DETAIL INFORMASI DOSEN TETAP ===");
        dosen1.printInfo();

        System.out.println("\n" + "=".repeat(45) + "\n");

        // Contoh untuk Tendik
        Tendik tendik1 = new Tendik(
            "123456789", 
            "Budi Santoso", 
            "1980-12-12", 
            "2010-06-01", 
            4000000.0, 
            "Akademik"
        );
        System.out.println("=== DETAIL INFORMASI TENDIK ===");
        tendik1.printInfo();
    }
}