/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.VenderController;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.Usuario;

/**
 *
 * @author unifaljesus
 */
public class VenderUsuarioFrame extends javax.swing.JFrame {

    /**
     * Creates new form VenderUsuarioFrame
     */
    public VenderUsuarioFrame(Usuario usuario) {
        initComponents();
        c = new VenderController(this, usuario);
    }

    public VenderController getC() {
        return c;
    }

    public void setC(VenderController c) {
        this.c = c;
    }

    public JButton getBtAcessarVender() {
        return btAcessarVender;
    }

    public void setBtAcessarVender(JButton btAcessarVender) {
        this.btAcessarVender = btAcessarVender;
    }

    public JButton getBtVenderBit() {
        return btVenderBit;
    }

    public void setBtVenderBit(JButton btVenderBit) {
        this.btVenderBit = btVenderBit;
    }

    public JButton getBtVenderEthe() {
        return btVenderEthe;
    }

    public void setBtVenderEthe(JButton btVenderEthe) {
        this.btVenderEthe = btVenderEthe;
    }

    public JButton getBtVenderRip() {
        return btVenderRip;
    }

    public void setBtVenderRip(JButton btVenderRip) {
        this.btVenderRip = btVenderRip;
    }

    public JLabel getLblBit() {
        return lblBit;
    }

    public void setLblBit(JLabel lblBit) {
        this.lblBit = lblBit;
    }

    public JLabel getLblEthe() {
        return lblEthe;
    }

    public void setLblEthe(JLabel lblEthe) {
        this.lblEthe = lblEthe;
    }

    public JLabel getLblRip() {
        return lblRip;
    }

    public void setLblRip(JLabel lblRip) {
        this.lblRip = lblRip;
    }

    public JLabel getLblSenhaVender() {
        return lblSenhaVender;
    }

    public void setLblSenhaVender(JLabel lblSenhaVender) {
        this.lblSenhaVender = lblSenhaVender;
    }

    public JLabel getLblVender() {
        return lblVender;
    }

    public void setLblVender(JLabel lblVender) {
        this.lblVender = lblVender;
    }

    public JPasswordField getPwdVender() {
        return pwdVender;
    }

    public void setPwdVender(JPasswordField pwdVender) {
        this.pwdVender = pwdVender;
    }

    public JTextField getTxtCotBitcoin() {
        return txtCotBitcoin;
    }

    public void setTxtCotBitcoin(JTextField txtCotBitcoin) {
        this.txtCotBitcoin = txtCotBitcoin;
    }

    public JTextField getTxtCotEthereum() {
        return txtCotEthereum;
    }

    public void setTxtCotEthereum(JTextField txtCotEthereum) {
        this.txtCotEthereum = txtCotEthereum;
    }

    public JTextField getTxtCotRipple() {
        return txtCotRipple;
    }

    public void setTxtCotRipple(JTextField txtCotRipple) {
        this.txtCotRipple = txtCotRipple;
    }

    public JTextField getTxtQuantBitcoin() {
        return txtQuantBitcoin;
    }

    public void setTxtQuantBitcoin(JTextField txtQuantBitcoin) {
        this.txtQuantBitcoin = txtQuantBitcoin;
    }

    public JTextField getTxtQuantEthereum() {
        return txtQuantEthereum;
    }

    public void setTxtQuantEthereum(JTextField txtQuantEthereum) {
        this.txtQuantEthereum = txtQuantEthereum;
    }

    public JTextField getTxtQuantRipple() {
        return txtQuantRipple;
    }

