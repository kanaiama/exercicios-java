/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.rh;

import java.util.Scanner;

/**
 *
 * @author kanaiama
 */
public class TesteColaborador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do colaborador 01: ");
        String nomeColab1 = leitor.nextLine();
        
        Colaborador colab1 = new Colaborador
        (nomeColab1, "Estagiario", 3000.0 );
   
        
        Colaborador colab2 = new Colaborador
        ("Didi", "Pleno", 200.0 );
 
        RecursosHumanos rh = new RecursosHumanos();
        
        rh.reajustarSalario(colab1, 500.0);
        
        System.out.println(colab1);
        System.out.println(colab2);
        
        System.out.println(rh);
        
        System.out.println("");
        rh.promoverColaborador(colab1, "Junior", 4000.0);
        rh.promoverColaborador(colab2, "Gerente", 1000.0);
        
        
     
    }
}
