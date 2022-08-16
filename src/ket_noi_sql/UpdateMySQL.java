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
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateMySQL {
    public static void deleteRow(String tai_khoan, String ID_phim, String ngay_dat, String ID_ghe) {
        String sqlUpdate = "DELETE from luot_dat_ve " + "WHERE tai_khoan = ? AND "  
                + "ID_phim = ? AND " + "ngay_dat = ? AND" + " ID_ghe = ?";
        try(Connection conn = MySQLJDBCUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sqlUpdate)){
                    pstmt.setString(1, tai_khoan);
                    pstmt.setString(2, ID_phim);
                    pstmt.setString(3, ngay_dat);
                    pstmt.setString(4, ID_ghe);
                    //int rowAffected = pstmt.executeUpdate();
    }catch (SQLException ex){
        System.out.println(ex.getMessage());
    }  
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        //update();     
}
}
