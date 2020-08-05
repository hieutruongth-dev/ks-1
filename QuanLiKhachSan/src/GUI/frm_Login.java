/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author LGNV
 */
public class frm_Login extends javax.swing.JFrame {

    /**
     * Creates new form frm_Login
     */
    public frm_Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lgnvPanel1 = new lgnvswing.lgnvPanel();
        lgnvPanel3 = new lgnvswing.lgnvPanel();
        lgnvTextField1 = new lgnvswing.lgnvTextField();
        lgnvTextField2 = new lgnvswing.lgnvTextField();
        lgnvButton1 = new lgnvswing.lgnvButton();
        lgnvPanel2 = new lgnvswing.lgnvPanel();
        jLabel1 = new javax.swing.JLabel();
        lgnvButton2 = new lgnvswing.lgnvButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        lgnvPanel1.setBackground(new java.awt.Color(255, 255, 255));
        lgnvPanel1.setLGNV_lineAllow(false);
        lgnvPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lgnvPanel3.setBackground(new java.awt.Color(255, 255, 255));
        lgnvPanel3.setLGNV_ShaDownAllow(true);
        lgnvPanel3.setLGNV_ShadownPixel(20);
        lgnvPanel3.setLGNV_lineAllow(false);

        lgnvTextField1.setLGNV_iconLeft(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_user_male_25px.png"))); // NOI18N
        lgnvTextField1.setLGNV_placeholderText("User");
        lgnvTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgnvTextField1ActionPerformed(evt);
            }
        });

        lgnvTextField2.setLGNV_iconLeft(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_password_25px.png"))); // NOI18N
        lgnvTextField2.setLGNV_placeholderText("PassWord");
        lgnvTextField2.setLGNV_textType(lgnvswing.lgnvTextField.textTypeEnum.PASSWORD);
        lgnvTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgnvTextField2ActionPerformed(evt);
            }
        });

        lgnvButton1.setBackground(new java.awt.Color(66, 139, 202));
        lgnvButton1.setForeground(new java.awt.Color(255, 255, 255));
        lgnvButton1.setText("Login");
        lgnvButton1.setLGNV_borderRadius(40);
        lgnvButton1.setLGNV_lineAllow(false);
        lgnvButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lgnvButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgnvButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lgnvPanel3Layout = new javax.swing.GroupLayout(lgnvPanel3);
        lgnvPanel3.setLayout(lgnvPanel3Layout);
        lgnvPanel3Layout.setHorizontalGroup(
            lgnvPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lgnvPanel3Layout.createSequentialGroup()
                .addGroup(lgnvPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lgnvPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(lgnvPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lgnvTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lgnvTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(lgnvPanel3Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(lgnvButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        lgnvPanel3Layout.setVerticalGroup(
            lgnvPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lgnvPanel3Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(lgnvTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(lgnvTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(lgnvButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        lgnvPanel1.add(lgnvPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 340, 450));

        lgnvPanel2.setBackground(new java.awt.Color(66, 139, 202));
        lgnvPanel2.setLGNV_lineAllow(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");

        lgnvButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_close_window_26px.png"))); // NOI18N
        lgnvButton2.setLGNV_backgroundAllow(false);
        lgnvButton2.setLGNV_lineAllow(false);
        lgnvButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgnvButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lgnvPanel2Layout = new javax.swing.GroupLayout(lgnvPanel2);
        lgnvPanel2.setLayout(lgnvPanel2Layout);
        lgnvPanel2Layout.setHorizontalGroup(
            lgnvPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lgnvPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lgnvPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addGroup(lgnvPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lgnvButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        lgnvPanel2Layout.setVerticalGroup(
            lgnvPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lgnvPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lgnvButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        lgnvPanel1.add(lgnvPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lgnvPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lgnvPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(370, 604));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lgnvTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgnvTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lgnvTextField1ActionPerformed

    private void lgnvTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgnvTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lgnvTextField2ActionPerformed

    private void lgnvButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgnvButton1ActionPerformed
        
        main.home.setVisible(true);
        main.frm_Login.setVisible(false);
    }//GEN-LAST:event_lgnvButton1ActionPerformed

    private void lgnvButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgnvButton2ActionPerformed
        int result= JOptionPane.showConfirmDialog(this, "Bạn Chắc Chắn Thoát", "Cảnh Báo Thoát", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_lgnvButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private lgnvswing.lgnvButton lgnvButton1;
    private lgnvswing.lgnvButton lgnvButton2;
    private lgnvswing.lgnvPanel lgnvPanel1;
    private lgnvswing.lgnvPanel lgnvPanel2;
    private lgnvswing.lgnvPanel lgnvPanel3;
    private lgnvswing.lgnvTextField lgnvTextField1;
    private lgnvswing.lgnvTextField lgnvTextField2;
    // End of variables declaration//GEN-END:variables
}