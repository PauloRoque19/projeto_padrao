/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Paulinho
 */
public class Aluno extends Pessoa{
    
    protected Mediator mediator;
    
    
    public Aluno(String nome) {
        super(nome);
        
    }

    @Override
    public String toString() {
        return "Aluno{" + super.nome+'}';
    }

  
    public Mediator receberMensagem(Mediator mediator){
        return mediator;
    }
    
    
}
