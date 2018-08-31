/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Luciene Cavalcanti
 */
public abstract class Pessoa {
    int id;
    String nome;
    public Pessoa(){
        id=0;
        nome = new String();
    }
    public abstract void mostrarDados();
    public void cadastrar(){
        
    }
}
