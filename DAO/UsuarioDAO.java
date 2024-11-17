/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.security.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import model.Bitcoin;
import model.Ethereum;
import model.Moedas;
import model.Ripple;
import model.Usuario;
import static org.postgresql.core.Oid.TIMESTAMP;

/**
 *
 * @author unifboliveira
 */
public class UsuarioDAO {
   private Connection conn;

    public UsuarioDAO(Connection conn) {
        this.conn = conn;
    }
    
    public ResultSet consultar(Usuario usuario) throws SQLException{
        //Este Comando é vulneravel
//        String sql = "select * from aluno where usuario = '"
//                + aluno.getUsuario() + "' AND senha = '"
//                + aluno.getSenha() + "'";
        String sql = "select * from investidor where cpf = ? AND senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuario.getCPF());
        statement.setString(2, usuario.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    public ResultSet consultarExtrato(int id_investidor, int id_extrato) throws SQLException{
        //Este Comando é vulneravel
//        String sql = "select * from aluno where usuario = '"
//                + aluno.getUsuario() + "' AND senha = '"
//                + aluno.getSenha() + "'";
        String sql = "select * from extrato where id_investidor = ? AND id_extrato = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, id_investidor);
        statement.setInt(2, id_extrato);
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    public ResultSet consultarCriptomoeda(String nome) throws SQLException{
        //Este Comando é vulneravel
//        String sql = "select * from aluno where usuario = '"
//                + aluno.getUsuario() + "' AND senha = '"
//                + aluno.getSenha() + "'";
        String sql = "select * from criptomoedas where nome = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, nome);
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    public ResultSet consultarTodasCripto() throws SQLException{
        //Este Comando é vulneravel
//        String sql = "select * from aluno where usuario = '"
//                + aluno.getUsuario() + "' AND senha = '"
//                + aluno.getSenha() + "'";
        String sql = "select * from criptomoedas where nome = 'Bitcoin' OR nome = 'Ripple' OR nome = 'Ethereum'";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    
    public ResultSet consultarSaldo(Usuario usuario) throws SQLException{
        //Este Comando é vulneravel
//        String sql = "select * from aluno where usuario = '"
//                + aluno.getUsuario() + "' AND senha = '"
//                + aluno.getSenha() + "'";
        String sql = "select * from investidor where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuario.getCPF());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    public ResultSet consultarTransacao(String Cpf) throws SQLException{
        //Este Comando é vulneravel
//        String sql = "select * from aluno where usuario = '"
//                + aluno.getUsuario() + "' AND senha = '"
//                + aluno.getSenha() + "'";
        String sql = "select * from investidor where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, Cpf);
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    public void inserir(Usuario usuario) throws SQLException{
        String sql = "insert into investidor (cpf, senha, nome) values('"
                + usuario.getCPF() + "', '"
                + usuario.getSenha() + "', '"
                + usuario.getNome() + "')";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
    
    public void inserirExtrato(Usuario usuario, double valor, int id_investidor) throws SQLException{            
        String sql = "insert into extrato (id_investidor, valor, cotacao, taxa, real, btc, eth, xrp) values('"
                + id_investidor + "', '"
                + valor + "', '"
                + 0.0 + "', '"
                + 0.0 + "', '"
                + usuario.getReais() + "', '"
                + usuario.getBitcoin()+ "', '"
                + usuario.getEthereum()+ "', '"
                + usuario.getRipple() + "')";
        
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
    
    public void inserirExtBit(Usuario usuario, Bitcoin bitcoin, double valor, double cotacao, int id_investidor) throws SQLException{            
        String sql = "insert into extrato (id_investidor, valor, cotacao, taxa, real, btc, eth, xrp) values('"
                + id_investidor + "', '"
                + valor + "', '"
                + cotacao + "', '"
                + bitcoin.getTaxaCompra() + "', '"
                + usuario.getReais() + "', '"
                + usuario.getBitcoin()+ "', '"
                + usuario.getEthereum()+ "', '"
                + usuario.getRipple() + "')";
        
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
    
    public void inserirExtEthe(Usuario usuario, Ethereum ethereum, double valor, double cotacao, int id_investidor) throws SQLException{            
        String sql = "insert into extrato (id_investidor, valor, cotacao, taxa, real, btc, eth, xrp) values('"
                + id_investidor + "', '"
                + valor + "', '"
                + cotacao + "', '"
                + ethereum.getTaxaCompra() + "', '"
                + usuario.getReais() + "', '"
                + usuario.getBitcoin()+ "', '"
                + usuario.getEthereum()+ "', '"
                + usuario.getRipple() + "')";
        
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
    
    public void inserirExtRip(Usuario usuario, Ripple ripple, double valor, double cotacao, int id_investidor) throws SQLException{            
        String sql = "insert into extrato (id_investidor, valor, cotacao, taxa, real, btc, eth, xrp) values('"
                + id_investidor + "', '"
                + valor + "', '"
                + cotacao + "', '"
                + ripple.getTaxaCompra() + "', '"
                + usuario.getReais() + "', '"
                + usuario.getBitcoin()+ "', '"
                + usuario.getEthereum()+ "', '"
                + usuario.getRipple() + "')";
        
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
    
    public void retirarExtBit(Usuario usuario, Bitcoin bitcoin, double valor, double cotacao, int id_investidor) throws SQLException{            
        String sql = "insert into extrato (id_investidor, valor, cotacao, taxa, real, btc, eth, xrp) values('"
                + id_investidor + "', '"
                + valor + "', '"
                + cotacao + "', '"
                + bitcoin.getTaxaVenda() + "', '"
                + usuario.getReais() + "', '"
                + usuario.getBitcoin()+ "', '"
                + usuario.getEthereum()+ "', '"
                + usuario.getRipple() + "')";
        
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
    
    public void retirarExtEthe(Usuario usuario, Ethereum ethereum, double valor, double cotacao, int id_investidor) throws SQLException{            
        String sql = "insert into extrato (id_investidor, valor, cotacao, taxa, real, btc, eth, xrp) values('"
                + id_investidor + "', '"
                + valor + "', '"
                + cotacao + "', '"
                + ethereum.getTaxaVenda() + "', '"
                + usuario.getReais() + "', '"
                + usuario.getBitcoin()+ "', '"
                + usuario.getEthereum()+ "', '"
                + usuario.getRipple() + "')";
        
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
    
    public void retirarExtRip(Usuario usuario, Ripple ripple, double valor, double cotacao, int id_investidor) throws SQLException{            
        String sql = "insert into extrato (id_investidor, valor, cotacao, taxa, real, btc, eth, xrp) values('"
                + id_investidor + "', '"
                + valor + "', '"
                + cotacao + "', '"
                + ripple.getTaxaVenda() + "', '"
                + usuario.getReais() + "', '"
                + usuario.getBitcoin()+ "', '"
                + usuario.getEthereum()+ "', '"
                + usuario.getRipple() + "')";
        
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
    
    public void atualizar(Usuario usuario) throws SQLException{
        String sql = "update investidor set senha = ? where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuario.getSenha());
        statement.setString(2, usuario.getCPF());
        statement.execute();
        conn.close();
    }
    
    public void atualizarCriptomoeda(String nome, double cotacao) throws SQLException{
        String sql = "update criptomoedas set cotacao = ? where nome = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, cotacao);
        statement.setString(2, nome);
        statement.execute();
        conn.close();
    }
    
    public void comprarBitcoin(Usuario usuario) throws SQLException{
        String sql = "update investidor set bitcoin = ? where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, usuario.getBitcoin());
        statement.setString(2, usuario.getCPF());
        statement.execute();
        conn.close();
    }
    
    public void comprarEthereum(Usuario usuario) throws SQLException{
        String sql = "update investidor set ethereum = ? where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, usuario.getEthereum());
        statement.setString(2, usuario.getCPF());
        statement.execute();
        conn.close();
    }
    
    public void comprarRipple(Usuario usuario) throws SQLException{
        String sql = "update investidor set ripple = ? where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, usuario.getRipple());
        statement.setString(2, usuario.getCPF());
        statement.execute();
        conn.close();
    }
    
    public void venderBitcoin(Usuario usuario) throws SQLException{
        String sql = "update investidor set bitcoin = ? where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, usuario.getBitcoin());
        statement.setString(2, usuario.getCPF());
        statement.execute();
        conn.close();
    }
    
    public void venderEthereum(Usuario usuario) throws SQLException{
        String sql = "update investidor set ethereum = ? where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, usuario.getEthereum());
        statement.setString(2, usuario.getCPF());
        statement.execute();
        conn.close();
    }
    
    public void venderRipple(Usuario usuario) throws SQLException{
        String sql = "update investidor set ripple = ? where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, usuario.getRipple());
        statement.setString(2, usuario.getCPF());
        statement.execute();
        conn.close();
    }
    
    public void atualizarDeposito(Usuario usuario, double saldo) throws SQLException{
        String sql = "update investidor set saldo = ? where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, saldo);
        statement.setString(2, usuario.getCPF());
        try{
            statement.execute();
        } catch(Exception e){
            e.printStackTrace();
            System.out.println(e);
        }
        conn.close();
    }
    
    public void atualizarSaque(Usuario usuario, double saldo) throws SQLException{
        String sql = "update investidor set saldo = ? where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, saldo);
        statement.setString(2, usuario.getCPF());
        try{
            statement.execute();
        } catch(Exception e){
            e.printStackTrace();
            System.out.println(e);
        }
        conn.close();
    }
    
    public void excluir(Usuario usuario) throws SQLException{
        String sql = "delete from investidor where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuario.getCPF());
        statement.execute();
        conn.close();
    } 
}
