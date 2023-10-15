/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciabanco;

/**
 *
 * @author davio
 */
public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;
    
    // Construtor
    public Cliente(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }
    
    // Métodos de acesso
    public String getNome() {
        return nome;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    // Métodos de modificação
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
