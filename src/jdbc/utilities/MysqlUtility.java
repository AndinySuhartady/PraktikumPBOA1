/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;

/**
 *
 * @author Lenovo PC Andiny Khaerany Suhartady
 */


import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlUtility {

    public static Connection getConnection() {

        try {

            String url =
                "jdbc:mysql://localhost:3306/pbo";

            String user = "root";
            String password = "";

            Connection conn =
                DriverManager.getConnection(
                    url,
                    user,
                    password
                );

            return conn;

        } catch (Exception e) {

            System.out.println(e);

            return null;
        }
    }
}
