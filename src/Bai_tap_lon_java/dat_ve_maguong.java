/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Bai_tap_lon_java;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author seape
 */
public class dat_ve_maguong extends javax.swing.JFrame {

    /**
     * Creates new form dat_ve_maguong
     */
    ButtonGroup buttongroup = new ButtonGroup();
    String ID_phim = "magu";
    public dat_ve_maguong() {
        initComponents();
        jRadioButton1.setActionCommand(jRadioButton1.getText());
        jRadioButton2.setActionCommand(jRadioButton2.getText());
        jRadioButton3.setActionCommand(jRadioButton3.getText());
        jRadioButton4.setActionCommand(jRadioButton4.getText());
        jRadioButton5.setActionCommand(jRadioButton5.getText());
        buttongroup.add(jRadioButton1);
        buttongroup.add(jRadioButton2);
        buttongroup.add(jRadioButton3);
        buttongroup.add(jRadioButton4);
        buttongroup.add(jRadioButton5);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        ghe1 = new javax.swing.JToggleButton();
        ghe2 = new javax.swing.JToggleButton();
        ghe3 = new javax.swing.JToggleButton();
        ghe4 = new javax.swing.JToggleButton();
        ghe5 = new javax.swing.JToggleButton();
        ghe6 = new javax.swing.JToggleButton();
        ghe7 = new javax.swing.JToggleButton();
        ghe8 = new javax.swing.JToggleButton();
        ghe9 = new javax.swing.JToggleButton();
        ghe10 = new javax.swing.JToggleButton();
        ghe11 = new javax.swing.JToggleButton();
        ghe12 = new javax.swing.JToggleButton();
        ghe13 = new javax.swing.JToggleButton();
        ghe14 = new javax.swing.JToggleButton();
        ghe15 = new javax.swing.JToggleButton();
        kButton1 = new com.k33ptoo.components.KButton();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 204, 51));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 153, 153));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 204, 204));
        jLabel2.setText("            SCREEN");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51), 3));
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 140, 40));

        ghe1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        ghe1.setText("1");
        kGradientPanel1.add(ghe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 80, 40));

        ghe2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        ghe2.setText("2");
        kGradientPanel1.add(ghe2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 80, 40));

        ghe3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        ghe3.setText("3");
        kGradientPanel1.add(ghe3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 80, 40));

        ghe4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        ghe4.setText("4");
        kGradientPanel1.add(ghe4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 80, 40));

        ghe5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        ghe5.setText("5");
        kGradientPanel1.add(ghe5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 80, 40));

        ghe6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        ghe6.setText("6");
        kGradientPanel1.add(ghe6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 80, 40));

        ghe7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        ghe7.setText("7");
        kGradientPanel1.add(ghe7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 80, 40));

        ghe8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        ghe8.setText("8");
        kGradientPanel1.add(ghe8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 80, 40));

        ghe9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        ghe9.setText("9");
        kGradientPanel1.add(ghe9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 80, 40));

        ghe10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        ghe10.setText("10");
        kGradientPanel1.add(ghe10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, -1, 40));

        ghe11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        ghe11.setText("11");
        ghe11.setToolTipText("");
        kGradientPanel1.add(ghe11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 80, 40));

        ghe12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        ghe12.setText("12");
        kGradientPanel1.add(ghe12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, 40));

        ghe13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        ghe13.setText("13");
        kGradientPanel1.add(ghe13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 80, 40));

        ghe14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        ghe14.setText("14");
        kGradientPanel1.add(ghe14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, 40));

        ghe15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        ghe15.setText("15");
        kGradientPanel1.add(ghe15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 80, 40));

        kButton1.setText("Tiếp tục");
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, -1, -1));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 840, 510));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButton1.setText("2022-08-18");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 98, -1));

        jRadioButton2.setText("2022-08-19");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jRadioButton3.setText("2022-08-20");
        jRadioButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton3MouseClicked(evt);
            }
        });
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jRadioButton4.setText("2022-08-21");
        jRadioButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton4MouseClicked(evt);
            }
        });
        jPanel1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jRadioButton5.setText("2022-08-22");
        jRadioButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton5MouseClicked(evt);
            }
        });
        jPanel1.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 580));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Thời gian chiếu phim: 21:35");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(294, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 840, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setMouseClicked(String ngay_dat){
        if(SelectMySQL.checkTicket(ID_phim,"1", ngay_dat) == 1) ghe1.setEnabled(false);
        else ghe1.setEnabled(true);
        if(SelectMySQL.checkTicket(ID_phim,"2", ngay_dat) == 1) ghe2.setEnabled(false);
        else ghe2.setEnabled(true);
        if(SelectMySQL.checkTicket(ID_phim,"3", ngay_dat) == 1) ghe3.setEnabled(false);
        else ghe3.setEnabled(true);
        if(SelectMySQL.checkTicket(ID_phim,"4", ngay_dat) == 1) ghe4.setEnabled(false);
        else ghe4.setEnabled(true);
        if(SelectMySQL.checkTicket(ID_phim,"5", ngay_dat) == 1) ghe5.setEnabled(false);
        else ghe5.setEnabled(true);
        if(SelectMySQL.checkTicket(ID_phim,"6", ngay_dat) == 1) ghe6.setEnabled(false);
        else ghe6.setEnabled(true);
        if(SelectMySQL.checkTicket(ID_phim,"7", ngay_dat) == 1) ghe7.setEnabled(false);
        else ghe7.setEnabled(true);
        if(SelectMySQL.checkTicket(ID_phim,"8", ngay_dat) == 1) ghe8.setEnabled(false);
        else ghe8.setEnabled(true);
        if(SelectMySQL.checkTicket(ID_phim,"9", ngay_dat) == 1) ghe9.setEnabled(false);
        else ghe9.setEnabled(true);
        if(SelectMySQL.checkTicket(ID_phim,"10", ngay_dat) == 1) ghe10.setEnabled(false);
        else ghe10.setEnabled(true);
        if(SelectMySQL.checkTicket(ID_phim,"11", ngay_dat) == 1) ghe11.setEnabled(false);
        else ghe11.setEnabled(true);
        if(SelectMySQL.checkTicket(ID_phim,"12", ngay_dat) == 1) ghe12.setEnabled(false);
        else ghe12.setEnabled(true);
        if(SelectMySQL.checkTicket(ID_phim,"13", ngay_dat) == 1) ghe13.setEnabled(false);
        else ghe13.setEnabled(true);
        if(SelectMySQL.checkTicket(ID_phim,"14", ngay_dat) == 1) ghe14.setEnabled(false);
        else ghe14.setEnabled(true);
        if(SelectMySQL.checkTicket(ID_phim,"15", ngay_dat) == 1) ghe15.setEnabled(false);
        else ghe15.setEnabled(true);
    }
    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
        // TODO add your handling code here:
        String ngay_dat = jRadioButton1.getText();
        setMouseClicked(ngay_dat);
    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        // TODO add your handling code here:
        String ngay_dat = jRadioButton2.getText();
        setMouseClicked(ngay_dat);
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void jRadioButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton3MouseClicked
        // TODO add your handling code here:
        String ngay_dat = jRadioButton3.getText();
        setMouseClicked(ngay_dat);
    }//GEN-LAST:event_jRadioButton3MouseClicked

    private void jRadioButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton4MouseClicked
        // TODO add your handling code here:
        String ngay_dat = jRadioButton4.getText();
        setMouseClicked(ngay_dat);
    }//GEN-LAST:event_jRadioButton4MouseClicked

    private void jRadioButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton5MouseClicked
        // TODO add your handling code here:
        String ngay_dat = jRadioButton5.getText();
        setMouseClicked(ngay_dat);
    }//GEN-LAST:event_jRadioButton5MouseClicked

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        int count = 0;
        int input = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn đặt vé?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (input == 0){
            JOptionPane.showMessageDialog(null, "Đã đặt vé, thanh toán ...");
        String ngay_dat =  buttongroup.getSelection().getActionCommand();
        String tai_khoan = NewJFrame.taiKhoan;
        if(ghe1.isSelected()){
            InsertMySQL.insertTicketBooking(tai_khoan, ID_phim, ngay_dat, "1");
            count++;
        }
        if(ghe2.isSelected()){
            InsertMySQL.insertTicketBooking(tai_khoan, ID_phim, ngay_dat, "2");
            count++;
        }
        if(ghe3.isSelected()){
            InsertMySQL.insertTicketBooking(tai_khoan, ID_phim, ngay_dat, "3");
            count++;
        }
        if(ghe4.isSelected()){
            InsertMySQL.insertTicketBooking(tai_khoan, ID_phim, ngay_dat, "4");
            count++;
        }
        if(ghe5.isSelected()){
            InsertMySQL.insertTicketBooking(tai_khoan, ID_phim, ngay_dat, "5");
            count++;
        }
        if(ghe6.isSelected()){
            InsertMySQL.insertTicketBooking(tai_khoan, ID_phim, ngay_dat, "6");
            count++;
        }
        if(ghe7.isSelected()){
            InsertMySQL.insertTicketBooking(tai_khoan, ID_phim, ngay_dat, "7");
            count++;
        }
        if(ghe8.isSelected()){
            InsertMySQL.insertTicketBooking(tai_khoan, ID_phim, ngay_dat, "8");
            count++;
        }
        if(ghe9.isSelected()){
            InsertMySQL.insertTicketBooking(tai_khoan, ID_phim, ngay_dat, "9");
            count++;
        }
        if(ghe10.isSelected()){
            InsertMySQL.insertTicketBooking(tai_khoan, ID_phim, ngay_dat, "10");
            count++;
        }
        if(ghe11.isSelected()){
            InsertMySQL.insertTicketBooking(tai_khoan, ID_phim, ngay_dat, "11");
            count++;
        }
        if(ghe12.isSelected()){
            InsertMySQL.insertTicketBooking(tai_khoan, ID_phim, ngay_dat, "12");
            count++;
        }
        if(ghe13.isSelected()){
            InsertMySQL.insertTicketBooking(tai_khoan, ID_phim, ngay_dat, "13");
            count++;
        }
        if(ghe14.isSelected()){
            InsertMySQL.insertTicketBooking(tai_khoan, ID_phim, ngay_dat, "14");
            count++;
        }
        if(ghe15.isSelected()){
            InsertMySQL.insertTicketBooking(tai_khoan, ID_phim, ngay_dat, "15");
            count++;
        }
        }
    }//GEN-LAST:event_kButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dat_ve_maguong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dat_ve_maguong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dat_ve_maguong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dat_ve_maguong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dat_ve_maguong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ghe1;
    private javax.swing.JToggleButton ghe10;
    private javax.swing.JToggleButton ghe11;
    private javax.swing.JToggleButton ghe12;
    private javax.swing.JToggleButton ghe13;
    private javax.swing.JToggleButton ghe14;
    private javax.swing.JToggleButton ghe15;
    private javax.swing.JToggleButton ghe2;
    private javax.swing.JToggleButton ghe3;
    private javax.swing.JToggleButton ghe4;
    private javax.swing.JToggleButton ghe5;
    private javax.swing.JToggleButton ghe6;
    private javax.swing.JToggleButton ghe7;
    private javax.swing.JToggleButton ghe8;
    private javax.swing.JToggleButton ghe9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
