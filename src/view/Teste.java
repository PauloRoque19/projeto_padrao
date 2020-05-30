/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Aluno;
import model.Mediator;
import model.Mensagem;
import model.Pessoa;
import model.Professor;

/**
 *
 * @author Paulinho
 */
public class Teste {
    
    public static void main(String[] args) {
        
    
    //Conversa
        Mediator mt0 = new Mensagem();
    
        mt0.chat(new Aluno("Joao"), "Ola Professor Zezinho ", new Professor("Zezinho"));
     
    
    }
}
