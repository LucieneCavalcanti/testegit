/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import model.Cliente;
import model.Funcionario;

/**
 *
 * @author Luciene Cavalcanti
 */
public interface CRUD {
    public boolean incluir(Object cli);
    
    public boolean excluir(int id);
}
