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
public class FuncionarioData extends Conexao implements CRUD{

    @Override
    public boolean incluir(Object f) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return true;
    }

    @Override
    public boolean excluir(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return true;
    }
    
}
