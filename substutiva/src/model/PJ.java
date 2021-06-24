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
public class PJ extends Pessoa{
    
    private String cnpj;
    
    public PJ(){
        super();
    }

    public PJ(int idade, String nome, String cnpj){
        
       super(idade, nome);
       this.cnpj = cnpj;
    }   
    
    @Override
    public void fazerAniversario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fazerAniversario(int idade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
