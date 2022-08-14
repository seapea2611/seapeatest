package Bai_tap_lon_java;

import ket_noi_sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hoang Minh
 */
public class SelectMySQL {
    public static int checkUser(String tai_khoan, String mat_khau){
        int ans = 0;
        String sql = "SELECT tai_khoan, mat_khau " +"FROM user "
                + "WHERE tai_khoan = '" + tai_khoan + "' AND mat_khau = '" 
                + mat_khau + "'";
        System.out.println(sql);
        try(Connection conn = MySQLJDBCUtil.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            if (rs.next()){
                ans = 1;
            }
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }  
        return ans;
    }
    public static int checkTicket(String ID_phim, String ID_ghe, String ngay_dat){
        int ans = 0;
        String sql = "SELECT ID_phim, ngay_dat, ID_ghe " +"FROM luot_dat_ve "
                + "WHERE ID_phim = '" + ID_phim + "' AND ID_ghe = '" + ID_ghe 
                + "'" + " AND ngay_dat = '" + ngay_dat +"'";
        System.out.println(sql);
        try(Connection conn = MySQLJDBCUtil.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            if (rs.next()){
                ans = 1;
            }
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }  
        return ans;
    }
    
    public static void main(String[] args) throws SQLException{
        String ngay = "2022-08-12";
        String ghe = "1";
        int rs = checkTicket("bp", ghe, ngay);
        if(rs == 1) System.out.print("Co ghe A1");
    }
}
