/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.AtualizarController;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model.Bitcoin;
import model.Ethereum;
import model.Ripple;
import model.Usuario;

/**
 *
 * @author unifaljesus
 */
public class AtualizarUsuarioFrame extends javax.swing.JFrame {

    /**
     * Creates new form AtualizarUsuarioFrame
     */
    public AtualizarUsuarioFrame(Usuario usuario) {
        initComponents();
        b = new Bitcoin("Bitcoin", 5, 0.02, 0.03);
        e = new Ethereum("Ethereum", 5, 0.01, 0.02);
        r = new Ripple("Ripple", 5, 0.01, 0.01);
        c = new AtualizarController(this, usuario, b, r, e);
    }

    public AtualizarController getC() {
        return c;
    }

    public void setC(AtualizarController c) {
        this.c = c;
    }

    public JLabel getLblAtualizar() {
        return lblAtualizar;
    }

    public void setLblAtualizar(JLabel lblAtualizar) {
        this.lblAtualizar = lblAtualizar;
    }

    public Bitcoin getB() {
        return b;
    }

    public void setB(Bitcoin b) {
        this.b = b;
    }

    public JButton getBtAtualizarBitcoin() {
        return btAtualizarBitcoin;
    }

    public void setBtAtualizarBitcoin(JButton btAtualizarBitcoin) {
        this.btAtualizarBitcoin = btAtualizarBitcoin;
    }

    public JButton getBtAtualizarEthereum() {
        return btAtualizarEthereum;
    }

    public void setBtAtualizarEthereum(JButton btAtualizarEthereum) {
        this.btAtualizarEthereum = btAtualizarEthereum;
    }

    public JButton getBtRipple() {
        return btRipple;
    }

    public void setBtRipple(JButton btRipple) {
        this.btRipple = btRipple;
    }

    public JTextField getTxtAtBit() {
        return txtAtBit;
    }

    public void setTxtAtBit(JTextField txtAtBit) {
        this.txtAtBit = txtAtBit;
    }

    public JTextField getTxtAtEt() {
        return txtAtEt;
    }

    public void setTxtAtEt(JTextField txtAtEt) {
        this.txtAtEt = txtAtEt;
    }

    public JTextField getTxtAtRi() {
        return txtAtRi;
    }

    public void setTxtAtRi(JTextField txtAtRi) {
        this.txtAtRi = txtAtRi;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtAtBit = new javax.swing.JTextField();
        txtAtEt = new javax.swing.JTextField();
        txtAtRi = new javax.swing.JTextField();
        btRipple = new javax.swing.JButton();
        btAtualizarEthereum = new javax.swing.JButton();
        btAtualizarBitcoin = new javax.swing.JButton();
        lblAtualizar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EXCHANGE DE CRIPTOMOEDAS");
        setPreferredSize(new java.awt.Dimension(1300, 600));

        jPanel1.setBackground(new java.awt.Color(106, 48, 103));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 600));

        txtAtBit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAtBitActionPerformed(evt);
            }
        });

        btRipple.setBackground(new java.awt.Color(134, 75, 131));
        btRipple.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btRipple.setForeground(new java.awt.Color(255, 255, 255));
        btRipple.setText("Ripple");
        btRipple.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btRipple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRippleActionPerformed(evt);
            }
        });

        btAtualizarEthereum.setBackground(new java.awt.Color(134, 75, 131));
        btAtualizarEthereum.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btAtualizarEthereum.setForeground(new java.awt.Color(255, 255, 255));
        btAtualizarEthereum.setText("Ethereum");
        btAtualizarEthereum.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAtualizarEthereum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarEthereumActionPerformed(evt);
            }
        });

        btAtualizarBitcoin.setBackground(new java.awt.Color(134, 75, 131));
        btAtualizarBitcoin.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btAtualizarBitcoin.setForeground(new java.awt.Color(255, 255, 255));
        btAtualizarBitcoin.setText("Bitcoin");
        btAtualizarBitcoin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAtualizarBitcoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarBitcoinActionPerformed(evt);
            }
        });

        lblAtualizar.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lblAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        lblAtualizar.setText("ATUALIZAR COTAÇÃO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 357, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btRipple, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAtualizarBitcoin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btAtualizarEthereum, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(234, 234, 234)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtAtBit, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAtEt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAtRi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(262, 262, 262))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAtualizar)
                        .addGap(469, 469, 469))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblAtualizar)
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAtualizarBitcoin, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAtBit, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btAtualizarEthereum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAtEt, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRipple, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAtRi, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void btRippleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRippleActionPerformed
        String r = String.valueOf(c.atualizarCotRip());
        txtAtRi.setText(r);
    }//GEN-LAST:event_btRippleActionPerformed

    private void txtAtBitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAtBitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAtBitActionPerformed

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
//            java.util.logging.Logger.getLogger(AtualizarUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AtualizarUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AtualizarUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AtualizarUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AtualizarUsuarioFrame().setVisible(true);
//            }
//        });
//    }

    private Ripple r;
    private Ethereum e;
    private Bitcoin b;
    private AtualizarController c;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizarBitcoin;
    private javax.swing.JButton btAtualizarEthereum;
    private javax.swing.JButton btRipple;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAtualizar;
    private javax.swing.JTextField txtAtBit;
    private javax.swing.JTextField txtAtEt;
    private javax.swing.JTextField txtAtRi;
    // End of variables declaration//GEN-END:variables
}