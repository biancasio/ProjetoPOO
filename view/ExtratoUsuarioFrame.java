/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ExtratoController;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import model.Usuario;

/**
 *
 * @author unifaljesus
 */
public class ExtratoUsuarioFrame extends javax.swing.JFrame {

    /**
     * Creates new form ExtratoUsuarioFrame
     */
    public ExtratoUsuarioFrame(Usuario usuario) {
        initComponents();
        c = new ExtratoController(this, usuario);
    }

    public ExtratoController getC() {
        return c;
    }

    public void setC(ExtratoController c) {
        this.c = c;
    }

    public JButton getBtAcessarExtrato() {
        return btAcessarExtrato;
    }

    public void setBtAcessarExtrato(JButton btAcessarExtrato) {
        this.btAcessarExtrato = btAcessarExtrato;
    }

    public JLabel getLblExtrato() {
        return lblExtrato;
    }

    public void setLblExtrato(JLabel lblExtrato) {
        this.lblExtrato = lblExtrato;
    }

    public JLabel getLblSenhaExtrato() {
        return lblSenhaExtrato;
    }

    public void setLblSenhaExtrato(JLabel lblSenhaExtrato) {
        this.lblSenhaExtrato = lblSenhaExtrato;
    }

    public JPasswordField getPwdExtrato() {
        return pwdExtrato;
    }

    public void setPwdExtrato(JPasswordField pwdExtrato) {
        this.pwdExtrato = pwdExtrato;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextArea getTxtExtrato() {
        return txtExtrato;
    }

    public void setTxtExtrato(JTextArea txtExtrato) {
        this.txtExtrato = txtExtrato;
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
        btAcessarExtrato = new javax.swing.JButton();
        lblExtrato = new javax.swing.JLabel();
        pwdExtrato = new javax.swing.JPasswordField();
        lblSenhaExtrato = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtExtrato = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EXCHANGE DE CRIPTOMOEDAS");
        setPreferredSize(new java.awt.Dimension(1300, 600));

        jPanel1.setBackground(new java.awt.Color(106, 48, 103));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 600));

        btAcessarExtrato.setBackground(new java.awt.Color(134, 75, 131));
        btAcessarExtrato.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btAcessarExtrato.setForeground(new java.awt.Color(255, 255, 255));
        btAcessarExtrato.setText("Acessar");
        btAcessarExtrato.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAcessarExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcessarExtratoActionPerformed(evt);
            }
        });

        lblExtrato.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lblExtrato.setForeground(new java.awt.Color(255, 255, 255));
        lblExtrato.setText("EXTRATO");

        lblSenhaExtrato.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lblSenhaExtrato.setForeground(new java.awt.Color(255, 255, 255));
        lblSenhaExtrato.setText("Senha:");

        txtExtrato.setColumns(20);
        txtExtrato.setRows(5);
        jScrollPane1.setViewportView(txtExtrato);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(301, 301, 301)
                                .addComponent(lblExtrato)
                                .addGap(365, 365, 365))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSenhaExtrato)
                                .addGap(74, 74, 74)
                                .addComponent(pwdExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(btAcessarExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblExtrato)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAcessarExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwdExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenhaExtrato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
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

    private void btAcessarExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcessarExtratoActionPerformed
        c.mostrarExtrato();
    }//GEN-LAST:event_btAcessarExtratoActionPerformed

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
//            java.util.logging.Logger.getLogger(ExtratoUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ExtratoUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ExtratoUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ExtratoUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ExtratoUsuarioFrame().setVisible(true);
//            }
//        });
//    }

    private ExtratoController c;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAcessarExtrato;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblExtrato;
    private javax.swing.JLabel lblSenhaExtrato;
    private javax.swing.JPasswordField pwdExtrato;
    private javax.swing.JTextArea txtExtrato;
    // End of variables declaration//GEN-END:variables
}
