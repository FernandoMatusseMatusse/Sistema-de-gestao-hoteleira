/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import Control.FuncionarioDAO;
import Model.Funcionario;

/**
 *
 * @author FMatusse
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              Funcionario f=new Funcionario();
        f.setCargo("Administrador");
        f.setData_Nascimento("25/02/1975");
        f.setDocumento_Identificacao("B.I");
        f.setMorada("Matola");
        f.setNome("Fernando");
        f.setNumero_Documento("asutdasf444");
        f.setSalario(85656.09);
        f.setSenha("1234");
        f.setSexo("Masculino");
        f.setTelefone("(+258)");
        f.setUsuario("Matusse");
       
     FuncionarioDAO d= new FuncionarioDAO();
     d.Remover(f);
    }
    
}
