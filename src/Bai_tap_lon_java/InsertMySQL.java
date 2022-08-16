package Bai_tap_lon_java;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hoang Minh
 */
import ket_noi_sql.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertMySQL {
    // for insert a new user
    public static void insertUser(String tai_khoan, String mat_khau, String ho_ten, String dia_chi, Date ngay_sinh, 
                                       String so_dien_thoai) {
        String sql = "INSERT into user(tai_khoan, mat_khau, ho_ten, dia_chi, ngay_sinh, so_dien_thoai) "
                   + "VALUES(?,?,?,?,?,?)";
         
        try (Connection conn = MySQLJDBCUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);) {
             
            // set parameters for statement
            pstmt.setString(1, tai_khoan);
            pstmt.setString(2, mat_khau);
            pstmt.setString(3, ho_ten);
            pstmt.setString(4, dia_chi);
            pstmt.setDate(5, ngay_sinh);
            pstmt.setString(6, so_dien_thoai);
 
            int rowAffected = pstmt.executeUpdate();
            if(rowAffected == 1) System.out.printf("OK");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } 
    }
    
    // for insert a new ticket booking
    public static void insertTicketBooking(String tai_khoan, String ID_phim, String ngay_dat, String ID_ghe){
        String sql = "INSERT into luot_dat_ve(tai_khoan, ID_phim, ngay_dat, ID_ghe) "
                   + "VALUES(?,?,?,?)";
        try (Connection conn = MySQLJDBCUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);) {
            // set parameters for statement
            pstmt.setString(1, tai_khoan);
            pstmt.setString(2, ID_phim);
            pstmt.setString(3, ngay_dat);
            pstmt.setString(4, ID_ghe);
            int rowAffected = pstmt.executeUpdate();
            if(rowAffected == 1) System.out.printf("OK");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } 
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //insertUser("minh123", "Minh988123@", "Hoang Ha My", "Phu Tho", Date.valueOf("2002-10-28"), "0918194677");
       //insertTicketBooking("minh123", "bp", Date.valueOf(LocalDate.now()), "1");
    }
}