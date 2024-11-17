/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ExtratoController;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.Admin;

/**
 *
 * @author unifaljesus
 */
public class ExtratoAdminFrame extends javax.swing.JFrame {

    /**
     * Creates new form ExtratoAdminFrame
     */
    public ExtratoAdminFrame(Admin admin) {
        initComponents();
        c = new ExtratoController(this, admin);
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

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JLabel getLblExtratoAdmin() {
        return lblExtratoAdmin;
    }

    public void setLblExtratoAdmin(JLabel lblExtratoAdmin) {
        this.lblExtratoAdmin = lblExtratoAdmin;
    }

    public JLabel getLblSenhaExtrato() {
        return lblSenhaExtrato;
    }

    public void setLblSenhaExtrato(JLabel lblSenhaExtrato) {
        this.lblSenhaExtrato = lblSenhaExtrato;
    }

    public JTextField getTxtCPF() {
        return txtCPF;
    }

    public void setTxtCPF(JTextField txtCPF) {
        this.txtCPF = txtCPF;
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

        lblExtratoAdmin = new javax.swing.JLabel();
        lblSenhaExtrato = new javax.swing.JLabel();
        btAcessarExtrato = new javax.swing.JButton();
        txtCPF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtExtrato = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EXCHANGE DE CRIPTOMOEDAS ADMIN");

        lblExtratoAdmin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblExtratoAdmin.setText("EXTRATO - ADMIN");

        lblSenhaExtrato.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSenhaExtrato.setText("CPF:");

        btAcessarExtrato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btAcessarExtrato.setText("Acessar");
        btAcessarExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcessarExtratoActionPerformed(evt);
            }
        });

        txtExtrato.setColumns(20);
        txtExtrato.setRows(5);
        jScrollPane1.setViewportView(txtExtrato);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(lblSenhaExtrato)
                        .addGap(46, 46, 46)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(btAcessarExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addComponent(lblExtratoAdmin)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblExtratoAdmin)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btAcessarExtrato)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSenhaExtrato)))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
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
//            java.util.logging.Logger.getLogger(ExtratoAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ExtratoAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ExtratoAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ExtratoAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ExtratoAdminFrame().setVisible(true);
//            }
//        });
//    }

    private ExtratoController c;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAcessarExtrato;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblExtratoAdmin;
    private javax.swing.JLabel lblSenhaExtrato;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextArea txtExtrato;
    // End of variables declaration//GEN-END:variables
}