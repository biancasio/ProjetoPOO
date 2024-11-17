/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.CadCriController;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model.Admin;

/**
 *
 * @author unifaljesus
 */
public class CadCriAdminFrame extends javax.swing.JFrame {

    /**
     * Creates new form CadCriAdminFrame
     */
    public CadCriAdminFrame(Admin admin) {
        initComponents();
        c = new CadCriController(this, admin);
    }

    public CadCriController getC() {
        return c;
    }

    public void setC(CadCriController c) {
        this.c = c;
    }

    public JButton getBtCadastrar() {
        return btCadastrar;
    }

    public void setBtCadastrar(JButton btCadastrar) {
        this.btCadastrar = btCadastrar;
    }

    public JLabel getLblCadCri() {
        return lblCadCri;
    }

    public void setLblCadCri(JLabel lblCadCri) {
        this.lblCadCri = lblCadCri;
    }

    public JLabel getLblCota() {
        return lblCota;
    }

    public void setLblCota(JLabel lblCota) {
        this.lblCota = lblCota;
    }

    public JLabel getLblNome() {
        return lblNome;
    }

    public void setLblNome(JLabel lblNome) {
        this.lblNome = lblNome;
    }

    public JLabel getLblTaxaCompra() {
        return lblTaxaCompra;
    }

    public void setLblTaxaCompra(JLabel lblTaxaCompra) {
        this.lblTaxaCompra = lblTaxaCompra;
    }

    public JLabel getLblTaxaVenda() {
        return lblTaxaVenda;
    }

    public void setLblTaxaVenda(JLabel lblTaxaVenda) {
        this.lblTaxaVenda = lblTaxaVenda;
    }

    public JTextField getTxtCota() {
        return txtCota;
    }

    public void setTxtCota(JTextField txtCota) {
        this.txtCota = txtCota;
    }

    public JTextField getTxtNome() {
        return txtNome;
    }

    public void setTxtNome(JTextField txtNome) {
        this.txtNome = txtNome;
    }

    public JTextField getTxtTaxaCompra() {
        return txtTaxaCompra;
    }

    public void setTxtTaxaCompra(JTextField txtTaxaCompra) {
        this.txtTaxaCompra = txtTaxaCompra;
    }

    public JTextField getTxtTaxaVenda() {
        return txtTaxaVenda;
    }

    public void setTxtTaxaVenda(JTextField txtTaxaVenda) {
        this.txtTaxaVenda = txtTaxaVenda;
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTaxaCompra = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCota = new javax.swing.JTextField();
        txtTaxaCompra = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        lblCadCri = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCota = new javax.swing.JLabel();
        lblTaxaVenda = new javax.swing.JLabel();
        txtTaxaVenda = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EXCHANGE DE CRIPTOMOEDAS ADMIN");

        lblTaxaCompra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTaxaCompra.setText("Taxa de Compra:");

        btCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        lblCadCri.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblCadCri.setText("CADASTRO DE CRIPTOMOEDA");

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNome.setText("Nome:");

        lblCota.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCota.setText("Cotação:");

        lblTaxaVenda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTaxaVenda.setText("Taxa de Venda:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTaxaVenda)
                            .addComponent(lblCota)
                            .addComponent(lblNome)
                            .addComponent(lblTaxaCompra))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCota)
                                .addComponent(txtNome)
                                .addComponent(txtTaxaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTaxaVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(btCadastrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(lblCadCri, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblCadCri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCota, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTaxaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTaxaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addGap(18, 18, 18)
                        .addComponent(lblCota)
                        .addGap(18, 18, 18)
                        .addComponent(lblTaxaCompra)
                        .addGap(18, 18, 18)
                        .addComponent(lblTaxaVenda)))
                .addGap(49, 49, 49)
                .addComponent(btCadastrar)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        c.salvarCripto();
    }//GEN-LAST:event_btCadastrarActionPerformed

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
//            java.util.logging.Logger.getLogger(CadCriAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CadCriAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CadCriAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CadCriAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CadCriAdminFrame().setVisible(true);
//            }
//        });
//    }

    private CadCriController c;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JLabel lblCadCri;
    private javax.swing.JLabel lblCota;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTaxaCompra;
    private javax.swing.JLabel lblTaxaVenda;
    private javax.swing.JTextField txtCota;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTaxaCompra;
    private javax.swing.JTextField txtTaxaVenda;
    // End of variables declaration//GEN-END:variables
}
