package Bai_tap_lon_java;

import ket_noi_sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
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
    
    public static void printUser(javax.swing.JTable table){
        String sql = "SELECT STT, tai_khoan, ho_ten, dia_chi, ngay_sinh, so_dien_thoai " +"FROM user";
        try(Connection conn = MySQLJDBCUtil.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()){
                String stt = rs.getString("STT");
                String tk = rs.getString("tai_khoan");
                String ht = rs.getString("ho_ten");
                String dc = rs.getString("dia_chi");
                String ns = rs.getString("ngay_sinh");
                String sdt = rs.getString("so_dien_thoai");
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.addRow(new Object[]{stt, tk, ht, dc, ns, sdt});
            }
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }  
    }
    
    public static void printAllBookingTicket(javax.swing.JTable table){
        String sql = "SELECT tai_khoan, ID_phim, ngay_dat, ID_ghe " + "FROM luot_dat_ve"
                + " ORDER BY ngay_dat ASC";
        int stt = 0;
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        try(Connection conn = MySQLJDBCUtil.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()){
                stt++;
                String tk = rs.getString("tai_khoan");
                String id_phim = rs.getString("ID_phim");
                String nd = rs.getString("ngay_dat");
                String id_ghe = rs.getString("ID_ghe"); 
                model.addRow(new Object[]{String.valueOf(stt), tk, id_phim, nd, id_ghe});
            }
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }  
    }
    
    public static void printYourBookingTicket(javax.swing.JTable table, String taikhoan) throws SQLException{
        String sql = "SELECT ID_phim, ngay_dat, ID_ghe " + "FROM luot_dat_ve"
                + " WHERE tai_khoan = '" + taikhoan + "' ORDER BY ngay_dat ASC";
        int stt = 0;
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        try(Connection conn = MySQLJDBCUtil.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()){
                stt++;
                String id_phim = rs.getString("ID_phim");
                String nd = rs.getString("ngay_dat");
                String id_ghe = rs.getString("ID_ghe");
                model.addRow(new Object[]{String.valueOf(stt), id_phim, nd, id_ghe});
            }
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }  
    }
    
    public static void printTicket(javax.swing.JTable table, String ID_phim) throws SQLException{
        String sql = "SELECT ID_phim, ngay_dat, ID_ghe " + "FROM luot_dat_ve"
                + " WHERE ID_phim = '" + ID_phim + "' ORDER BY ngay_dat ASC";
        int stt = 0;
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        try(Connection conn = MySQLJDBCUtil.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()){
                stt++;
                String id_phim = rs.getString("ID_phim");
                String nd = rs.getString("ngay_dat");
                String id_ghe = rs.getString("ID_ghe");
                model.addRow(new Object[]{String.valueOf(stt), id_phim, nd, id_ghe});
            }
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }  
    }
    public static void main(String[] args) throws SQLException{
        //JTable table = null;
        //String tk = "minh123";
      //printYourBookingTicket(table, tk);
    }
}
