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
public class Funcionario extends Pessoa{
    float salario;
    public void mostrarDados() {
        System.out.println("Dados do funcionário:\nNome:"+nome+
                "\nid:"+id + "\nSalário:"+salario);
    }
}
