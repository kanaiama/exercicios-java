package exercicio.lista.de.inteiro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaInteiro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        List<Integer> numerosInteiros = new ArrayList();
        
   
        System.out.println("Digite números inteiros. Digite 0 para encerrar");
        while(true) {
            Integer numeroDigitado = leitor.nextInt();    
            if(numeroDigitado == 0 ) {
                break;
            } else {
                numerosInteiros.add(numeroDigitado);
            }
        }
        
        System.out.println("==============");
        
        System.out.println("Números pares: ");
        
        for (int i = 0; i < numerosInteiros.size(); i++) {
            Integer numeroAtual = numerosInteiros.get(i);
            if(numeroAtual % 2 == 0) {
                System.out.println(
                    String.format("%d", numeroAtual));
            }
        }
        
        System.out.println("==============");
        
        System.out.println("Números ímpares: ");
        
        for (int i = 0; i < numerosInteiros.size(); i++) {
            Integer numeroAtual = numerosInteiros.get(i);
            if(numeroAtual % 2 == 1) {
                System.out.println(
                    String.format("%d", numeroAtual));
            }
        }
        
        System.out.println("==============");
        
        System.out.println("Soma total: ");
        Integer somaTotal = 0;
        
        for (Integer numeroAtual: numerosInteiros) {
            somaTotal += numeroAtual;
        }
            
        System.out.println(String.format("%d", somaTotal));

        System.out.println("==============");
        
        System.out.println("Menor número da lista: ");
        
        Integer numeroMenor = numerosInteiros.get(0);
        
        for (Integer numeroAtual: numerosInteiros) {
           if(numeroAtual < numeroMenor) {
               numeroMenor = numeroAtual;
           }
        }
        
        System.out.println(String.format("%d", numeroMenor));
        
        System.out.println("==============");
        
        System.out.println("Maior número da lista: ");
        
        Integer numeroMaior = numerosInteiros.get(0);
        
        for (Integer numeroAtual: numerosInteiros) {
           if(numeroAtual > numeroMaior) {
               numeroMaior = numeroAtual;
           }
        }
        
        System.out.println(String.format("%d", numeroMaior));
        
    }
}
