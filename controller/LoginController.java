/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.Conexao;
import DAO.UsuarioDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import view.MenuUsuarioFrame;
import view.LoginUsuarioFrame;


/**
 *
 * @author unifboliveira
 */
public class LoginController {
    private LoginUsuarioFrame view;

    public LoginController(LoginUsuarioFrame view) {
        this.view = view;
    }
    
    public void loginUsuario(){
        Usuario usuario = new Usuario(view.getTxtCPF().getText(), 
                view.getPwdLogin().getText(), null, 0, 0, 0, 0);
        Conexao conexao = new Conexao();
        
        try{
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            ResultSet res = dao.consultar(usuario);
            if(res.next()){
                JOptionPane.showMessageDialog(view, "Login Efetuado",
                        "Aviso",JOptionPane.INFORMATION_MESSAGE);
                String CPF = res.getString("cpf");
                String Senha = res.getString("senha");
                String Nome = res.getString("nome");
                double Saldo = res.getDouble("saldo");
                double Bitcoin = res.getDouble("bitcoin");
                double Ethereum = res.getDouble("ethereum");
                double Ripple = res.getDouble("ripple");
                Usuario usuario1 = new Usuario(CPF, Senha, Nome, Saldo, Bitcoin, Ethereum, Ripple);
                MenuUsuarioFrame uf = new MenuUsuarioFrame(usuario1);
                uf.setVisible(true);
                view.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(view, "Login Não Efetuado",
                        "Erro",JOptionPane.ERROR_MESSAGE);
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(view, "Erro de conexao",
                        "Erro",JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }
}
    

