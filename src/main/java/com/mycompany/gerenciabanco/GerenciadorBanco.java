/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciabanco;

/**
 *
 * @author davio
 */
public class GerenciadorBanco {
    private double saldo;
    
    // Construtor
    public GerenciadorBanco() {
        saldo = 0.0;
    }
    
    // Método para consultar saldo
    public double consultarSaldo() {
        return saldo;
    }
    
    // Método para fazer depósito
    public void fazerDeposito(double valor) {
        saldo += valor;
    }
    
    // Método para fazer saque
    public void fazerSaque(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
