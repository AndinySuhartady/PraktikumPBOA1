/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person.ser;

/**
 *
 * @author Lenovo PC  Andiny Khaerany Suhartady (24060124140194) Lab A1 Tanggal 16/05/2026
 */
import java.io.*;

public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Panji");

        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);

            s.writeObject(person);

            System.out.println("Selesai menulis objek person");

            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}