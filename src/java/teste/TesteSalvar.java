/*;
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import dominio.Consulta;
import persistencia.ConsultaBD;

/**
 *
 * @author nelsonfonseca
 */
public class TesteSalvar {
    public static void main(String[] args) {
        Consulta consulta = new Consulta();
        consulta.setNome("João da Silva 23");
        consulta.setCpf("123.125.421-121");
        //consulta.setDatac("20/10/2018");
        ConsultaBD.inserir(consulta);
        
        System.out.println("Cadastrado com sucesso.");
    }
    
}
