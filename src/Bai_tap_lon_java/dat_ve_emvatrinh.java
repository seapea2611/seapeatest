/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Bai_tap_lon_java;

import com.k33ptoo.components.KGradientPanel;
import com.toedter.calendar.JTextFieldDateEditor;
import java.util.Calendar;
import javax.swing.ButtonGroup;



/**
 *
 * @author seape
 */
public class dat_ve_emvatrinh extends javax.swing.JFrame {

    /**
     * Creates new form dat_ve_emvatrinh
     */
    
    public dat_ve_emvatrinh() {
        initComponents();
        ButtonGroup buttongroup = new ButtonGroup();
        buttongroup.add(thu2);
        buttongroup.add(thu3);
        buttongroup.add(thu4);
        buttongroup.add(thu5);
        buttongroup.add(thu6);
        buttongroup.add(thu7);
        buttongroup.add(chunhat);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton13 = new javax.swing.JToggleButton();
        jToggleButton14 = new javax.swing.JToggleButton();
        jToggleButton15 = new javax.swing.JToggleButton();
        kButton1 = new com.k33ptoo.components.KButton();
        jPanel2 = new javax.swing.JPanel();
        thu2 = new javax.swing.JRadioButton();
        thu3 = new javax.swing.JRadioButton();
        thu4 = new javax.swing.JRadioButton();
        thu5 = new javax.swing.JRadioButton();
        thu6 = new javax.swing.JRadioButton();
        thu7 = new javax.swing.JRadioButton();
        chunhat = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        timeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 255, 51));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        jToggleButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        kGradientPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 40, 40));

        jToggleButton2.setForeground(new java.awt.Color(0, 102, 0));
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        kGradientPanel1.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 40, 40));

        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        kGradientPanel1.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 40, 40));

        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        kGradientPanel1.add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 40, 40));

        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        kGradientPanel1.add(jToggleButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 40, 40));

        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        kGradientPanel1.add(jToggleButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 40, 40));

        jToggleButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        kGradientPanel1.add(jToggleButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 40, 40));

        jToggleButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        kGradientPanel1.add(jToggleButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 40, 40));

        jToggleButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        kGradientPanel1.add(jToggleButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 40, 40));

        jToggleButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        kGradientPanel1.add(jToggleButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 40, 40));

        jToggleButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        kGradientPanel1.add(jToggleButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 40, 40));

        jToggleButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        kGradientPanel1.add(jToggleButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 40, 40));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("                       SCREEN");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 190, -1));

        jToggleButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        kGradientPanel1.add(jToggleButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 40, 40));

        jToggleButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        kGradientPanel1.add(jToggleButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 40, 40));

        jToggleButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/chair.png"))); // NOI18N
        kGradientPanel1.add(jToggleButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 40, 40));

        kButton1.setText("Ti???p t???c");
        kButton1.setkEndColor(new java.awt.Color(51, 255, 51));
        kButton1.setkHoverEndColor(new java.awt.Color(204, 255, 204));
        kButton1.setkHoverStartColor(new java.awt.Color(153, 153, 153));
        kButton1.setkStartColor(new java.awt.Color(0, 153, 51));
        kGradientPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, -1, -1));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 680, 490));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        thu2.setText("Th??? 2");
        jPanel2.add(thu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        thu3.setText("Th??? 3");
        jPanel2.add(thu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        thu4.setText("Th??? 4");
        jPanel2.add(thu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        thu5.setText("Th??? 5");
        jPanel2.add(thu5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        thu6.setText("Th??? 6");
        jPanel2.add(thu6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        thu7.setText("Th??? 7");
        jPanel2.add(thu7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        chunhat.setText("Ch??? nh???t");
        jPanel2.add(chunhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 560));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        timeLabel.setText("Th???i gian chi???u phim: 7:00");
        jPanel1.add(timeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 250, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 680, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(dat_ve_emvatrinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dat_ve_emvatrinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dat_ve_emvatrinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dat_ve_emvatrinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dat_ve_emvatrinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton chunhat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton13;
    private javax.swing.JToggleButton jToggleButton14;
    private javax.swing.JToggleButton jToggleButton15;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JRadioButton thu2;
    private javax.swing.JRadioButton thu3;
    private javax.swing.JRadioButton thu4;
    private javax.swing.JRadioButton thu5;
    private javax.swing.JRadioButton thu6;
    private javax.swing.JRadioButton thu7;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}
