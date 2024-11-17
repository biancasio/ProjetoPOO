/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author unifboliveira
 */
public class Usuario {
    String CPF, senha, nome;
    double reais, bitcoin, ethereum, ripple;

    public Usuario() {
    }

    public Usuario(String CPF, String senha, String nome, double reais, double bitcoin, double ethereum, double ripple) {
        this.CPF = CPF;
        this.senha = senha;
        this.nome = nome;
        this.reais = reais;
        this.bitcoin = bitcoin;
        this.ethereum = ethereum;
        this.ripple = ripple;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getReais() {
        return reais;
    }

    public void setReais(double reais) {
        this.reais = reais;
    }

    public double getBitcoin() {
        return bitcoin;
    }

    public void setBitcoin(double bitcoin) {
        this.bitcoin = bitcoin;
    }

    public double getEthereum() {
        return ethereum;
    }

    public void setEthereum(double ethereum) {
        this.ethereum = ethereum;
    }

    public double getRipple() {
        return ripple;
    }

    public void setRipple(double ripple) {
        this.ripple = ripple;
    }

}
