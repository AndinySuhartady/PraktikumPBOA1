/*
File: DataMahasiwa.java
Deskripsi: Implemeentasi lambda pada Map
Nama: Andiny Khaerany Suhartady
NIM: 24060124140194
*/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class DataMahasiswa {
    public static void main(String[] args) {
     
    //Membuat map

    Map<String, String> mahasiswaList = new HashMap<>();

    //Menambahkan data
    mahasiswaList.put ("24060124140196", "Aeina");
    mahasiswaList.put ("24060124114011", "Suieleya");
    mahasiswaList.put ("24060124203457", "Giszelea");
    mahasiswaList.put ("24060124139876", "Quieliayana");

    //Menampilkan key dan value menggunakan lambda
        mahasiswaList.forEach((nim, nama) -> {
            System.out.println("NIM  : " + nim);
            System.out.println("Nama : " + nama);
            System.out.println();



        });
    }
}
