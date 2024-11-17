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
import view.SaqueUsuarioFrame;

/**
 *
 * @author unifboliveira
 */
public class SaqueController {
    private Usuario usuario;
    private SaqueUsuarioFrame view;

    public SaqueController(SaqueUsuarioFrame view, Usuario usuario) {
        this.usuario = usuario;
        this.view = view;
    }

    public SaqueController() {
    }
    
    public String consultarSaque(){
            String cpf = usuario.getCPF();
            String nome = usuario.getNome();
            String senha = usuario.getSenha();
            double valor = usuario.getReais();
            double bitcoin = usuario.getBitcoin();
            double ethereum = usuario.getEthereum();
            double ripple = usuario.getRipple();
            Usuario usuario1 = new Usuario(cpf, senha, nome, valor, bitcoin, ethereum, ripple);
            System.out.println("Valor no Banco:" + valor);
            Conexao conexao = new Conexao();
           
            try{
                Connection conn = conexao.getConnection();
                System.out.println("Conexão");
                UsuarioDAO dao = new UsuarioDAO(conn);
                System.out.println("DAO");
                ResultSet res = dao.consultarSaldo(usuario1);
                System.out.println("Banana");
                if(res.next()){
                    System.out.println("if");
                    String CPF = res.getString("cpf");
                    String Nome = res.getString("nome");
                    double Valor = res.getDouble("saldo");
                    double Bitcoin = res.getDouble("bitcoin");
                    double Ethereum = res.getDouble("ethereum");
                    double Ripple = res.getDouble("ripple");
                   
                    return "" + Valor;                     
                }else{
                    JOptionPane.showMessageDialog(view, "Erro ao Consultar Saldo",
                            "Erro",JOptionPane.ERROR_MESSAGE);
                }
            } catch(SQLException e){
                JOptionPane.showMessageDialog(view, "Erro de conexao",
                            "Erro",JOptionPane.ERROR_MESSAGE);
                System.out.println(e);
            }
           
        return null;    
    }
    
    public String atualizar(){
       double saldo = Double.parseDouble(consultarSaque());
       //double saldo = usuario.getReais();
       double valor = Double.parseDouble(view.getTxtValorSaq().getText());
       String cpf = usuario.getCPF();
       String senha = usuario.getSenha();
       String nome = usuario.getNome();
       double bitcoin = usuario.getBitcoin();
       double ethereum = usuario.getEthereum();
       double ripple = usuario.getRipple();
       saldo = saldo - valor;
        System.out.println("Novo Saldo:" + saldo);
       Usuario usuario1 = new Usuario(cpf, senha, nome, saldo, bitcoin, ethereum, ripple);
       Conexao conexao = new Conexao();
       
       try{
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            dao.atualizarSaque(usuario1, saldo);
            
            Connection conn1 = conexao.getConnection();
            UsuarioDAO dao1 = new UsuarioDAO(conn1);
            ResultSet res = dao1.consultar(usuario1);
                if(res.next()){
                    JOptionPane.showMessageDialog(view, "Saque efetuado", "Aviso", 
                                JOptionPane.INFORMATION_MESSAGE);
                    int id_investidor = res.getInt("id_investidor");
                    String CPF = res.getString("cpf");
                    String Nome = res.getString("nome");
                    double Valor = res.getDouble("saldo");
                    double Bitcoin = res.getDouble("bitcoin");
                    double Ethereum = res.getDouble("ethereum");
                    double Ripple = res.getDouble("ripple");
                    
                    dao1.inserirExtrato(usuario1, valor, id_investidor);
                    
                    return "Nome: " + Nome + 
                            "\nCPF:" + CPF + 
                            "\n\nReais: " + Valor +
                            "\nBitcoin: " + Bitcoin + 
                            "\nEthereum: " + Ethereum +
                            "\nRipple: " + Ripple;         
                }else{
                    JOptionPane.showMessageDialog(view, "Erro ao Consultar Saque",
                            "Erro",JOptionPane.ERROR_MESSAGE);
                }
           
       } catch(SQLException e){
           JOptionPane.showMessageDialog(view, "Saque não efetuado", "Erro", 
                   JOptionPane.ERROR_MESSAGE);
       }
       
       return "";
   } 
}
