/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.Conexao;
import DAO.UsuarioDAO;
import java.security.Timestamp;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Usuario;
import view.ExtratoUsuarioFrame;

/**
 *
 * @author unifboliveira
 */
public class ExtratoController {
    private ExtratoUsuarioFrame view;
    private Usuario usuario;
    String extrato = "";

    public ExtratoController(ExtratoUsuarioFrame view, Usuario usuario) {
        this.view = view;
        this.usuario = usuario;
    }

    public ExtratoController() {
    }
    
    public void mostrarExtrato(){
        String verificaSenha = view.getPwdExtrato().getText();
        String senha = usuario.getSenha();
       
        if(senha.equals(verificaSenha)){
           String cpf = usuario.getCPF();
           String nome = usuario.getNome();
           double valor = usuario.getReais();
           double bitcoins = usuario.getBitcoin();
           double ethereums = usuario.getEthereum();
           double ripples = usuario.getRipple();
           Usuario usuario1 = new Usuario(cpf, senha, nome, valor, bitcoins, ethereums, ripples);
           extrato += "\n  Nome: " + nome + "\n  CPF: " + cpf;
           Conexao conexao = new Conexao();
           
            try{
                Connection conn = conexao.getConnection();
                UsuarioDAO dao = new UsuarioDAO(conn);
                ResultSet res = dao.consultar(usuario1);
                if(res.next()){
                    int id_investidor = res.getInt("id_investidor");
                    
                    mostrarInfo(id_investidor);
            
                }else{
                    JOptionPane.showMessageDialog(view, "Erro ao Consultar Investidor",
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
    }
    
    public void mostrarInfo(int id_investidor){
        Conexao conexao = new Conexao();
        double realAnterior = 0, bitAnterior = 0, etheAnterior = 0, ripAnterior = 0;
        String tipoTransacao = "", posOuNeg = "";
        
        try{
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            
            for(int id_extrato = 0; id_extrato <= 50; id_extrato++){
 
            ResultSet res = dao.consultarExtrato(id_investidor, id_extrato);
            if(res.next()){
                double valor = res.getDouble("valor");
                double cotacao = res.getDouble("cotacao");
                double taxa = res.getDouble("taxa");
                java.sql.Timestamp datahora = res.getTimestamp("data");
                double real = res.getDouble("real");
                double btc = res.getDouble("btc");
                double eth = res.getDouble("eth");
                double xrp = res.getDouble("xrp");
                
                if (real > realAnterior){
                    tipoTransacao = " REAL ";
                    posOuNeg = " + ";
                    realAnterior = real;
                }
                if (real < realAnterior){
                    tipoTransacao = " REAL ";
                    posOuNeg = " - ";
                    realAnterior = real;
                }
                if (btc > bitAnterior){
                    tipoTransacao = " BTC ";
                    posOuNeg = " + ";
                    bitAnterior = btc;
                }
                if (btc < bitAnterior){
                    tipoTransacao = " BTC ";
                    posOuNeg = " - ";
                    bitAnterior = btc;
                }
                if (eth > etheAnterior){
                    tipoTransacao = " ETH ";
                    posOuNeg = " + ";
                    etheAnterior = eth;
                }
                if (eth < etheAnterior){
                    tipoTransacao = " ETH ";
                    posOuNeg = " - ";
                    etheAnterior = eth;
                }
                if (xrp > ripAnterior){
                    tipoTransacao = " XRP ";
                    posOuNeg = " + ";
                    ripAnterior = xrp;
                }
                if (xrp < ripAnterior){
                    tipoTransacao = " XRP ";
                    posOuNeg = " - ";
                    ripAnterior = xrp;
                }
                
                extrato += "\n\n  " + datahora + "\t" + posOuNeg + valor + tipoTransacao +
                        "\tCT: " + cotacao + "\tTX: " + taxa + "\tREAL: " + real +
                        "\tBTC: " + btc + "\tETH: " + eth + "\tXRP: " + xrp;
            }else{
                //JOptionPane.showMessageDialog(view, "Extrato do Investidor não encontrado",
                  //      "Erro",JOptionPane.ERROR_MESSAGE);
            }
            }
            view.getTxtExtrato().setText(extrato);
        } catch(SQLException e){
            JOptionPane.showMessageDialog(view, "Erro de conexao",
                        "Erro",JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }
}
