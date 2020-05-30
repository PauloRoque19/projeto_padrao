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
public class Professor extends Pessoa{
    
    protected Mediator mediator;
    
    
    public Professor(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return "Professor{" + super.nome +'}';
    }
    
    public Mediator receberMensagem(Mediator mediator){
        return mediator;
    }
    
}
