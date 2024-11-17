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
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import model.Bitcoin;
import model.Ethereum;
import model.Ripple;
import model.Usuario;
import view.AtualizarUsuarioFrame;

/**
 *
 * @author Aline Rocha
 */
public class AtualizarController {
    private AtualizarUsuarioFrame view;
    private Usuario usuario;
    private Bitcoin bitcoin;
    private Ripple ripple;
    private Ethereum ethereum;
    private double novaCotacaoBit = 5;

    public AtualizarController(AtualizarUsuarioFrame view, Usuario usuario, Bitcoin bitcoin, Ripple ripple, Ethereum ethereum) {
        this.view = view;
        this.usuario = usuario;
        this.bitcoin = bitcoin;
        this.ripple = ripple;
        this.ethereum = ethereum;
    }

    public AtualizarController(Bitcoin bitcoin, Ripple ripple, Ethereum ethereum) {
        this.bitcoin = bitcoin;
        this.ripple = ripple;
        this.ethereum = ethereum;
    }
    
    public AtualizarController(AtualizarUsuarioFrame view, Usuario usuario) {
        this.view = view;
        this.usuario = usuario;
    }

    public AtualizarController() {
    }
    
    public String consultarCotacao(){
           Conexao conexao = new Conexao();
           
           try{
                Connection conn = conexao.getConnection();
                UsuarioDAO dao = new UsuarioDAO(conn);
                ResultSet res = dao.consultarCriptomoeda("Bitcoin");
                if(res.next()){
                    String Nome = res.getString("nome");
                    double Cotacao = res.getDouble("cotacao");
                    double TaxaComp = res.getDouble("taxacomp");
                    double TaxaVend = res.getDouble("taxavend");
                   
                    return "" + Cotacao;               
                }else{
                    JOptionPane.showMessageDialog(view, "Erro ao Consultar Criptomoedas",
                            "Erro",JOptionPane.ERROR_MESSAGE);
                }
            } catch(SQLException e){
                JOptionPane.showMessageDialog(view, "Erro de conexao",
                            "Erro",JOptionPane.ERROR_MESSAGE);
                System.out.println(e);
            }
       
      return "";
    }
    
    public double atualizarCotacao(double cotacaoAnterior){
        Random random = new Random(); 
        //double array[] = new double[1]; // 5 números serão gerados.
        double novaCotacao = 0;
    
        for (int i=0; i < 1; i++) {
                 novaCotacao = (cotacaoAnterior - (cotacaoAnterior*0.05)) + random.nextDouble((cotacaoAnterior + (cotacaoAnterior*0.05)) - (cotacaoAnterior - (cotacaoAnterior*0.05))); // Gera números aleatórios com limite 50.
                 System.out.println(novaCotacao); // Saída, são gerados 5 números.
            }
        
        return novaCotacao;
    }
    
    public double atualizarBitcoin(){        
        double novaCotacao = atualizarCotacao(bitcoin.getNovaCotacao());
        JOptionPane.showMessageDialog(view, "Cotação Atualizada",
                        "Aviso",JOptionPane.INFORMATION_MESSAGE);
        Bitcoin bitcoin = new Bitcoin("Bitcoin", novaCotacao, 0.02, 0.03);
        setNovaCotacaoBit(novaCotacao);
        return novaCotacao;
    }
    
    public String atualizarCotBit(){
           Conexao conexao = new Conexao();
           double novaCotacao = atualizarBitcoin();
           
           try{
                Connection conn = conexao.getConnection();
                UsuarioDAO dao = new UsuarioDAO(conn);
                System.out.println("Antes da Conexão 1");
                dao.atualizarCriptomoeda("Bitcoin", novaCotacao);
                System.out.println("Depois da Conexão 1");
                Connection conn1 = conexao.getConnection();
                System.out.println("Antes da Conexão 2");
                UsuarioDAO dao1 = new UsuarioDAO(conn1);
                ResultSet res = dao1.consultarCriptomoeda("Bitcoin");
                if(res.next()){
                    String Nome = res.getString("nome");
                    double Cotacao = res.getDouble("cotacao");
                    double TaxaComp = res.getDouble("taxacomp");
                    double TaxaVend = res.getDouble("taxavend");
                   
                    return "" + Cotacao;               
                }else{
                    JOptionPane.showMessageDialog(view, "Erro ao Consultar Criptomoedas",
                            "Erro",JOptionPane.ERROR_MESSAGE);
                }
            } catch(SQLException e){
                JOptionPane.showMessageDialog(view, "Erro de conexao",
                            "Erro",JOptionPane.ERROR_MESSAGE);
                System.out.println(e);
            }
       
      return "";
    }
    
