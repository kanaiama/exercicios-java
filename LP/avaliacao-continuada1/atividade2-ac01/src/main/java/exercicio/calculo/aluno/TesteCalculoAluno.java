/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicio.calculo.aluno;

import java.util.Scanner;

/**
 *
 * @author kanaiama
 */
public class TesteCalculoAluno {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        CalculoMedia calc = new CalculoMedia();
        
        System.out.println("Digite sua primeira nota: ");
        Double nota1 = leitor.nextDouble();
        
        System.out.println("Digite sua segunda nota: ");
        Double nota2 = leitor.nextDouble();
        
        System.out.println("Sua média foi de: " + calc.calcularMedia(nota1, nota2));
    }
} 
