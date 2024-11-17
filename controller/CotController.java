/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.AdminDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.JOptionPane;
import model.Admin;
import model.Bitcoin;
import model.Ethereum;
import model.Ripple;
import view.CotAdminFrame;

/**
 *
 * @author Aline Rocha
 */
public class CotController {
    private CotAdminFrame view;
    private Admin admin;
    private Bitcoin bitcoin;
    private Ripple ripple;
    private Ethereum ethereum;
    private double novaCotacaoBit = 5;

    public CotController(CotAdminFrame view, Admin admin) {
        this.view = view;
        this.admin = admin;
    }

    public CotController() {
    }
    
    public CotController(CotAdminFrame view, Admin admin, Bitcoin bitcoin, Ripple ripple, Ethereum ethereum) {
        this.view = view;
        this.admin = admin;
        this.bitcoin = bitcoin;
        this.ripple = ripple;
        this.ethereum = ethereum;
    }

    public CotController(Bitcoin bitcoin, Ripple ripple, Ethereum ethereum) {
        this.bitcoin = bitcoin;
        this.ripple = ripple;
        this.ethereum = ethereum;
    }
    
    public String consultarCotacao(){
           Conexao conexao = new Conexao();
           
           try{
                Connection conn = conexao.getConnection();
                AdminDAO dao = new AdminDAO(conn);
                ResultSet res = dao.consultarCripto("Bitcoin");
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
        try{
        double novaCotacao = atualizarCotacao(bitcoin.getNovaCotacao());
        JOptionPane.showMessageDialog(view, "Cotação Atualizada",
                        "Aviso",JOptionPane.INFORMATION_MESSAGE);
        Bitcoin bitcoin = new Bitcoin("Bitcoin", novaCotacao, 0.02, 0.03);
        setNovaCotacaoBit(novaCotacao);
        return novaCotacao;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return 0;
    }
    
    public String atualizarCotBit(){
           Conexao conexao = new Conexao();
           double novaCotacao = atualizarBitcoin();
           
           try{
                Connection conn = conexao.getConnection();
                AdminDAO dao = new AdminDAO(conn);
                System.out.println("Antes da Conexão 1");
                dao.atualizarCriptomoeda("Bitcoin", novaCotacao);
                System.out.println("Depois da Conexão 1");
                Connection conn1 = conexao.getConnection();
                System.out.println("Antes da Conexão 2");
                AdminDAO dao1 = new AdminDAO(conn1);
                ResultSet res = dao1.consultarCripto("Bitcoin");
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
                AdminDAO dao = new AdminDAO(conn);
                dao.atualizarCriptomoeda("Ripple", novaCotacao);
 
                Connection conn1 = conexao.getConnection();
                AdminDAO dao1 = new AdminDAO(conn1);
                ResultSet res = dao1.consultarCripto("Ripple");
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
                AdminDAO dao = new AdminDAO(conn);
                dao.atualizarCriptomoeda("Ethereum", novaCotacao);
 
                Connection conn1 = conexao.getConnection();
                AdminDAO dao1 = new AdminDAO(conn1);
                ResultSet res = dao1.consultarCripto("Ethereum");
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
