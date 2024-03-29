/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Bai_tap_lon_java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;


/**
 *
 * @author seape
 */
public class NewJFrame extends javax.swing.JFrame {
    
    static String taiKhoan;
    private final String[] image = {"number4.jpg","thor_big.jpg","blphone_big.jpg","doctorstrange.png"};
    private static int index = 0; 
    private Timer ChangeImageTimer;
    /**
     * Creates new form NewJFrame
     */
    
    public NewJFrame() {
        initComponents();
        lblabel.setIcon(new ImageIcon("D:\\New Folder\\Bai_tap_lon_java\\src\\Bai_tap_lon_java\\icon_baitap\\"+image[index]));
        ChangeImageTimer = new Timer(3000,new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
              index = index %4;
              lblabel.setIcon(new ImageIcon("D:\\New Folder\\Bai_tap_lon_java\\src\\Bai_tap_lon_java\\icon_baitap\\"+image[index]));
              index++;
              lblabel.updateUI();
           }
           });
        ChangeImageTimer.start();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        taiKhoanTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        dangnhap_button = new com.k33ptoo.components.KButton();
        jLabel7 = new javax.swing.JLabel();
        kButton2 = new com.k33ptoo.components.KButton();
        lblabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 153));
        kGradientPanel1.setkGradientFocus(-100);
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 51, 51));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("                Đăng nhập       ");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, 55));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("            HNM và trải nghiệm ");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 430, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel1.setText("Username");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        taiKhoanTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(taiKhoanTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 180, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel4.setText("password");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 170, 50));

        jCheckBox1.setText("show password");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });
        kGradientPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, -1, -1));
        jCheckBox1.getAccessibleContext().setAccessibleName("showpassword");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bai_tap_lon_java/icon_baitap/camera_500px.png"))); // NOI18N
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 470, 130));

        dangnhap_button.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 102)));
        dangnhap_button.setForeground(new java.awt.Color(0, 0, 0));
        dangnhap_button.setText("Đăng nhập");
        dangnhap_button.setkBackGroundColor(new java.awt.Color(51, 255, 51));
        dangnhap_button.setkEndColor(new java.awt.Color(0, 255, 255));
        dangnhap_button.setkForeGround(new java.awt.Color(0, 0, 0));
        dangnhap_button.setkHoverColor(new java.awt.Color(204, 255, 255));
        dangnhap_button.setkHoverForeGround(new java.awt.Color(0, 153, 153));
        dangnhap_button.setkHoverStartColor(new java.awt.Color(255, 255, 0));
        dangnhap_button.setkStartColor(new java.awt.Color(255, 51, 255));
        dangnhap_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dangnhap_buttonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(dangnhap_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 170, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 204));
        jLabel7.setText("----------hoặc là------------");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, -1, -1));

        kButton2.setForeground(new java.awt.Color(0, 0, 0));
        kButton2.setText("Đăng ký");
        kButton2.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton2.setkHoverEndColor(new java.awt.Color(255, 51, 51));
        kButton2.setkHoverStartColor(new java.awt.Color(255, 255, 0));
        kGradientPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 170, -1));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 541, 710));
        getContentPane().add(lblabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        // TODO add your handling code here:
        if(jCheckBox1.isSelected()) {
            jPasswordField1.setEchoChar((char)0);
        }
        else {
            jPasswordField1.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void dangnhap_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dangnhap_buttonActionPerformed
        // TODO add your handling code here:
        String tai_khoan = taiKhoanTextField.getText();
        taiKhoan = tai_khoan;
        String mat_khau = new String(jPasswordField1.getPassword());
        if(SelectMySQL.checkUser(tai_khoan, mat_khau) == 1){
            dispose();
            new chuc_nang_user().setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Bạn đã nhập sai tài khoản hoặc mật khẩu\n" 
            + "Vui lòng đăng nhập lại!");
        }
    }//GEN-LAST:event_dangnhap_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton dangnhap_button;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblabel;
    private javax.swing.JTextField taiKhoanTextField;
    // End of variables declaration//GEN-END:variables
}
