package exercicio.nivelamento.lista2;

import java.util.Scanner;

public class Acumulador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
    
        Integer numeroDigitado;
        Integer soma = 0;
        
        do {
            System.out.println("Digite um número:");
            numeroDigitado = leitor.nextInt();
            soma += numeroDigitado;
        }while (numeroDigitado != 0);
        
        System.out.println("A soma dos números digitados foi: " + soma);
    }
}
