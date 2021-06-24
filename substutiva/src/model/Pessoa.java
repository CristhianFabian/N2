/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author crist
 */
public abstract class Pessoa {
    
    private String nome;
    private int idade;
    
    public Pessoa(int idade, String nome){
        this.nome = nome;
        this.idade = idade;
    }
    
    public Pessoa(){
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public abstract void fazerAniversario();
    
    public abstract void fazerAniversario(int idade);
    
    
       
}