    public double atualizarRipple(){
        double novaCotacao = atualizarCotacao(ripple.getNovaCotacao());
        JOptionPane.showMessageDialog(view, "Cotação Atualizada",
                        "Aviso",JOptionPane.INFORMATION_MESSAGE);
        Ripple ripple = new Ripple("Ripple", novaCotacao, 0.01, 0.01);
        return novaCotacao;
    }
    
    public String atualizarCotRip(){
           Conexao conexao = new Conexao();
           double novaCotacao = atualizarRipple();
           
           try{
                Connection conn = conexao.getConnection();
                UsuarioDAO dao = new UsuarioDAO(conn);
                dao.atualizarCriptomoeda("Ripple", novaCotacao);
 
                Connection conn1 = conexao.getConnection();
                UsuarioDAO dao1 = new UsuarioDAO(conn1);
                ResultSet res = dao1.consultarCriptomoeda("Ripple");
                if(res.next()){
                    String Nome = res.getString("nome");
                    double Cotacao = res.getDouble("cotacao");
                    double TaxaComp = res.getDouble("taxacomp");
                    double TaxaVend = res.getDouble("taxavend");
                   
                    return "" + Cotacao;               
                }else{
                    JOptionPane.showMessageDialog(view, "Erro ao Consultar Criptomoedas",
                            "Erro",JOptionPane.ERROR_MESSAGE);
                }
            } catch(SQLException e){
                JOptionPane.showMessageDialog(view, "Erro de conexao",
                            "Erro",JOptionPane.ERROR_MESSAGE);
                System.out.println(e);
            }
       
      return "";
    }
    
    public double atualizarEthereum(){
        double novaCotacao = atualizarCotacao(ethereum.getNovaCotacao());
        JOptionPane.showMessageDialog(view, "Cotação Atualizada",
                        "Aviso",JOptionPane.INFORMATION_MESSAGE);
        Ethereum ethereum = new Ethereum("Ethereum", novaCotacao, 0.01, 0.02);
        return novaCotacao;
    }
    
    public String atualizarCotEthe(){
           Conexao conexao = new Conexao();
           double novaCotacao = atualizarEthereum();
           
           try{
                Connection conn = conexao.getConnection();
                UsuarioDAO dao = new UsuarioDAO(conn);
                dao.atualizarCriptomoeda("Ethereum", novaCotacao);
 
                Connection conn1 = conexao.getConnection();
                UsuarioDAO dao1 = new UsuarioDAO(conn1);
                ResultSet res = dao1.consultarCriptomoeda("Ethereum");
                if(res.next()){
                    String Nome = res.getString("nome");
                    double Cotacao = res.getDouble("cotacao");
                    double TaxaComp = res.getDouble("taxacomp");
                    double TaxaVend = res.getDouble("taxavend");
                   
                    return "" + Cotacao;               
                }else{
                    JOptionPane.showMessageDialog(view, "Erro ao Consultar Criptomoedas",
                            "Erro",JOptionPane.ERROR_MESSAGE);
                }
            } catch(SQLException e){
                JOptionPane.showMessageDialog(view, "Erro de conexao",
                            "Erro",JOptionPane.ERROR_MESSAGE);
                System.out.println(e);
            }
       
      return "";
    }

    public double getNovaCotacaoBit() {
        return novaCotacaoBit;
    }

    public void setNovaCotacaoBit(double novaCotacaoBit) {
        this.novaCotacaoBit = novaCotacaoBit;
    }
    
    
}
