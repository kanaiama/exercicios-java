/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.empresa.poo;

/**
 *
 * @author kanaiama
 */
public class TesteEmpregado {
    public static void main(String[] args) {
        
        Empregado empregado01 = new Empregado();
        empregado01.nome = "João";
        empregado01.salario = 5.400;
        empregado01.cargo = "Analista de sistemas";
        
        Double salarioReajustado = empregado01.salario +
                empregado01.reajustarSalario(0.15);
        
        System.out.println(String.format("O seu nome é %s, seu cargo é"
                + " de %s e seu salário reajustado é de %.4f",
                empregado01.nome, empregado01.cargo,
                salarioReajustado));
    }
}
