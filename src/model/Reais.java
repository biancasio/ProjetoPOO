/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Aline Rocha
 */
public class Reais extends Moedas {
    
    public Reais(String nome, double cotacao, double taxaCompra, double taxaVenda) {
        super(nome, cotacao, taxaCompra, taxaVenda);
        
        nome = "Reais";
        
        cotacao = 1;
        
        taxaCompra = 0.0;
        taxaVenda = 0.0;
    }
    
    
    
    

    
    
    
}
