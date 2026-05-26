/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

/**
 *
 * @author Lenovo PC Andiny Khaerany Suhartady
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

public class MysqlMahasiswaService {

    public ArrayList<Mahasiswa> getAll() {

        ArrayList<Mahasiswa> list =
            new ArrayList<>();

        try {

            Connection conn =
                MysqlUtility.getConnection();

            String sql =
                "SELECT * FROM mahasiswa";

            PreparedStatement ps =
                conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Mahasiswa m =
                    new Mahasiswa();

                m.setId(rs.getInt("id"));
                m.setNama(rs.getString("nama"));

                list.add(m);
            }

        } catch (Exception e) {

            System.out.println(e);
        }

        return list;
    }

    public void add(String nama) {

        try {

            Connection conn =
                MysqlUtility.getConnection();

            String sql =
                "INSERT INTO mahasiswa(nama) VALUES(?)";

            PreparedStatement ps =
                conn.prepareStatement(sql);

            ps.setString(1, nama);

            ps.executeUpdate();

        } catch (Exception e) {

            System.out.println(e);
        }
    }

    public void delete(int id) {

        try {

            Connection conn =
                MysqlUtility.getConnection();

            String sql =
                "DELETE FROM mahasiswa WHERE id=?";

            PreparedStatement ps =
                conn.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

        } catch (Exception e) {

            System.out.println(e);
        }
    }

    public void update(int id, String nama) {

        try {

            Connection conn =
                MysqlUtility.getConnection();

            String sql =
                "UPDATE mahasiswa SET nama=? WHERE id=?";

            PreparedStatement ps =
                conn.prepareStatement(sql);

            ps.setString(1, nama);
            ps.setInt(2, id);

            ps.executeUpdate();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}
