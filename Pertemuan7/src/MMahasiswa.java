public class MMahasiswa {
    public static void main(String[] args) {
        // b. aplikasi semua varian setProgramStudi
        Mahasiswa m1 = new Mahasiswa("240001", "Andi", "Informatika");
        Mahasiswa m2 = new Mahasiswa("240002", "Budi", "Sistem Informasi");
        Mahasiswa m3 = new Mahasiswa("240003", "Citra", "Teknik Komputer");

        System.out.println("Data awal:");
        m1.tampilData();
        m2.tampilData();
        m3.tampilData();

        System.out.println("\nSet program studi tanpa parameter:");
        m1.setProgramStudi();
        m1.tampilData();

        System.out.println("\nSet program studi dengan String:");
        m2.setProgramStudi("Teknologi Informasi");
        m2.tampilData();

        System.out.println("\nSet program studi dengan objek Mahasiswa:");
        m3.setProgramStudi(m2);
        m3.tampilData();

        // c. konstruktor default
        System.out.println("Objek default:");
        Mahasiswa mDefault = new Mahasiswa();
        mDefault.tampilData();

        // d. konstruktor 3 parameter
        System.out.println("Objek 3 parameter:");
        Mahasiswa mParam = new Mahasiswa("240004", "Dina", "Ilmu Komputer");
        mParam.tampilData();

        // e. konstruktor cloning
        System.out.println("Objek cloning:");
        Mahasiswa mClone = new Mahasiswa(mParam);
        mClone.tampilData();

        
    }
}
