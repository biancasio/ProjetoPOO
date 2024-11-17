/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Random;

/**
 *
 * @author Aline Rocha
 */
public class Ripple extends Moedas implements Tarifacao {
    
    Random random = new Random(); 
    double novaCotacao = 0;

    public Ripple(String nome, double cotacao, double taxaCompra, double taxaVenda) {
        super(nome, cotacao, taxaCompra, taxaVenda);
        
        nome = "Ripple";
        
        for (int i=0; i < 1; i++) {
                novaCotacao = random.nextDouble(5); // Gera números aleatórios com limite 5.
        }
        
        cotacao = novaCotacao;
        
        taxaCompra = 0.01;
        taxaVenda = 0.01;
    }

    public double getNovaCotacao() {
        return novaCotacao;
    }

    public void setNovaCotacao(double novaCotacao) {
        this.novaCotacao = novaCotacao;
    }
    
}