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

public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;

        try {
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);

            person = (Person) s.readObject();

            s.close();

            System.out.println("Serialized person name = " + person.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}