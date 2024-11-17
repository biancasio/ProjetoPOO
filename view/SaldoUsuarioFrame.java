/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.SaldoController;
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
public class SaldoUsuarioFrame extends javax.swing.JFrame {

    /**
     * Creates new form SaldoUsuarioFrame
     */
    public SaldoUsuarioFrame(Usuario usuario) {
        initComponents();
        c = new SaldoController(this, usuario);
    }

    public SaldoController getC() {
        return c;
    }

    public void setC(SaldoController c) {
        this.c = c;
    }

    public JButton getBtAcessar() {
        return btAcessar;
    }

    public void setBtAcessar(JButton btAcessar) {
        this.btAcessar = btAcessar;
    }

    public JLabel getLblSaldo() {
        return lblSaldo;
    }

    public void setLblSaldo(JLabel lblSaldo) {
        this.lblSaldo = lblSaldo;
    }

    public JLabel getLblSenhaSal() {
        return lblSenhaSal;
    }

    public void setLblSenhaSal(JLabel lblSenhaSal) {
        this.lblSenhaSal = lblSenhaSal;
    }

    public JPanel getPanelSaldo() {
        return panelSaldo;
    }

    public void setPanelSaldo(JPanel panelSaldo) {
        this.panelSaldo = panelSaldo;
    }

    public JPasswordField getPwdSaldo() {
        return pwdSaldo;
    }

    public void setPwdSaldo(JPasswordField pwdSaldo) {
        this.pwdSaldo = pwdSaldo;
    }

    public JScrollPane getJScrollPane() {
        return JScrollPane;
    }

    public void setJScrollPane(JScrollPane JScrollPane) {
        this.JScrollPane = JScrollPane;
    }

    public JTextArea getTxtMostraSaldo() {
        return txtMostraSaldo;
    }

    public void setTxtMostraSaldo(JTextArea txtMostraSaldo) {
        this.txtMostraSaldo = txtMostraSaldo;
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
        lblSaldo = new javax.swing.JLabel();
        lblSenhaSal = new javax.swing.JLabel();
        pwdSaldo = new javax.swing.JPasswordField();
        btAcessar = new javax.swing.JButton();
        panelSaldo = new javax.swing.JPanel();
        JScrollPane = new javax.swing.JScrollPane();
        txtMostraSaldo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EXCHANGE DE CRIPTOMOEDAS");
        setPreferredSize(new java.awt.Dimension(1300, 600));

        jPanel1.setBackground(new java.awt.Color(106, 48, 103));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 600));

        lblSaldo.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lblSaldo.setForeground(new java.awt.Color(255, 255, 255));
        lblSaldo.setText("SALDO");

        lblSenhaSal.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lblSenhaSal.setForeground(new java.awt.Color(255, 255, 255));
        lblSenhaSal.setText("Senha:");

        btAcessar.setBackground(new java.awt.Color(134, 75, 131));
        btAcessar.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btAcessar.setForeground(new java.awt.Color(255, 255, 255));
        btAcessar.setText("Acessar");
        btAcessar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcessarActionPerformed(evt);
            }
        });

        panelSaldo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMostraSaldo.setColumns(20);
        txtMostraSaldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMostraSaldo.setRows(5);
        JScrollPane.setViewportView(txtMostraSaldo);

        javax.swing.GroupLayout panelSaldoLayout = new javax.swing.GroupLayout(panelSaldo);
        panelSaldo.setLayout(panelSaldoLayout);
        panelSaldoLayout.setHorizontalGroup(
            panelSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
        );
        panelSaldoLayout.setVerticalGroup(
            panelSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSenhaSal)
                .addGap(59, 59, 59)
                .addComponent(pwdSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btAcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(322, 322, 322))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(587, 587, 587)
                        .addComponent(lblSaldo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(panelSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(280, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblSaldo)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwdSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenhaSal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(panelSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcessarActionPerformed
        System.out.println(c.consultarSaldo());
        //c.consultarSaldo();
        
        String r = c.consultarSaldo();
        txtMostraSaldo.setText(r);
    }//GEN-LAST:event_btAcessarActionPerformed

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
//            java.util.logging.Logger.getLogger(SaldoUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SaldoUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SaldoUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SaldoUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SaldoUsuarioFrame().setVisible(true);
//            }
//        });
//    }
    
    private SaldoController c;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JButton btAcessar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblSenhaSal;
    private javax.swing.JPanel panelSaldo;
    private javax.swing.JPasswordField pwdSaldo;
    private javax.swing.JTextArea txtMostraSaldo;
    // End of variables declaration//GEN-END:variables
}
