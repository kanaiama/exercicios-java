/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.correcao.exercicio.metodo.marco;

import java.util.Scanner;

/**
 *
 * @author kanaiama
 */
public class TesteClasseSocial {
    public static void main(String[] args) {
        ClasseSocial classe = new ClasseSocial();
        Scanner leitor = new Scanner(System.in);
        
        
        System.out.println("Digite sua renda: ");
        Double rendaDigitada = leitor.nextDouble();
        
        
        Double qtdSalario = 
                classe.calcularQtdSalario(rendaDigitada);
        
        String classeSocial = 
                classe.classificarClasseSocial(qtdSalario);
        
//        System.out.println(String.format(
//                "Você recebe aproximadamente %.1f salários-mínimos.",
//                qtdSalario));
//        
//        System.out.println(String.format(
//                "Você pertence a classe social %s", classeSocial));

        classe.exibirRelatorioClasseSocial(rendaDigitada);
    }
}
