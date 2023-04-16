/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.empresa.poo;

/**
 *
 * @author kanaiama
 */
public class Empregado {
    
    String nome;
    String cargo;
    Double salario;
    
    Double reajustarSalario (Double reajuste) {
        
        reajuste = reajuste * salario;
        
        return reajuste;
    }
    
    
}
