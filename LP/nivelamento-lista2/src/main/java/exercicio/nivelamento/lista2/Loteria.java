package exercicio.nivelamento.lista2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Diga um número de 0 a 10");
        Integer numeroEscolhido = leitor.nextInt();
        
        
        
        Integer numeroAleatorio = 
                ThreadLocalRandom.current().nextInt(0, 11);    
        
        int i = 0;
        while(numeroEscolhido != numeroAleatorio) {
          i++;
          
          numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 11);
          System.out.println("Número aleatório: " + numeroAleatorio);
        }
        
        if(i <= 3) {
            System.out.println("Você é muito sortudo!");
        } else if (i <= 10) {
            System.out.println("Você é sortudo");
        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar!");
        }
        
    }
        
}
