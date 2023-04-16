package exercicio.nivelamento.lista2;

import java.util.Scanner;

public class NumeroImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        for (int i = 0; i <= 80; i++) {
            if((i % 2) == 1) {
                System.out.println(i);
            }
        }
    }
}
