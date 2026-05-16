/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistentobjectdao;

/**
 *
 * @author Lenovo PC  Andiny Khaerany Suhartady (24060124140194) Lab A1 Tanggal 16/05/2026
 */

public class MainDAO {
    public static void main(String args[]) {
        System.out.println("MainDAO berjalan");
        Person person = new Person("Indra");

        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());

        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}