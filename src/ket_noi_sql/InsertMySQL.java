package ket_noi_sql;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hoang Minh
 */
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertMySQL {
 
    public static void insertUser(String tai_khoan, String mat_khau, String ho_ten, String dia_chi, Date ngay_sinh, 
                                       String so_dien_thoai) {
        // for insert a new candidate
        ResultSet rs = null;
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
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if(rs != null)  rs.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public static void insert_dat_ve(){
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        insertUser("minh123", "Minh988123@", "Hoang Ha My", "Phu Tho", Date.valueOf("2002-10-28"), "0918194677");
    }
}