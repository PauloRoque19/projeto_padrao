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
public class Mensagem implements Mediator{

    @Override
    public void chat(Pessoa r, String assunto , Pessoa d) {
        System.out.println("Nome Remetente: "+r.nome + " Mensagem: " + assunto + "Nome Destinatário: "+ d.nome);
    }
    
    
    
}
