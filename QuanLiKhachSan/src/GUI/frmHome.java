/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.CardLayout;

/**
 *
 * @author LGNV
 */
public class frmHome extends javax.swing.JFrame {
    pnl_Tab_Home tab_home = new pnl_Tab_Home();
    pnl_Tab_Manager tab_manager = new pnl_Tab_Manager();
    /**
     * Creates new form frmHome
     */
    public frmHome() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        pnlCenter.add(tab_home, "home");
        pnlCenter.add(tab_manager, "manager");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeader = new lgnvswing.lgnvPanel();
        pnlAllbtn = new lgnvswing.lgnvPanel();
        btnHome = new lgnvswing.lgnvButton();
        btnQuanLi = new lgnvswing.lgnvButton();
        btnBaoCao = new lgnvswing.lgnvButton();
        btnLogout = new lgnvswing.lgnvButton();
        lblTime = new javax.swing.JLabel();
        pnlCenter = new lgnvswing.lgnvPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlHeader.setBackground(new java.awt.Color(66, 139, 202));
        pnlHeader.setLGNV_lineAllow(false);
        pnlHeader.setPreferredSize(new java.awt.Dimension(1253, 80));

        pnlAllbtn.setBackground(new java.awt.Color(66, 139, 202));
        pnlAllbtn.setLGNV_lineAllow(false);
        pnlAllbtn.setLayout(new java.awt.GridLayout(1, 0));

        btnHome.setBackground(new java.awt.Color(66, 139, 202));
        btnHome.setBorder(null);
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_home_page_50px.png"))); // NOI18N
        btnHome.setText("Trang Chủ");
        btnHome.setLGNV_enteredColor(new java.awt.Color(36, 97, 131));
        btnHome.setLGNV_lineAllow(false);
        btnHome.setFocusable(false);
        btnHome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        pnlAllbtn.add(btnHome);

        btnQuanLi.setBackground(new java.awt.Color(66, 139, 202));
        btnQuanLi.setBorder(null);
        btnQuanLi.setForeground(new java.awt.Color(255, 255, 255));
        btnQuanLi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_book_50px.png"))); // NOI18N
        btnQuanLi.setText("Quản Lí");
        btnQuanLi.setLGNV_enteredColor(new java.awt.Color(36, 97, 131));
        btnQuanLi.setLGNV_lineAllow(false);
        btnQuanLi.setFocusable(false);
        btnQuanLi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnQuanLi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQuanLi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQuanLi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLiActionPerformed(evt);
            }
        });
        pnlAllbtn.add(btnQuanLi);

        btnBaoCao.setBackground(new java.awt.Color(66, 139, 202));
        btnBaoCao.setBorder(null);
        btnBaoCao.setForeground(new java.awt.Color(255, 255, 255));
        btnBaoCao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_bar_chart_50px.png"))); // NOI18N
        btnBaoCao.setText("Báo Cáo");
        btnBaoCao.setLGNV_enteredColor(new java.awt.Color(36, 97, 131));
        btnBaoCao.setLGNV_lineAllow(false);
        btnBaoCao.setFocusable(false);
        btnBaoCao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBaoCao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBaoCao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBaoCao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaoCaoActionPerformed(evt);
            }
        });
        pnlAllbtn.add(btnBaoCao);

        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_exit_26px.png"))); // NOI18N
        btnLogout.setText("Nguyễn Văn Lương");
        btnLogout.setLGNV_backgroundAllow(false);
        btnLogout.setLGNV_lineAllow(false);
        btnLogout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogout.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnLogout.setIconTextGap(20);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        lblTime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTime.setText("23:24  04-08-2020");

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addComponent(pnlAllbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 1120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAllbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHeaderLayout.createSequentialGroup()
                        .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(pnlHeader, java.awt.BorderLayout.PAGE_START);

        pnlCenter.setBackground(new java.awt.Color(255, 255, 255));
        pnlCenter.setLGNV_lineAllow(false);
        pnlCenter.setLayout(new java.awt.CardLayout());
        getContentPane().add(pnlCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        chooseTab("home");
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnBaoCaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaoCaoActionPerformed
        
    }//GEN-LAST:event_btnBaoCaoActionPerformed

    private void btnQuanLiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLiActionPerformed
        chooseTab("manager");
    }//GEN-LAST:event_btnQuanLiActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        this.setVisible(false);
        main.frm_Login.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    
    public void chooseTab(String nameTab){
        CardLayout layout = (CardLayout) pnlCenter.getLayout();
        layout.show(pnlCenter, nameTab);
    }
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
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lgnvswing.lgnvButton btnBaoCao;
    private lgnvswing.lgnvButton btnHome;
    public lgnvswing.lgnvButton btnLogout;
    private lgnvswing.lgnvButton btnQuanLi;
    private javax.swing.JLabel lblTime;
    private lgnvswing.lgnvPanel pnlAllbtn;
    private lgnvswing.lgnvPanel pnlCenter;
    private lgnvswing.lgnvPanel pnlHeader;
    // End of variables declaration//GEN-END:variables
}
