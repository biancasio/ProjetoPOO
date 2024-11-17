/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.CotController;
import model.Admin;
import model.Bitcoin;
import model.Ethereum;
import model.Ripple;

/**
 *
 * @author unifaljesus
 */
public class CotAdminFrame extends javax.swing.JFrame {

    /**
     * Creates new form CotAdminFrame
     */
    public CotAdminFrame(Admin admin) {
        initComponents();
        c = new CotController(this, admin);
        b = new Bitcoin("Bitcoin", 5, 0.02, 0.03);
        e = new Ethereum("Ethereum", 5, 0.01, 0.02);
        r = new Ripple("Ripple", 5, 0.01, 0.01);
        c = new CotController(this, admin, b, r, e);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCotacao = new javax.swing.JLabel();
        txtAtBit = new javax.swing.JTextField();
        txtAtRi = new javax.swing.JTextField();
        btRipple = new javax.swing.JButton();
        btAtualizarBitcoin = new javax.swing.JButton();
        txtAtEt = new javax.swing.JTextField();
        btAtualizarEthereum = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EXCHANGE DE CRIPTOMOEDAS ADMIN");

        lblCotacao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblCotacao.setText("ATUALIZAR COTAÇÃO");

        txtAtBit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAtBitActionPerformed(evt);
            }
        });

        btRipple.setText("Ripple");
        btRipple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRippleActionPerformed(evt);
            }
        });

        btAtualizarBitcoin.setText("Bitcoin");
        btAtualizarBitcoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarBitcoinActionPerformed(evt);
            }
        });

        btAtualizarEthereum.setText("Ethereum");
        btAtualizarEthereum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarEthereumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btRipple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAtualizarBitcoin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAtualizarEthereum, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAtRi, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAtEt, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAtBit, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblCotacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAtualizarBitcoin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE))
                    .addComponent(txtAtBit))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(txtAtEt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btAtualizarEthereum, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btRipple, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAtRi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(74, 74, 74))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAtBitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAtBitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAtBitActionPerformed

    private void btRippleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRippleActionPerformed
        String r = String.valueOf(c.atualizarCotRip());
        txtAtRi.setText(r);
    }//GEN-LAST:event_btRippleActionPerformed

    private void btAtualizarBitcoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarBitcoinActionPerformed
        //Bitcoin bitcoin = new Bitcoin("Bitcoin", 5, 0.01, 0.02);

        //double novaCotacao = c.atualizarCotacao();

        String r = String.valueOf(c.atualizarCotBit());
        txtAtBit.setText(r);
    }//GEN-LAST:event_btAtualizarBitcoinActionPerformed

    private void btAtualizarEthereumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarEthereumActionPerformed
        String r = String.valueOf(c.atualizarCotEthe());
        txtAtEt.setText(r);
    }//GEN-LAST:event_btAtualizarEthereumActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CotAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CotAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CotAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CotAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CotAdminFrame().setVisible(true);
//            }
//        });
//    }

    private Ripple r;
    private Ethereum e;
    private Bitcoin b;
    private CotController c;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizarBitcoin;
    private javax.swing.JButton btAtualizarEthereum;
    private javax.swing.JButton btRipple;
    private javax.swing.JLabel lblCotacao;
    private javax.swing.JTextField txtAtBit;
    private javax.swing.JTextField txtAtEt;
    private javax.swing.JTextField txtAtRi;
    // End of variables declaration//GEN-END:variables
}