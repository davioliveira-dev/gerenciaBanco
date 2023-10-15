/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciabanco;

import java.util.Scanner;

/**
 *
 * @author davio
 */
public class GerenciaBanco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente("Davi", "Oliveira", "75685698382");
        GerenciadorBanco gerenciadorBanco = new GerenciadorBanco();
        
        int escolha;
        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Fazer Depósito");
            System.out.println("3. Fazer Saque");
            System.out.println("4. Encerrar");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            
            switch(escolha) {
                case 1:
                    double saldo = gerenciadorBanco.consultarSaldo();
                    System.out.println("Saldo: R$" + saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser depositado: ");
                    double deposito = scanner.nextDouble();
                    gerenciadorBanco.fazerDeposito(deposito);
                    System.out.println("Depósito realizado com sucesso!");
                    break;
                case 3:
                    System.out.print("Digite o valor a ser sacado: ");
                    double saque = scanner.nextDouble();
                    gerenciadorBanco.fazerSaque(saque);
                    break;
                case 4:
                    System.out.println("Encerrando aplicação...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            
            System.out.println();
        } while(escolha != 4);
        
        scanner.close();
    }
}
