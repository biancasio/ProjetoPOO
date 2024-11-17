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
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import model.Bitcoin;
import model.Ethereum;
import model.Ripple;
import model.Usuario;
import view.VenderUsuarioFrame;

/**
 *
 * @author Aline Rocha
 */
public class VenderController {
    private VenderUsuarioFrame view;
    private Usuario usuario;

    public VenderController(VenderUsuarioFrame view, Usuario usuario) {
        this.view = view;
        this.usuario = usuario;
    }

    public VenderController() {
    }
    
    public void venderCriptomoeda(){
        DecimalFormat deci = new DecimalFormat("0,00");
        Bitcoin bitcoin = new Bitcoin("Bitcoin", 5, 0.02, 0.03);
        Ethereum ethereum = new Ethereum("Ethereum", 5, 0.01, 0.02);
        Ripple ripple = new Ripple("Ripple", 5, 0.01, 0.01);
        String verificaSenha = view.getPwdVender().getText();
        String senha = usuario.getSenha();
       
        if(senha.equals(verificaSenha)){
           String cpf = usuario.getCPF();
           String nome = usuario.getNome();
           double valor = usuario.getReais();
           double bitcoins = usuario.getBitcoin();
           double ethereums = usuario.getEthereum();
           double ripples = usuario.getRipple();
           Usuario usuario1 = new Usuario(cpf, senha, nome, valor, bitcoins, ethereums, ripples);
           Conexao conexao = new Conexao();
           
           try{
                    mostrarBitcoin();
                    mostrarEthereum();
                    mostrarRipple();
                    
                    Connection conn = conexao.getConnection();
                    UsuarioDAO dao = new UsuarioDAO(conn);
                    ResultSet res = dao.consultar(usuario1);
                    
                    /*
                    if(res.next()){
                        String CPF = res.getString("cpf");
                        String Nome = res.getString("nome");
                        double Valor = res.getDouble("saldo");
                        double Bitcoin = bitcoin.getNovaCotacao();
                        double Ethereum = ethereum.getNovaCotacao();
                        double Ripple = ripple.getNovaCotacao();

                        view.getTxtCotBitcoin().setText("" + Bitcoin);
                        view.getTxtCotEthereum().setText("" + Ethereum);
                        view.getTxtCotRipple().setText("" + Ripple);
                        //view.getTxtCotRipple().setText("" + deci.format(Ripple));
                    }else{
                        JOptionPane.showMessageDialog(view, "Erro ao Consultar Saldo",
                                "Erro",JOptionPane.ERROR_MESSAGE);
                    }
                    */
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

    }
    
    public void mostrarBitcoin(){
        Conexao conexao = new Conexao();
        
        try{
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            ResultSet res = dao.consultarCriptomoeda("Bitcoin");
            if(res.next()){
                double cotacaoBit = res.getDouble("cotacao");
                view.getTxtCotBitcoin().setText("" + cotacaoBit);
            
            }else{
                JOptionPane.showMessageDialog(view, "Bitcoin não apareceu",
                        "Erro",JOptionPane.ERROR_MESSAGE);
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(view, "Erro de conexao",
                        "Erro",JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }
    
    public void mostrarEthereum(){
        Conexao conexao = new Conexao();
        
        try{
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            ResultSet res = dao.consultarCriptomoeda("Ethereum");
            if(res.next()){
                double cotacaoEthe = res.getDouble("cotacao");
                view.getTxtCotEthereum().setText("" + cotacaoEthe);
            
            }else{
                JOptionPane.showMessageDialog(view, "Ethereum não apareceu",
                        "Erro",JOptionPane.ERROR_MESSAGE);
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(view, "Erro de conexao",
                        "Erro",JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }
    
    public void mostrarRipple(){
        Conexao conexao = new Conexao();
        
        try{
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            ResultSet res = dao.consultarCriptomoeda("Ripple");
            if(res.next()){
                double cotacaoRip = res.getDouble("cotacao");
                view.getTxtCotRipple().setText("" + cotacaoRip);
            
            }else{
                JOptionPane.showMessageDialog(view, "Ripple não apareceu",
                        "Erro",JOptionPane.ERROR_MESSAGE);
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(view, "Erro de conexao",
                        "Erro",JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }
    
    public void venderBitcoin(){
        Bitcoin bitcoin = new Bitcoin("Bitcoin", 5, 0.02, 0.03);
        int quantidade = Integer.parseInt(view.getTxtQuantBitcoin().getText());
        double cotacao = Double.parseDouble(view.getTxtCotBitcoin().getText());
        double preco = (cotacao * quantidade) + (cotacao * quantidade * 0.03);
        Conexao conexao = new Conexao();
        
        try{
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            ResultSet res = dao.consultar(usuario);
            if(res.next()){
                JOptionPane.showMessageDialog(view, "Bitcoin Vendido",
                        "Aviso",JOptionPane.INFORMATION_MESSAGE);
                int id_investidor = res.getInt("id_investidor");
                String CPF = res.getString("cpf");
                String Senha = res.getString("senha");
                String Nome = res.getString("nome");
                double Saldo = res.getDouble("saldo");
                double Bitcoin = res.getDouble("bitcoin");
                double Ethereum = res.getDouble("ethereum");
                double Ripple = res.getDouble("ripple");
                Saldo = Saldo + preco;
                Bitcoin = Bitcoin - quantidade;
                                
                Usuario usuario1 = new Usuario(CPF, Senha, Nome, Saldo, Bitcoin, Ethereum, Ripple);
                dao.venderBitcoin(usuario1);
                
                Connection conn1 = conexao.getConnection();
                UsuarioDAO dao1 = new UsuarioDAO(conn1);
                ResultSet res1 = dao1.consultar(usuario1);
                dao1.retirarExtBit(usuario1, bitcoin, preco, cotacao, id_investidor);
                
                Connection conn2 = conexao.getConnection();
                UsuarioDAO dao2 = new UsuarioDAO(conn2);
                ResultSet res2 = dao2.consultar(usuario1);
                dao2.atualizarDeposito(usuario1, Saldo);
            }else{
                JOptionPane.showMessageDialog(view, "Bitcoin não vendido",
                        "Erro",JOptionPane.ERROR_MESSAGE);
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(view, "Erro de conexao",
                        "Erro",JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }
    
    public void venderEthereum(){
        Ethereum ethereum = new Ethereum("Ethereum", 5, 0.01, 0.02);
        int quantidade = Integer.parseInt(view.getTxtQuantEthereum().getText());
        double cotacao = Double.parseDouble(view.getTxtCotEthereum().getText());
        double preco = (cotacao * quantidade) + (cotacao * quantidade * 0.02);
        Conexao conexao = new Conexao();
        
        try{
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            ResultSet res = dao.consultar(usuario);
            if(res.next()){
                JOptionPane.showMessageDialog(view, "Ethereum Vendido",
                        "Aviso",JOptionPane.INFORMATION_MESSAGE);
                int id_investidor = res.getInt("id_investidor");
                String CPF = res.getString("cpf");
                String Senha = res.getString("senha");
                String Nome = res.getString("nome");
                double Saldo = res.getDouble("saldo");
                double Bitcoin = res.getDouble("bitcoin");
                double Ethereum = res.getDouble("ethereum");
                double Ripple = res.getDouble("ripple");
                Saldo = Saldo + preco;
                Ethereum = Ethereum - quantidade;
                
                Usuario usuario1 = new Usuario(CPF, Senha, Nome, Saldo, Bitcoin, Ethereum, Ripple);
                dao.venderEthereum(usuario1);
                
                Connection conn1 = conexao.getConnection();
                UsuarioDAO dao1 = new UsuarioDAO(conn1);
                ResultSet res1 = dao1.consultar(usuario1);
                dao1.retirarExtEthe(usuario1, ethereum, preco, cotacao, id_investidor);
                
                Connection conn2 = conexao.getConnection();
                UsuarioDAO dao2 = new UsuarioDAO(conn2);
                ResultSet res2 = dao2.consultar(usuario1);
                dao2.atualizarDeposito(usuario1, Saldo);
            }else{
                JOptionPane.showMessageDialog(view, "Ethereum não vendido",
                        "Erro",JOptionPane.ERROR_MESSAGE);
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(view, "Erro de conexao",
                        "Erro",JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }
    
    public void venderRipple(){
        Ripple ripple = new Ripple("Ripple", 5, 0.01, 0.01);
        int quantidade = Integer.parseInt(view.getTxtQuantRipple().getText());
        double cotacao = Double.parseDouble(view.getTxtCotRipple().getText());
        double preco = (cotacao * quantidade) + (cotacao * quantidade * 0.01);
        Conexao conexao = new Conexao();
        
        try{
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            ResultSet res = dao.consultar(usuario);
            if(res.next()){
                JOptionPane.showMessageDialog(view, "Ripple Vendido",
                        "Aviso",JOptionPane.INFORMATION_MESSAGE);
                int id_investidor = res.getInt("id_investidor");
                String CPF = res.getString("cpf");
                String Senha = res.getString("senha");
                String Nome = res.getString("nome");
                double Saldo = res.getDouble("saldo");
                double Bitcoin = res.getDouble("bitcoin");
                double Ethereum = res.getDouble("ethereum");
                double Ripple = res.getDouble("ripple");
                Saldo = Saldo + preco;
                Ripple = Ripple - quantidade;
                                
                Usuario usuario1 = new Usuario(CPF, Senha, Nome, Saldo, Bitcoin, Ethereum, Ripple);
                dao.venderRipple(usuario1);
                
                Connection conn1 = conexao.getConnection();
                UsuarioDAO dao1 = new UsuarioDAO(conn1);
                ResultSet res1 = dao1.consultar(usuario1);
                dao1.retirarExtRip(usuario1, ripple, preco, cotacao, id_investidor);
                
                Connection conn2 = conexao.getConnection();
                UsuarioDAO dao2 = new UsuarioDAO(conn2);
                ResultSet res2 = dao2.consultar(usuario1);
                dao2.atualizarDeposito(usuario1, Saldo);
            }else{
                JOptionPane.showMessageDialog(view, "Ripple não vendido",
                        "Erro",JOptionPane.ERROR_MESSAGE);
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(view, "Erro de conexao",
                        "Erro",JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }
    
}
