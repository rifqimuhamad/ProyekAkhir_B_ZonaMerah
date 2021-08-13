/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Kintan Khairunnisa(1402019052)
 * @author Muhammad Rizky Yuhari(1402019075)
 * @author Rangga Pujangga(1402019090)
 * @author Muhamad Rifqi(1402019058)

 */
public class Penghubung {
   private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/projekpbo";//untuk koneksi ke database
            String user="root";//user yang sudah diatur dari sana
            String pass=""; //password sudah diatur dari sana
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);//untuk menghubungkan ke database   
            System.out.println("koneksi berhasil");
        } catch (Exception e) {
            System.err.println("koneksi gagal "+e.getMessage());
        }
        return mysqlconfig;
    } 
}
