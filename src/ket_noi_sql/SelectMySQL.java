package ket_noi_sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hoang Minh
 */
public class SelectMySQL {
    public static int checkTicket(){
        int ans = 0;
        String sql = "SELECT ID_phim, ngay_dat, ID_ghe " +"FROM luot_dat_ve "
                + "WHERE ID_phim = 'bp' AND ID_ghe = 'A1'";
        try(Connection conn = MySQLJDBCUtil.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            if (rs.next()){
                System.out.print(rs);
            }
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }  
        return ans;
    }
    public static void main(String[] args) throws SQLException{
        int rs = checkTicket();
        if(rs == 1) System.out.print("Co ghe A1");
    }
}
