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
import view.SaldoUsuarioFrame;

/**
 *
 * @author Aline Rocha
 */
public class SaldoController {
    private SaldoUsuarioFrame view;
    private Usuario usuario;

    public SaldoController(SaldoUsuarioFrame view, Usuario usuario) {
        this.view = view;
        this.usuario = usuario;
    }

    public SaldoController() {
    }
    
    public String consultarSaldo(){
       String verificaSenha = view.getPwdSaldo().getText();
       String senha = usuario.getSenha();
       
       if(senha.equals(verificaSenha)){
           String cpf = usuario.getCPF();
           String nome = usuario.getNome();
           double valor = usuario.getReais();
           double bitcoin = usuario.getBitcoin();
           double ethereum = usuario.getEthereum();
           double ripple = usuario.getRipple();
           Usuario usuario1 = new Usuario(cpf, senha, nome, valor, bitcoin, ethereum, ripple);
           Conexao conexao = new Conexao();
           
           try{
                Connection conn = conexao.getConnection();
                UsuarioDAO dao = new UsuarioDAO(conn);
                ResultSet res = dao.consultar(usuario1);
                if(res.next()){
                    String CPF = res.getString("cpf");
                    String Nome = res.getString("nome");
                    double Valor = res.getDouble("saldo");
                    double Bitcoin = res.getDouble("bitcoin");
                    double Ethereum = res.getDouble("ethereum");
                    double Ripple = res.getDouble("ripple");
                   
                    return "Nome: " + Nome + 
                            "\nCPF:" + CPF + 
                            "\n\nReais: " + Valor +
                            "\nBitcoin: " + Bitcoin + 
                            "\nEthereum: " + Ethereum +
                            "\nRipple: " + Ripple;               
                }else{
                    JOptionPane.showMessageDialog(view, "Erro ao Consultar Saldo",
                            "Erro",JOptionPane.ERROR_MESSAGE);
                }
            } catch(SQLException e){
                JOptionPane.showMessageDialog(view, "Erro de conexao",
                            "Erro",JOptionPane.ERROR_MESSAGE);
                System.out.println(e);
            }
           
       }
       else {
           JOptionPane.showMessageDialog(view, "Senha Incorreta!",
                        "Erro",JOptionPane.ERROR_MESSAGE);
       }
       
      return "";
    }
    
}
