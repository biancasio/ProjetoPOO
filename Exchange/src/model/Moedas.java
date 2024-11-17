/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Aline Rocha
 */
public class Moedas {
    private String nome;
    private double cotacao, taxaCompra, taxaVenda;

    public Moedas(String nome, double cotacao, double taxaCompra, double taxaVenda) {
        this.nome = nome;
        this.cotacao = cotacao;
        this.taxaCompra = taxaCompra;
        this.taxaVenda = taxaVenda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCotacao() {
        return cotacao;
    }

    public void setCotacao(double cotacao) {
        this.cotacao = cotacao;
    }

    public double getTaxaCompra() {
        return taxaCompra;
    }

    public void setTaxaCompra(double taxaCompra) {
        this.taxaCompra = taxaCompra;
    }

    public double getTaxaVenda() {
        return taxaVenda;
    }

    public void setTaxaVenda(double taxaVenda) {
        this.taxaVenda = taxaVenda;
    }
   
    
}
