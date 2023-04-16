package exercicio.avaliacao.continuada1;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Escolha a operação matemática: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        Integer operacao = sc.nextInt();
        
        
        System.out.println("Digite um número para a tabuada: ");
        Integer numero = sc.nextInt();
        
        
        for (int i = 1; i <= 10; i++) {
            int resultado;
            String operador;
            
            switch (operacao) {
                case 1:
                    resultado = numero + i;
                    operador = "+";
                    break;
                case 2:
                    resultado = numero - i;
                    operador = "-";
                    break;
                case 3:
                    resultado = numero * i;
                    operador = "*";
                    break;
                case 4:
                    resultado = numero / i;
                    operador = "/";
                    break;
                default:
                    System.out.println("Operação inválida!");
                    return;
            }
            
            System.out.printf("%d %s %d = %d\n", numero, operador, i, resultado);
        }
    }
}
