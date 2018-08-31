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
public class Cliente extends Pessoa{
    String cpf;

    @Override
    public void mostrarDados() {
        System.out.println("Dados do cliente:\nNome:"+nome+
                "\nid:"+id + "\nCPF:"+cpf);
    }
}
