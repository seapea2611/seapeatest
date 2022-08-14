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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class UpdateMySQL {
    public static void update() {
        String sqlUpdate = "UPDATE table2 " + "SET Hoten = ? " + "WHERE ID = ?";
        try(Connection conn = MySQLJDBCUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sqlUpdate)){
                    String ID = " minh11";
                    String hoten = "Hoang Cam";
                    pstmt.setString(1, hoten);
                    pstmt.setString(2, ID);
                    int rowAffected = pstmt.executeUpdate();
    }catch (SQLException ex){
        System.out.println(ex.getMessage());
    }  
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        update();     
}
}
