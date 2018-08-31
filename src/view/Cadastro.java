/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import data.ClienteData;
import data.FuncionarioData;
import model.Cliente;
import model.Funcionario;
import model.Pessoa;

/**
 *
 * @author Luciene Cavalcanti
 */
public class Cadastro {
    public static void main(String[] args) {
        Cliente cli = new Cliente();
        Funcionario fun = new Funcionario();
        Pessoa p;// = new Pessoa();
        cli.mostrarDados();
        fun.mostrarDados();
//        p.mostrarDados();
        ClienteData DAOC = new ClienteData();
        FuncionarioData DAOF = new FuncionarioData();
        DAOC.incluir(cli);
        DAOF.incluir(fun);
    }
    
}
