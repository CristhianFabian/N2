package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Pessoa;

public class Cadastro {

    public static void main(String[] args) {
        
        String opcao = "s";
        
        List<Pessoa> listaPessoa = new ArrayList<>();
        
        while ( ! opcao.equalsIgnoreCase ("n")){
            String texto = "Digite sua opção: \n" + 
                           "1 - Cadastrar Pessoa \n" + 
                           "2 - Incrementar Idade \n" + 
                           "3 - Listar Pessoa \n" + 
                           "4 - Sair ";
            opcao = JOptionPane.showInputDialog(texto);
            
            switch(opcao){
                case "1":
                    String texto = "Digite a opção: \n" +
                                    "1 - Pessoa Fisica\n" +
                                    "2 - Pessoa Juridica\n";
            }
        
        }
    }
    
}