    public void setTxtQuantRipple(JTextField txtQuantRipple) {
        this.txtQuantRipple = txtQuantRipple;
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
        txtQuantBitcoin = new javax.swing.JTextField();
        btVenderBit = new javax.swing.JButton();
        btVenderEthe = new javax.swing.JButton();
        txtQuantEthereum = new javax.swing.JTextField();
        txtQuantRipple = new javax.swing.JTextField();
        btVenderRip = new javax.swing.JButton();
        btAcessarVender = new javax.swing.JButton();
        pwdVender = new javax.swing.JPasswordField();
        lblVender = new javax.swing.JLabel();
        txtCotBitcoin = new javax.swing.JTextField();
        txtCotEthereum = new javax.swing.JTextField();
        txtCotRipple = new javax.swing.JTextField();
        lblBit = new javax.swing.JLabel();
        lblEthe = new javax.swing.JLabel();
        lblRip = new javax.swing.JLabel();
        lblSenhaVender = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EXCHANGE DE CRIPTOMOEDAS");
        setPreferredSize(new java.awt.Dimension(1300, 600));

        jPanel1.setBackground(new java.awt.Color(106, 48, 103));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 600));

        btVenderBit.setBackground(new java.awt.Color(134, 75, 131));
        btVenderBit.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btVenderBit.setForeground(new java.awt.Color(255, 255, 255));
        btVenderBit.setText("Vender");
        btVenderBit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btVenderBit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVenderBitActionPerformed(evt);
            }
        });

        btVenderEthe.setBackground(new java.awt.Color(134, 75, 131));
        btVenderEthe.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btVenderEthe.setForeground(new java.awt.Color(255, 255, 255));
        btVenderEthe.setText("Vender");
        btVenderEthe.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btVenderEthe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVenderEtheActionPerformed(evt);
            }
        });

        btVenderRip.setBackground(new java.awt.Color(134, 75, 131));
        btVenderRip.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btVenderRip.setForeground(new java.awt.Color(255, 255, 255));
        btVenderRip.setText("Vender");
        btVenderRip.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btVenderRip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVenderRipActionPerformed(evt);
            }
        });

        btAcessarVender.setBackground(new java.awt.Color(134, 75, 131));
        btAcessarVender.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btAcessarVender.setForeground(new java.awt.Color(255, 255, 255));
        btAcessarVender.setText("Acessar");
        btAcessarVender.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAcessarVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcessarVenderActionPerformed(evt);
            }
        });

        lblVender.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lblVender.setForeground(new java.awt.Color(255, 255, 255));
        lblVender.setText("VENDER CRIPTOMOEDAS");

        lblBit.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lblBit.setForeground(new java.awt.Color(255, 255, 255));
        lblBit.setText("Cotação Bitcoin:");

        lblEthe.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lblEthe.setForeground(new java.awt.Color(255, 255, 255));
        lblEthe.setText("Cotação Ethereum:");

        lblRip.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lblRip.setForeground(new java.awt.Color(255, 255, 255));
        lblRip.setText("Cotação Ripple:");

        lblSenhaVender.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lblSenhaVender.setForeground(new java.awt.Color(255, 255, 255));
        lblSenhaVender.setText("Senha:");

        lblQuantidade.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lblQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantidade.setText("Quantidade:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSenhaVender)
                        .addGap(60, 60, 60)
                        .addComponent(pwdVender, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEthe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBit, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRip, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCotBitcoin, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCotRipple, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtQuantBitcoin, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(txtQuantRipple))
                                .addGap(63, 63, 63))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCotEthereum, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btAcessarVender, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(261, 261, 261))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(btVenderBit, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btVenderRip, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(158, 158, 158))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblVender)
                        .addGap(478, 478, 478))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(503, 503, 503))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtQuantEthereum, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188)
                .addComponent(btVenderEthe, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblVender)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwdVender, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAcessarVender, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenhaVender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(lblQuantidade)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCotBitcoin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtQuantBitcoin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btVenderBit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCotEthereum, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtQuantEthereum, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEthe, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btVenderEthe, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRip, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCotRipple, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantRipple, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVenderRip, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAcessarVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcessarVenderActionPerformed
        c.venderCriptomoeda();
    }//GEN-LAST:event_btAcessarVenderActionPerformed

    private void btVenderBitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVenderBitActionPerformed
        c.venderBitcoin();
    }//GEN-LAST:event_btVenderBitActionPerformed

    private void btVenderEtheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVenderEtheActionPerformed
        c.venderEthereum();
    }//GEN-LAST:event_btVenderEtheActionPerformed

    private void btVenderRipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVenderRipActionPerformed
        c.venderRipple();
    }//GEN-LAST:event_btVenderRipActionPerformed

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
//            java.util.logging.Logger.getLogger(VenderUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VenderUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VenderUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VenderUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VenderUsuarioFrame().setVisible(true);
//            }
//        });
//    }

    private VenderController c;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAcessarVender;
    private javax.swing.JButton btVenderBit;
    private javax.swing.JButton btVenderEthe;
    private javax.swing.JButton btVenderRip;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBit;
    private javax.swing.JLabel lblEthe;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblRip;
    private javax.swing.JLabel lblSenhaVender;
    private javax.swing.JLabel lblVender;
    private javax.swing.JPasswordField pwdVender;
    private javax.swing.JTextField txtCotBitcoin;
    private javax.swing.JTextField txtCotEthereum;
    private javax.swing.JTextField txtCotRipple;
    private javax.swing.JTextField txtQuantBitcoin;
    private javax.swing.JTextField txtQuantEthereum;
    private javax.swing.JTextField txtQuantRipple;
    // End of variables declaration//GEN-END:variables
}