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
public class PF extends Pessoa{
    
    public PF(){
        super();
    }
    
    public String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public PF(int idade, String nome, String cpf){
        
       super(idade, nome);
       this.cpf = cpf;
    }   
    

    @Override
    public void fazerAniversario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fazerAniversario(int idade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
