/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author acer
 */
public class Koneksi {
    public static Connection koneksi;
    public static Statement st;
    public static Connection KoneksiDatabase(){
    if(koneksi == null)
    {
        try {
            DriverManager.registerDriver(new Driver());
            koneksi= DriverManager.getConnection("jdbc:mysql://localhost/db_penjualan","root","");
            st = (Statement) koneksi.createStatement();
            System.out.println("koneksi berhasil");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal"+e);
        }
    }
        return koneksi;
    }
    
    
}
