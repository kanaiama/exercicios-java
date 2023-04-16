package exercicio.avaliacao.continuada1;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer opcao = -1;
        Integer num;
        Integer resultado = 0;
        
        while (opcao != 0) {
            System.out.println("Digite o número correspondente a operação desejada:");
            System.out.println("1 - Soma");
            System.out.println("2 - Multiplicação");
            System.out.println("3 - Divisão");
            System.out.println("4 - Subtração");
            System.out.println("0 - Sair");
            
            opcao = leitor.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Digite um número inteiro:");
                    num = leitor.nextInt();
                    resultado += num;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    System.out.println("Digite um número inteiro:");
                    num = leitor.nextInt();
                    resultado *= num;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    System.out.println("Digite um número inteiro:");
                    num = leitor.nextInt();
                    resultado /= num;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    System.out.println("Digite um número inteiro:");
                    num = leitor.nextInt();
                    resultado -= num;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 0:
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}
