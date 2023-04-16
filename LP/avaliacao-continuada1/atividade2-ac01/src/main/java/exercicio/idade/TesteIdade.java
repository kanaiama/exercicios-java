/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.idade;

import java.util.Scanner;

/**
 *
 * @author kanaiama
 */
public class TesteIdade {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Idade ver = new Idade();
        
        String faixaEtaria = null;
        
        System.out.println("Diga sua idade: ");
        Integer idade = leitor.nextInt();
        
        System.out.println("Sua classificaldade é: " + 
                ver.classificaldade(idade, faixaEtaria));
    }
}
